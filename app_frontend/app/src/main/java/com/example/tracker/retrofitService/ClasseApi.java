package com.example.tracker.retrofitService;

import com.example.tracker.model.Classe;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ClasseApi {

    @GET("/api/classe/allclasses")
    Call<List<Classe>> getAllClasses();

    @POST("/api/classe/save")
    Call<Classe> save(@Body Classe classe);
}
