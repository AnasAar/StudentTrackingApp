package com.example.tracker;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tracker.model.Student;

import java.util.ArrayList;
import java.util.List;

public class recyclerAdapter_enfants extends RecyclerView.Adapter <recyclerAdapter_enfants.MyViewHolder_enfants > {


    private List<Student> enfantList;
    private Context context;

    public void setEnfantList_general(List<Student> enfantList) {
        this.enfantList = enfantList;
    }

    public recyclerAdapter_enfants(Context context){
        this.context=context;
    }

    public class MyViewHolder_enfants extends RecyclerView.ViewHolder implements View.OnClickListener {


        private TextView NomText;
        private TextView acceder;

        public MyViewHolder_enfants (final View view ){
            super(view);
            NomText = view.findViewById(R.id.NomsFils);
            acceder=view.findViewById(R.id.access_child_link);
            acceder.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, MenuEnfant.class);
            intent.putExtra("STUDENT_INFO",enfantList.get(getLayoutPosition()));
            context.startActivity(intent);
        }
    }
    @NonNull
    @Override
    public MyViewHolder_enfants  onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row_enfant,parent,false);
        MyViewHolder_enfants  holder=new MyViewHolder_enfants (view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerAdapter_enfants.MyViewHolder_enfants  holder, int position) {
         String nom = enfantList.get(position).getName();
         holder.NomText.setText(nom);
    }

    @Override
    public int getItemCount() {
        return enfantList.size();
    }
}
