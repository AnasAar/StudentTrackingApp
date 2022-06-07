package com.example.tracker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tracker.model.Classe;
import com.example.tracker.retrofitService.ClasseApi;
import com.example.tracker.retrofitService.RetrofitService;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.logging.Level;
import java.util.logging.Logger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AjoutClasseAdmin extends AppCompatActivity {

    private TextInputEditText nbrEtudiants;
    private TextInputEditText nomClasse;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ajout_classe_form);


        nbrEtudiants=findViewById(R.id.textedit_nombre_etud);
        nomClasse=findViewById(R.id.textedit_nom_classe);
        button=findViewById(R.id.button_ajoute_classe);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameClasse=String.valueOf(nomClasse.getText());
                Logger.getLogger(AjoutClasseAdmin.class.getName()).log(Level.SEVERE,nameClasse);
                String nbrEtdString=String.valueOf(nbrEtudiants.getText());

                RetrofitService retrofitService=new RetrofitService();
                ClasseApi classeApi=retrofitService.getRetrofit().create(ClasseApi.class);

                int nbrText=0;
                try {
                    nbrText=Integer.parseInt(nbrEtdString);
                }catch(Exception e){

                }

                Classe classe=new Classe();
                classe.setNbr_Etudiants(nbrText);
                classe.setNom(nameClasse);

                Logger.getLogger(AjoutClasseAdmin.class.getName()).log(Level.SEVERE,classe.getNom());

                classeApi.save(classe).enqueue(new Callback<Classe>() {
                    @Override
                    public void onResponse(Call<Classe> call, Response<Classe> response) {
                        Toast.makeText(AjoutClasseAdmin.this,"succes",Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<Classe> call, Throwable t) {

                        Toast.makeText(AjoutClasseAdmin.this,"failure ",Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}