package com.example.betahood.masenohotlibapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Tutorials extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    private int[] tabIcons ={
            R.drawable.ic_video,
            R.drawable.ic_pdf,
            R.drawable.ic_links

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Hot Tutorials");



        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        setupViewPager(viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabtutorials_tab);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();


    }
    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapterTutorials adapter = new ViewPagerAdapterTutorials(getSupportFragmentManager());
        adapter.AddFragment(new FragmentVideos(), "Hot Videos");
        adapter.AddFragment(new FragmentPdfs(), "Free PDFs");
        adapter.AddFragment(new FragmentLinks(), "Direct Links");

        viewPager.setAdapter(adapter);
    }


}
