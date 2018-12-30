package com.example.betahood.masenohotlibapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Challenges extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenges);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Challenges");
    }
}
