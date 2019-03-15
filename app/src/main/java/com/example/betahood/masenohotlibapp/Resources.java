package com.example.betahood.masenohotlibapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Resources extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private int[] tabIcons ={
            R.drawable.ic_programming,
            R.drawable.ic_networking,
            R.drawable.ic_blockchain,
            R.drawable.ic_datascience,
            R.drawable.ic_webdev,
            R.drawable.ic_scripting,
            R.drawable.ic_intelligence

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Resources");


        tabLayout = (TabLayout) findViewById(R.id.tabresources_tab);
        viewPager = (ViewPager) findViewById(R.id.viewpager_resources_id);

        ViewPagerAdapterResources adapter = new ViewPagerAdapterResources(getSupportFragmentManager());
        adapter.AddFragment(new FragementProgramming(), "Programming");
        adapter.AddFragment(new FragmentNetworking(), "Networking");
        adapter.AddFragment(new BlockchainFragment(), "Blockchain");
        adapter.AddFragment(new DatascienceFragment(), "Data Science");
        adapter.AddFragment(new WebDevFragment(), "Web Development");
        adapter.AddFragment(new FragmentScripting(), "Scripting");
        adapter.AddFragment(new FragmentArtificial(), "Artificial Intelligence");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();

    }

    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        tabLayout.getTabAt(3).setIcon(tabIcons[3]);
        tabLayout.getTabAt(4).setIcon(tabIcons[4]);
        tabLayout.getTabAt(5).setIcon(tabIcons[5]);
        tabLayout.getTabAt(6).setIcon(tabIcons[6]);
    }
}
