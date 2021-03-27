package com.TeamBee.WellbeingTracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView calendarButton = findViewById(R.id.Calendar);
        ImageView wellbeingButton = findViewById(R.id.Wellbeing);
        ImageView surveyButton = findViewById(R.id.Survey);
        ImageView home = findViewById(R.id.Home);
        ImageView helpButton = findViewById(R.id.Help);


    }



    public void openCalendar(View view) {
        Intent intent = new Intent(MainActivity.this, CalendarActivity.class);
        startActivity(intent);
    }

    public void openWellbeing(View view) {
        Intent intent = new Intent(MainActivity.this, WellbeingActivity.class);
        startActivity(intent);
    }

    public void openHelp(View view) {
        Intent intent = new Intent(MainActivity.this, HelpActivity.class);
        startActivity(intent);
    }

    public void openTracker(View view) {
        Intent intent = new Intent(MainActivity.this, trackerActivity.class);
        startActivity(intent);
    }

    public void openHome(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
    }




    private void setSupportActionBar(Toolbar toolbar) {
    }
}