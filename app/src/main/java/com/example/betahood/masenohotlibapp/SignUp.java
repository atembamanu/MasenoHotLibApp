package com.example.betahood.masenohotlibapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {

    TextView have_account;
    EditText username, email, password, confirm_password;
    Button sign_up;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        imageButton = findViewById(R.id.signupback);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUp.this, login.class);
                startActivity(intent);
            }
        });

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        email = findViewById(R.id.email);
        confirm_password = findViewById(R.id.confirm_password);
        sign_up = findViewById(R.id.signup);


        have_account = (TextView) findViewById(R.id.have_account);
        have_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUp.this, login.class);
                startActivity(intent);
            }
        });


    }
}
