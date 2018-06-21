package com.example.sahand.notetwork;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sahand.notetwork.resposes.LoginResponse;
import com.example.sahand.notetwork.services.LoginApiService;

import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginActivity extends AppCompatActivity {

    Button login;
    EditText user, pas;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText) findViewById(R.id.user);
        pas = (EditText) findViewById(R.id.pas);


        final Activity context = this;


        if (App.retrofit == null) {
            App.retrofit = new Retrofit.Builder()
                    .baseUrl(App.baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }



        login = (Button) findViewById(R.id.btn_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getText().toString().equals("")) {
                    Toast.makeText(context, "نام کاربری را وارد کنید", Toast.LENGTH_SHORT).show();
                } else if (pas.getText().toString().equals("")) {
                    Toast.makeText(context, "کلمه عبور را وارد کنید", Toast.LENGTH_SHORT).show();
                } else {
                    LoginApiService service = App.retrofit.create(LoginApiService.class);
                    retrofit2.Call<LoginResponse> call = service.login("5a9314fbe4b04e579ee1edbe", "5a9314fbe4b05bb64131ee38", String.valueOf(user.getText()), String.valueOf(pas.getText()));
                    call.enqueue(new Callback<LoginResponse>() {
                        @Override
                        public void onResponse(retrofit2.Call<LoginResponse> call, Response<LoginResponse> response) {

                            Intent intent = new Intent(LoginActivity.this, List_WorkActivity.class);
                            startActivity(intent);
                            finish();}

                        @Override
                        public void onFailure(retrofit2.Call<LoginResponse> call, Throwable t) {
                            Toast.makeText(LoginActivity.this, " مشکلی پیش آمده لطفا ارتباط را چک کنید", Toast.LENGTH_SHORT).show();
                        }
                    });


                }

            }
        });
    }
}
