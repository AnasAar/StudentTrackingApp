package com.example.tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class AjoutEtudiantClasse extends AppCompatActivity {



    String[] classes = {"1A-1","1A-2","2A-1","2A-2"};
    AutoCompleteTextView autoCompleteText ;
    ArrayAdapter<String> adapterItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ajout_etudiant_admin);
        adapterItems = new ArrayAdapter<String>(this, R.layout.dropdown_item,classes);
        autoCompleteText = findViewById(R.id.autoCompleteTextView);
        autoCompleteText.setAdapter(adapterItems);
        autoCompleteText.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String classe = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),"Classe"+classe,Toast.LENGTH_SHORT);
            }
        });


    }
}