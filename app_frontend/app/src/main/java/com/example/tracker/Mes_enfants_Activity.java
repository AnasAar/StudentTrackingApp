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

import com.example.tracker.model.Student;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Mes_enfants_Activity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Student> listEnfants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mes_enfants);

        listEnfants=new ArrayList<>();
        listEnfants=(ArrayList<Student>) getIntent().getSerializableExtra("kidsList");

        if(listEnfants==null){
            Toast.makeText(this, "error loading", Toast.LENGTH_SHORT).show();
        }
        else {
            recyclerView = findViewById(R.id.recyclerview);

            recyclerAdapter_enfants adapter = new recyclerAdapter_enfants(this);
            adapter.setEnfantList_general(listEnfants);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
    }

}
