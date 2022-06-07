package com.example.tracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerAdapter_messages extends RecyclerView.Adapter <recyclerAdapter_messages.MyViewHolder_Messages > {

    public void setMessageList_general(ArrayList<Message> MessageList) {
        this.MessageList = MessageList;
    }

    private ArrayList<Message> MessageList;
    private Context context;


    public recyclerAdapter_messages(Context context){
        this.context=context;

    }

    public class MyViewHolder_Messages extends RecyclerView.ViewHolder{


        private TextView NomText;
        private TextView DateText;

        public MyViewHolder_Messages (final View view ){
            super(view);
            NomText = view.findViewById(R.id.NomProf);
            DateText = view.findViewById(R.id.DateMessg);
        }

    }
    @NonNull
    @Override
    public MyViewHolder_Messages  onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row_message,parent,false);
        MyViewHolder_Messages  holder=new MyViewHolder_Messages (view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerAdapter_messages.MyViewHolder_Messages  holder, int position) {
        String nom = MessageList.get(position).getNomExpediteur();
        String date = MessageList.get(position).getDate();
        holder.NomText.setText(nom);
        holder.DateText.setText(date);
    }

    @Override
    public int getItemCount() {
        return MessageList.size();
    }
}

