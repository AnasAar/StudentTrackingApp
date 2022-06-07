package com.example.tracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class recyclerAdapter extends RecyclerView.Adapter <recyclerAdapter.MyViewHolder> {

    public void setDevoirList(List<Devoir> devoirList) {
        this.devoirList = devoirList;
    }

    private List<Devoir> devoirList;
    private Context context;


    public recyclerAdapter(Context context){
        this.context=context;

    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView matiereText;
        private TextView dateText;

        public MyViewHolder(final View view ){
            super(view);
            matiereText = view.findViewById(R.id.textDevoirTitle);
            dateText = view.findViewById(R.id.textDevoirDate);
        }

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row_devoir,parent,false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerAdapter.MyViewHolder holder, int position) {
        String matiere = devoirList.get(position).getMatiere();
        Date date = devoirList.get(position).getDate();
        holder.matiereText.setText(matiere);
        holder.dateText.setText(date.toString());
    }

    @Override
    public int getItemCount() {
        return devoirList.size();
    }
}
