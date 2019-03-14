package com.example.betahood.masenohotlibapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ResetPassword extends AppCompatActivity {

    TextView reset;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        imageButton = findViewById(R.id.signupback);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResetPassword.this, login.class);
                startActivity(intent);
            }
        });

        reset = (TextView) findViewById(R.id.have_account);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResetPassword.this, login.class);
                startActivity(intent);
            }
        });
    }
}
