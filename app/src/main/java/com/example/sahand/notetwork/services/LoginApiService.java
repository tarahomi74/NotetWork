package com.example.sahand.notetwork.services;

import com.example.sahand.notetwork.resposes.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * Created by sahand on 06/20/2018.
 */

public interface LoginApiService {
    @FormUrlEncoded
    @POST("/auth/login")
    Call<LoginResponse> login(@Header("X-Backtory-Authentication-Id") String authorization, @Header("X-Backtory-Authentication-Key") String authorization2,
                              @Field("username") String username, @Field("password") String password );

}
