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

public class MessagerieMenu extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Message> listMessages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.messagerie);
        listMessages=new ArrayList<>();

        String[] Noms = {"Mr Samihi","Mme Hakimi"};
        String[] Dates = {"18/01/2020 19:00","19/01/2022 04:00"};

        populateEnfList(Noms,Dates);

        recyclerView = findViewById(R.id.recyclerview);

        recyclerAdapter_messages adapter = new recyclerAdapter_messages(this);
        adapter.setMessageList_general(listMessages);
        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


    public void populateEnfList(String[] Noms, String[] Dates){

        listMessages.add(new Message(Noms[0], Dates[0]));
        listMessages.add(new Message(Noms[1], Dates[1]));

    }}