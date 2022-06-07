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

public class Devoirs extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Devoir> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.devoirs_enfants);
        list=new ArrayList<>();
        list=(ArrayList<Devoir>)getIntent().getSerializableExtra("DEVOIRS_LIST");
        if(list==null){
            Toast.makeText(this, "there is no homework", Toast.LENGTH_SHORT).show();
        }
        else{
            recyclerView = findViewById(R.id.recyclerview);
            recyclerAdapter adapter = new recyclerAdapter(this);
            adapter.setDevoirList(list);
            recyclerView.setAdapter(adapter);

            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
    }

}
