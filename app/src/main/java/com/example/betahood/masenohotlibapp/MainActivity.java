package com.example.betahood.masenohotlibapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    GridLayout gridLayout;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

         gridLayout = (GridLayout) findViewById(R.id.mainGrid);

         setSingleEvent(gridLayout);

    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent=new Intent(MainActivity.this, settings_activity.class);
            startActivity(intent);
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        //handle navigation view
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            //takes you back to home page.
        } else if (id == R.id.nav_forum) {
            //handle the forum action

        } else if (id == R.id.nav_event){
            //handle the event action

        } else if (id == R.id.nav_latest) {
            //handle the latest action

        } else if (id == R.id.nav_trending) {
            //handle the trending action

        } else if (id == R.id.nav_account) {
            //handle the account action


        }
        else if (id == R.id.nav_studentportal) {
            //handle the student portal action
            item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    String uri = "http://41.89.192.20/Login.aspx";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(uri));
                    startActivity(intent);
                    return  false;
                }
            });


        }
        else if (id == R.id.nav_share) {

            item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    Intent share = new Intent(Intent.ACTION_SEND);
                    share.setType("plain/text");
                    String shareBodyText = "Check this cool learning android application <Maseno HotLib App on Play Store>";
                    share.putExtra(android.content.Intent.EXTRA_SUBJECT, "Maseno HotLib App");
                    share.putExtra(android.content.Intent.EXTRA_TEXT, shareBodyText);
                    startActivity(Intent.createChooser(share, "Share with friends"));
                    return false;
                }
            });
        }
        else if (id == R.id.nav_about) {

            //handle the about us action
            item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    Intent intent = new Intent(MainActivity.this, AboutUs.class);
                    startActivity(intent);
                    return false;
                }
            });

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void setSingleEvent(GridLayout gridLayout) {
        for (int i = 0; i < gridLayout.getChildCount(); i++) {
            CardView cardView = (CardView) gridLayout.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (finalI == 0) {
                        Intent intent = new Intent(MainActivity.this, lecture_notes.class);
                        startActivity(intent);

                    } else if (finalI == 1) {

                        Intent intents = new Intent(MainActivity.this, PastPapers.class);
                        startActivity(intents);
                    } else if (finalI == 2) {
                        Intent intents = new Intent(MainActivity.this, Tutorials.class);
                        startActivity(intents);

                    } else if (finalI == 3) {

                        Intent intents = new Intent(MainActivity.this, Resources.class);
                        startActivity(intents);
                    } else if (finalI == 4) {
                        Intent intents = new Intent(MainActivity.this, Challenges.class);
                        startActivity(intents);

                    } else if (finalI == 5) {
                        Intent intents = new Intent(MainActivity.this, HowTo.class);
                        startActivity(intents);

                    }

                }
            });
        }
    }


//    public void OpenActivity(View view) {
//        switch (view.getId()){
//            case R.id.downloadnotes:
//                Intent intent =new Intent(MainActivity.this, LectureNotes.class);
//                startActivity(intent);
//                break;
//
//            case R.id.pastpapers:
//
//                break;
//
//            case R.id.tutorials:
//
//                break;
//
//            case R.id.resources:
//
//                break;
//
//            case R.id.challenges:
//
//                break;
//
//            case R.id.howto:
//
//                break;
//
//
//            default:
//
//        }

}
