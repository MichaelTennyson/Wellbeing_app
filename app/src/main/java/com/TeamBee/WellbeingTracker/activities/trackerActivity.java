package com.TeamBee.WellbeingTracker.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.TeamBee.WellbeingTracker.R;
import com.TeamBee.WellbeingTracker.adapters.RecyclerAdapter;
import com.TeamBee.WellbeingTracker.util.items;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class trackerActivity extends AppCompatActivity {
    private ArrayList<items> itemList;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracker);
        recyclerView = findViewById(R.id.recycler_view);
        itemList = new ArrayList<>();

        setItemInfo();
        setAdapter();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);

        //setting Tracker as selected
        bottomNavigationView.setSelectedItemId(R.id.Tracker);

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

    private void setAdapter() {
        RecyclerAdapter adapter = new RecyclerAdapter(itemList);
        RecyclerView.LayoutManager  layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void setItemInfo() {
        itemList.add(new items(R.drawable.fruitandveg1, "Have you eaten fruit and veg"));
        itemList.add(new items(R.drawable.weights, "Have you exercised today?"));
        itemList.add(new items(R.drawable.water, "Have you drank water today"));
    }

    private void onListItemClick(ArrayList<items> l, View v, int position, long id){
        Toast.makeText(getApplicationContext(), "position => " + position +
                        " - ListView =>" + l +
                        " - View => " + v +
                        " - id => " + id
                , Toast.LENGTH_LONG).show();
    }





}