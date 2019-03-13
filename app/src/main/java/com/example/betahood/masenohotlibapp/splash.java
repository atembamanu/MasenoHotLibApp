package com.example.betahood.masenohotlibapp;

import android.content.Intent;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final Animation in = new AlphaAnimation(0.0f, 1.0f);
        in.setDuration(1000);

        final Animation out = new AlphaAnimation(1.0f, 0.0f);
        out.setDuration(1000);

        final ProgressBar loader = findViewById(R.id.progressBarLoader);
        final TextView title = findViewById(R.id.welcome);
        final TextView description= findViewById(R.id.welcome_string);

        title.setVisibility(View.VISIBLE);
        title.startAnimation(in);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                description.setVisibility(View.VISIBLE);
                description.startAnimation(in);
            }
        }, 1500);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                title.startAnimation(out);
                description.startAnimation(out);
                loader.setVisibility(View.VISIBLE);
                loader.startAnimation(in);
            }
        }, 3000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                title.setVisibility(View.INVISIBLE);
                description.setVisibility(View.INVISIBLE);
                startActivity(new Intent(splash.this,login.class));
                finish();
            }
        }, 4000);
    }
}