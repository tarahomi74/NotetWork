package com.example.sahand.notetwork;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ContectActivity extends AppCompatActivity {
    EditText name,phon,email,new_pas;
    Button btn_login_new;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contect);
        name  = (EditText)findViewById(R.id.name);
        phon  = (EditText)findViewById(R.id.phon);
        email  = (EditText)findViewById(R.id.email);
        new_pas  = (EditText)findViewById(R.id.new_pas);


        final Activity context = this;

        btn_login_new  = (Button) findViewById(R.id.btn_login_new);
        btn_login_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.getText().toString().equals(""))
                {
                    Toast.makeText(context,"نام و نام خانوادگی را وارد کنید",Toast.LENGTH_SHORT).show();
                }
                else if(phon.getText().toString().equals(""))
                {
                    Toast.makeText(context,"نلفن را وارد کنید",Toast.LENGTH_SHORT).show();
                }
                else if(email.getText().toString().equals(""))
                {
                    Toast.makeText(context,"ایمیل را وارد کنید",Toast.LENGTH_SHORT).show();
                }
                else if(new_pas.getText().toString().equals(""))
                {
                    Toast.makeText(context,"پسوورد را وارد کنید",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(false)
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
