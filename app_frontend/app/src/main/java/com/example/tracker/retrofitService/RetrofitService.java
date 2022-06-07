package com.example.tracker.retrofitService;

import com.example.tracker.Profile;
import com.google.gson.Gson;

import java.util.logging.Level;
import java.util.logging.Logger;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService {

    private Retrofit retrofit;

    public RetrofitService(){
        initialiseRetrofit();
    }

    private void initialiseRetrofit() {
        retrofit=new Retrofit.Builder()
                .baseUrl("http://192.168.43.37:9000")
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();
        Logger.getLogger(Profile.class.getName()).log(Level.SEVERE,"request sent");
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }
}
