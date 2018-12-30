package com.example.betahood.masenohotlibapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PastPapers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_papers);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Past Papers");
    }
}
