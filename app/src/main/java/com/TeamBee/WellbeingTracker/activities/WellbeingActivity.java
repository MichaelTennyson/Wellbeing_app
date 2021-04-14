package com.TeamBee.WellbeingTracker.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.TeamBee.WellbeingTracker.R;
import com.TeamBee.WellbeingTracker.activities.CalendarActivity;
import com.TeamBee.WellbeingTracker.activities.HelpActivity;
import com.TeamBee.WellbeingTracker.activities.MainActivity;
import com.TeamBee.WellbeingTracker.activities.trackerActivity;
import com.TeamBee.WellbeingTracker.adapters.gridAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class WellbeingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellbeing);

        //sets the grid adapter and number of columns in the grid
        GridView gridView = (GridView) findViewById(R.id.Grid);
        gridView.setAdapter(new gridAdapter(this));
        gridView.setNumColumns(2);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "position => " + position +
                                " - ListView =>" + parent +
                                " - View => " + view+
                                " - id => " + id
                        , Toast.LENGTH_LONG).show();
            }
        });



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);

        //setting Wellbeing as selected
        bottomNavigationView.setSelectedItemId(R.id.Wellbeing);

        //Item Selected Listener
        bottomNavigationView.setOnNavigationItemSelectedListener( new BottomNavigationView.OnNavigationItemSelectedListener() {
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
                        startActivity(new Intent(getApplicationContext(),
                                MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.Wellbeing:
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

    }

}