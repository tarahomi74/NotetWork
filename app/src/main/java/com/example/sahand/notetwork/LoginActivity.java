package com.example.sahand.notetwork;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button login;
    EditText user,pas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user  = (EditText)findViewById(R.id.user);
        pas  = (EditText)findViewById(R.id.pas);


        final Activity context = this;

        login  = (Button) findViewById(R.id.btn_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(user.getText().toString().equals(""))
                {
                    Toast.makeText(context,"نام کاربری را وارد کنید",Toast.LENGTH_SHORT).show();
                }
                else if(pas.getText().toString().equals(""))
                {
                    Toast.makeText(context,"کلمه عبور را وارد کنید",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(true)
                    {
                        Intent contect = new Intent(context,List_WorkActivity.class);
                        startActivity(contect);
                    }
                    else
                    {
                        Toast.makeText(context,"شما عضو نیستید",Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
    }
}
