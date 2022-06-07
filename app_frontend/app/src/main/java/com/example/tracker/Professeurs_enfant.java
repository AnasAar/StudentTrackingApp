package com.example.tracker;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Professeurs_enfant extends AppCompatActivity {


    private RecyclerView recyclerView;
    private ArrayList<Professeur> listProfesseurs;
    private static final String PROFS_LIST = "profs";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.professeur_enfant);
        listProfesseurs = new ArrayList<>();

        listProfesseurs=(ArrayList<Professeur>) getIntent().getSerializableExtra("PROFS_LIST");
        if(listProfesseurs==null){
            Toast.makeText(this, "loading error", Toast.LENGTH_SHORT).show();
        }else{
            recyclerView = findViewById(R.id.recyclerview);

            recyclerAdapter_profs adapter = new recyclerAdapter_profs(this);

            adapter.setProfesseurList_general(listProfesseurs);
            recyclerView.setAdapter(adapter);

            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
    }
}