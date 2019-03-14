package com.example.betahood.masenohotlibapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Tutorials extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Hot Tutorials");


        tabLayout = (TabLayout) findViewById(R.id.tabtutorials_tab);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);

        ViewPagerAdapterTutorials adapter = new ViewPagerAdapterTutorials(getSupportFragmentManager());
        adapter.AddFragment(new FragmentVideos(), "Hot Videos");
        adapter.AddFragment(new FragmentPdfs(), "Free PDFs");
        adapter.AddFragment(new FragmentLinks(), "Direct Links");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
