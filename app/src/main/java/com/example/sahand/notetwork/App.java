package com.example.sahand.notetwork;

import android.app.Application;

import retrofit2.Retrofit;

/**
 * Created by sahand on 06/20/2018.
 */

public class App extends Application {
    public static String baseUrl = "https://api.backtory.com/";
    public static Retrofit retrofit = null;
    public static String access_token;
    public static String username = null;

    protected static App instance;

    public App() {
        super();
        instance = this;
    }

    public static String getAccessToken(){
        return access_token;
    }

}
