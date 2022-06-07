package com.example.tracker;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Devoirs_general extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Devoir_general> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dates);
        list=new ArrayList<>();

        String[] matieres = {"Geo","Maths","Francais"};
        String[] DATES = {"Echéance le 18/02/2023","Echéance le 19/02/2023","Echéance le 20/02/2023"};
        String[] Enfants = {"Yassin ","Ahmed"};

        //populateDevList(matieres, DATES);

        recyclerView = findViewById(R.id.recyclerview);
        populateDevList(matieres,DATES,Enfants);
        recyclerAdapter_devoir_general adapter = new recyclerAdapter_devoir_general(this);
        adapter.setDevoirList_general(list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void populateDevList(String[] matiere, String[] date, String[] enfants){

        list.add(new Devoir_general(matiere[0], date[0], enfants[0]));
        list.add(new Devoir_general(matiere[1], date[1], enfants[1]));
        list.add(new Devoir_general(matiere[2], date[2], enfants[0]));
    }
}
