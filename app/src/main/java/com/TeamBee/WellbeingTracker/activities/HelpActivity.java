package com.TeamBee.WellbeingTracker.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.TeamBee.WellbeingTracker.R;
import com.TeamBee.WellbeingTracker.adapters.VideoAdapter;
import com.TeamBee.WellbeingTracker.util.videos;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Vector;

public class HelpActivity extends AppCompatActivity {
   RecyclerView recyclerView;
   Vector<videos>helpVideos=new Vector<videos>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        helpVideos.add(new videos(""));
        helpVideos.add(new videos(""));
        helpVideos.add(new videos(""));
        helpVideos.add(new videos(""));
        helpVideos.add(new videos(""));
        VideoAdapter videoAdapter = new VideoAdapter(helpVideos);
        recyclerView.setAdapter(videoAdapter);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);

        //setting help activity as selected
        bottomNavigationView.setSelectedItemId(R.id.Help);

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
                        startActivity(new Intent(getApplicationContext(),
                                MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.Wellbeing:
                        startActivity(new Intent(getApplicationContext(),
                                WellbeingActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.Tracker:
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