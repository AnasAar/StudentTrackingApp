package com.example.tracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.tracker.model.Student;
import com.example.tracker.model.Tuteur;

import java.util.List;

public class HomeMenu extends AppCompatActivity {
    CardView CardProfile;
    CardView CardKids;
    CardView CardDates;
    CardView CardMessagerie;
    CardView CardComplaint;
    CardView CardLogOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_menu);
        CardProfile = findViewById(R.id.cardProfile);
        CardKids = findViewById(R.id.cardEnfants);
        CardDates = findViewById(R.id.cardDates);
        CardLogOut = findViewById(R.id.cardLogout);
        CardMessagerie = findViewById(R.id.cardMessagerie);
        CardComplaint = findViewById(R.id.cardPlainte);

        //we get the object tuteur
        //to send it with its data to each activity
        Tuteur tuteur =(Tuteur) getIntent().getSerializableExtra("tuteurInfo");
        if(tuteur==null){
            Toast.makeText(this, "loadinf error", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent profileIntent = new Intent(this, Profile.class);
            profileIntent.putExtra("tuteurProfile", tuteur);

            CardProfile.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(profileIntent);
                }
            });

            // this shows the list of children
            List<Student> children = tuteur.getEnfants();
            Intent kidsIntent = new Intent(this, Mes_enfants_Activity.class);
            kidsIntent.putExtra("kidsList", kidsIntent);
            CardKids.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(kidsIntent);
                }
            });

            Intent datesIntent = new Intent(this, Devoirs_general.class);

            CardDates.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(datesIntent);
                }
            });

            Intent messageIntent = new Intent(this, MessagerieMenu.class);

            CardMessagerie.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(messageIntent);
                }
            });

            Intent complaintIntent = new Intent(this, MainActivity.class);
            CardComplaint.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(complaintIntent);
                }
            });

            Intent logoutIntent = new Intent(this, MainActivity.class);
            CardLogOut.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(logoutIntent);
                }
            });
        }
    }
}
