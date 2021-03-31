package com.TeamBee.WellbeingTracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class WellbeingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellbeing);

        GridView gridView = (GridView) findViewById(R.id.Grid);
        gridView.setAdapter(new gridAdapter(this));
        gridView.setNumColumns(2);
    }

    public static class trackerActivity {
    }
}