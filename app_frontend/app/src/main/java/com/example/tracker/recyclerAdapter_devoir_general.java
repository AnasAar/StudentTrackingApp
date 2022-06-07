package com.example.tracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class recyclerAdapter_devoir_general extends RecyclerView.Adapter <recyclerAdapter_devoir_general.MyViewHolder_1> {

    public void setDevoirList_general(ArrayList<Devoir_general> devoirList) {
        this.devoirList = devoirList;
    }

    private List<Devoir_general> devoirList;
    private Context context;


    public recyclerAdapter_devoir_general(Context context){
        this.context=context;

    }

    public class MyViewHolder_1 extends RecyclerView.ViewHolder{

        private TextView matiereText;
        private TextView dateText;
        private TextView enfantText;

        public MyViewHolder_1(final View view ){
            super(view);
            matiereText = view.findViewById(R.id.textDevoirTitle);
            dateText = view.findViewById(R.id.textDevoirDate);
            enfantText = view.findViewById(R.id.textNomFils);
        }

    }
    @NonNull
    @Override
    public MyViewHolder_1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row_devoir_general,parent,false);
        MyViewHolder_1 holder=new MyViewHolder_1(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerAdapter_devoir_general.MyViewHolder_1 holder, int position) {
        String matiere = devoirList.get(position).getMatiere();
        String date = devoirList.get(position).getDate();
        String enfant = devoirList.get(position).getEnfant();
        holder.matiereText.setText(matiere);
        holder.dateText.setText(date);
        holder.enfantText.setText(enfant);
    }

    @Override
    public int getItemCount() {
        return devoirList.size();
    }
}
