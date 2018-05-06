package com.example.sahand.notetwork;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button login,contect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button)findViewById(R.id.login);
        contect = (Button)findViewById(R.id.contect);

        final Activity context = this;

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Login = new Intent(context,LoginActivity.class);
                startActivity(Login);
            }
        });
        contect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//
                Intent contect = new Intent(context,ContectActivity.class);
                startActivity(contect);
            }
        });
    }

}
