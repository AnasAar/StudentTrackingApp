package com.example.tracker.retrofitService;

import com.example.tracker.model.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserApi {

    @GET("api/user/find/{email}/{password}")
    Call<User> getUser(@Path("email") String email, @Path("password") String password);
}
