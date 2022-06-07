package com.example.tracker;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tracker.Professeur;
import com.example.tracker.R;

import java.util.ArrayList;
import java.util.List;

public class recyclerAdapter_profs extends RecyclerView.Adapter <recyclerAdapter_profs.MyViewHolder_profs> {

    public void setProfesseurList_general(List<Professeur> ProfesseurList) {
        this.ProfesseurList = ProfesseurList;
    }

    private List<Professeur> ProfesseurList;
    private Context context;


    public recyclerAdapter_profs(Context context){
        this.context=context;

    }

    public class MyViewHolder_profs extends RecyclerView.ViewHolder implements View.OnClickListener {


        private TextView NomText;
        private TextView MatiereText;
        private TextView sendMsg;

        public MyViewHolder_profs (final View view ){
            super(view);
            NomText = view.findViewById(R.id.NomProf);
            MatiereText = view.findViewById(R.id.Matière);
            sendMsg=view.findViewById(R.id.sendMessageToProf);
            sendMsg.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            Intent msgIntent=new Intent(context,Message.class);
            msgIntent.putExtra("messages",getLayoutPosition());
            context.startActivity(msgIntent);
        }
    }
    @NonNull
    @Override
    public recyclerAdapter_profs.MyViewHolder_profs onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row_professeur,parent,false);
        recyclerAdapter_profs.MyViewHolder_profs holder=new recyclerAdapter_profs.MyViewHolder_profs(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerAdapter_profs.MyViewHolder_profs  holder, int position) {
        String nom = ProfesseurList.get(position).getName();
        String matiere = ProfesseurList.get(position).getMatiere();
        holder.NomText.setText(nom);
        holder.MatiereText.setText(matiere);
    }

    @Override
    public int getItemCount() {
        return ProfesseurList.size();
    }
}

