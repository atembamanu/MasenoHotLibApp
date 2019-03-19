package com.example.betahood.masenohotlibapp.Views.Activities;

import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.view.WindowManager;

import com.example.betahood.masenohotlibapp.Views.Fragments.FragmentLinks;
import com.example.betahood.masenohotlibapp.Views.Fragments.FragmentPdfs;
import com.example.betahood.masenohotlibapp.Views.Fragments.FragmentVideos;
import com.example.betahood.masenohotlibapp.HelperClasses.ViewPagerAdapterTutorials;
import com.example.betahood.masenohotlibapp.R;

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
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            w.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials);

        Toolbar toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



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
