package com.example.tracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tracker.model.Absence;
import com.example.tracker.model.Note;
import com.example.tracker.model.Student;

import java.io.Serializable;
import java.util.List;

public class MenuEnfant extends AppCompatActivity {

    private TextView studentName,studentClasse;
    private Button accessDevoir,accessAbsences,accessNotes,accessProfs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_enfant);

        Student student=(Student) getIntent().getSerializableExtra("STUDENT_INFO");

        studentName=findViewById(R.id.NomEtudiant);
        studentClasse=findViewById(R.id.ClasseEtudiant);


        accessDevoir=findViewById(R.id.access_devoirs);
        accessAbsences=findViewById(R.id.access_absences);
        accessProfs=findViewById(R.id.access_profs);
        accessNotes=findViewById(R.id.AccessNotes);
        if(student==null){
            Toast.makeText(this, "error loading", Toast.LENGTH_SHORT).show();
        }
        else{
            studentName.setText("Nom : "+student.getName());
            //the class should not be null fait attention
            studentClasse.setText("Classe : "+student.getClasse().getNom());

            // we get objects from the student object to access each one on the other
            List<Devoir> devoirs=student.getClasse().getDevoirs();
            Intent intentDevoirs = new Intent(this, Devoirs.class);
            intentDevoirs.putExtra("DEVOIRS_LIST",(Serializable) devoirs);
            accessDevoir.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(intentDevoirs);
                }
            });

            List<Professeur> profs=student.getClasse().getProfesseurs();
            Intent intentProfs=new Intent(this,Professeurs_enfant.class);
            intentProfs.putExtra("PROFS_LIST",(Serializable) profs);
            accessProfs.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(intentProfs);
                }
            });


            List<Note> notes=student.getNotes();
            Intent notesIntent=new Intent(this,Notes.class);
            intentProfs.putExtra("PROFS_LIST",(Serializable) notes);
            accessNotes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(notesIntent);
                }
            });

            List<Absence> absences=student.getAbsences();
            Intent absenceIntent=new Intent(this,Absences.class);
            intentProfs.putExtra("PROFS_LIST",(Serializable) absences);
            accessAbsences.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(absenceIntent);
                }
            });
        }
    }
}
