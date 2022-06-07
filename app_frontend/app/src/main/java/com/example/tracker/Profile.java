package com.example.tracker;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tracker.model.Student;
import com.example.tracker.model.Tuteur;
import com.example.tracker.retrofitService.RetrofitService;
import com.example.tracker.retrofitService.TuteurApi;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Profile extends AppCompatActivity {


    TextView tuteurName;
    TextView tuteurNumberphone;
    TextView tuteurUserName;

    private RecyclerView recyclerView;
    private List<Student> listEnfants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile2);

        tuteurName=findViewById(R.id.textView_tuteur_name);
        tuteurUserName=findViewById(R.id.textView_tutuer_userName);
        tuteurNumberphone=findViewById(R.id.textView_tuteur_number_phone);

        //get the object tuteut sent from previous activity HomeMenu

        Tuteur tuteur=(Tuteur)getIntent().getSerializableExtra("tuteurProfile");

        tuteurName.setText(tuteur.getUserName());
        tuteurUserName.setText(tuteur.getUserName());
        tuteurNumberphone.setText(tuteur.getNumberPhone());

    }

}