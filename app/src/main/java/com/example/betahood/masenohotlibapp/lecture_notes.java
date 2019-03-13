package com.example.betahood.masenohotlibapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class lecture_notes extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private static final String[] paths_program = {"Computer Science", "Information Technology", "Computer Technology", "ICTM"};
    private static final String[] paths_year = {"Year I", "Yea II", "Year III", "Year IV"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecture_notes);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Lecturer Resources");

        //Spinner For the programs
        Spinner spinner1 = (Spinner) findViewById(R.id.course_spinner);
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(lecture_notes.this,
                android.R.layout.simple_spinner_item, paths_program);

        // Spinner for the year
        Spinner spinner2 = (Spinner) findViewById(R.id.academicYR_spinner);
        new ArrayAdapter<String>(lecture_notes.this,
                android.R.layout.simple_spinner_item, paths_year);


        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(this);
        spinner2.setAdapter(adapter);
        spinner2.setOnItemSelectedListener(this);
    }
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
            switch (parent.getId()) {
                case R.id.course_spinner:

                    switch (position) {
                        case 0:
                            //
                            break;
                        case 1:
                            Toast.makeText(getApplicationContext(),"You clicked Computer Science",Toast.LENGTH_SHORT).show();
                            break;
                        case 2:
                            Toast.makeText(getApplicationContext(),"You clicked IT",Toast.LENGTH_SHORT).show();
                            break;
                        case 3:
                            Toast.makeText(getApplicationContext(),"You clicked CComp Tech",Toast.LENGTH_SHORT).show();
                            break;
                        case 4:
                            Toast.makeText(getApplicationContext(),"You clicked ICTM",Toast.LENGTH_SHORT).show();
                            break;

                    }
                    break;
                case R.id.academicYR_spinner:

                    switch (position) {
                        case 0:
                            //
                            break;
                        case 1:
                            Toast.makeText(getApplicationContext(),"You clicked 1",Toast.LENGTH_SHORT).show();
                            break;
                        case 2:
                            Toast.makeText(getApplicationContext(),"You clicked 2",Toast.LENGTH_SHORT).show();
                            break;
                        case 3:
                            Toast.makeText(getApplicationContext(),"You clicked 3",Toast.LENGTH_SHORT).show();
                            break;
                        case 4:
                            Toast.makeText(getApplicationContext(),"You clicked 4",Toast.LENGTH_SHORT).show();
                            break;

                    }
                    break;
                default:
                    break;
            }
        }




    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

}
