package com.TeamBee.WellbeingTracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialises bottom nav variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);

        //setting home as selected
        bottomNavigationView.setSelectedItemId(R.id.Home);

        //Item Selected Listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //Switch statement that creates intent for each activity when the button is selected
                switch (item.getItemId()){
                    case R.id.Calendar:
                        startActivity(new Intent(getApplicationContext(),
                                CalendarActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.Home:
                        return true;
                    case R.id.Wellbeing:
                    startActivity(new Intent(getApplicationContext(),
                            WellbeingActivity.class));
                    overridePendingTransition(0,0);
                    return true;
                    case R.id.Tracker:
                        startActivity(new Intent(getApplicationContext(),
                                trackerActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.Help:
                        startActivity(new Intent(getApplicationContext(),
                                HelpActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                }
                return false;
            }
        });

        ImageView calendarButton = findViewById(R.id.Calendar);
        ImageView wellbeingButton = findViewById(R.id.Wellbeing);
        ImageView surveyButton = findViewById(R.id.Survey);
        ImageView home = findViewById(R.id.Home);
        ImageView helpButton = findViewById(R.id.Help);

    }

}