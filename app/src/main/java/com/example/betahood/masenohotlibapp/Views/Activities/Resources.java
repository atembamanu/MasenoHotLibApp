package com.example.betahood.masenohotlibapp.Views.Activities;

import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.view.WindowManager;

import com.example.betahood.masenohotlibapp.Views.Fragments.BlockchainFragment;
import com.example.betahood.masenohotlibapp.Views.Fragments.DatascienceFragment;
import com.example.betahood.masenohotlibapp.Views.Fragments.FragementProgramming;
import com.example.betahood.masenohotlibapp.Views.Fragments.FragmentArtificial;
import com.example.betahood.masenohotlibapp.Views.Fragments.FragmentNetworking;
import com.example.betahood.masenohotlibapp.Views.Fragments.FragmentScripting;
import com.example.betahood.masenohotlibapp.Views.Fragments.WebDevFragment;
import com.example.betahood.masenohotlibapp.HelperClasses.ViewPagerAdapterResources;
import com.example.betahood.masenohotlibapp.R;

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
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            w.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources);

        Toolbar toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


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
