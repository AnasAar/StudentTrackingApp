package com.example.tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.ipsec.ike.TunnelModeChildSessionParams;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tracker.model.Tuteur;
import com.example.tracker.model.User;
import com.example.tracker.retrofitService.RetrofitService;
import com.example.tracker.retrofitService.TuteurApi;
import com.example.tracker.retrofitService.UserApi;

import java.util.logging.Level;
import java.util.logging.Logger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private EditText emailInput;
    private EditText passwordInput;
    Button submitbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        emailInput=findViewById(R.id.TextInputemail);
        passwordInput=findViewById(R.id.TextInputPassword);
        submitbtn=findViewById(R.id.connectbutton);

        Intent tuteurIntent=new Intent(MainActivity.this,HomeMenu.class);
        RetrofitService retrofitService=new RetrofitService();
        UserApi userApi=retrofitService.getRetrofit().create(UserApi.class);
        TuteurApi tuteurApi=retrofitService.getRetrofit().create(TuteurApi.class);
        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String email=emailInput.getText().toString();
                String password=passwordInput.getText().toString();
                userApi.getUser(email,password).enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {
                        User user=response.body();
                        String role=user.getRole();

                        // when we get response
                        // we check if it is a tuteur of a prof
                        // then we get send another request to get all info

                        if(role.equals("tuteur")){
                            tuteurApi.getTuteurInfo(email).enqueue(new Callback<Tuteur>() {
                                @Override
                                public void onResponse(Call<Tuteur> call, Response<Tuteur> response) {
                                    tuteurIntent.putExtra("tuteurInfo",response.body());
                                    startActivity(tuteurIntent);
                                }

                                @Override
                                public void onFailure(Call<Tuteur> call, Throwable t) {
                                    Toast.makeText(MainActivity.this,"could not load info",Toast.LENGTH_SHORT).show();
                                }
                            });
                        }

                        if(role.equals("professeur")){
                            // we send a profApi request
                            // to be created later
                            Toast.makeText(MainActivity.this,"this is a prof",Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t) {
                        //Toast.makeText(MainActivity.this,"please check your internet",Toast.LENGTH_SHORT).show();
                        Toast.makeText(MainActivity.this, ""+t.getMessage(), Toast.LENGTH_SHORT).show();
                        Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE,""+t.toString());
                    }
                });
            }
        });
    }
}