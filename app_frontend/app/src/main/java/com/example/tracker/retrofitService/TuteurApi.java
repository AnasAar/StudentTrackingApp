package com.example.tracker.retrofitService;

import com.example.tracker.model.Classe;
import com.example.tracker.model.Tuteur;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface TuteurApi {


    @GET("/api/tuteur/getby/{email}")
    Call<Tuteur> getTuteurInfo(@Path("email") String email);

}
