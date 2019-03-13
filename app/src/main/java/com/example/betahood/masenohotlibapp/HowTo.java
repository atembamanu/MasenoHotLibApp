package com.example.betahood.masenohotlibapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HowTo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(" How To..");
    }
}
