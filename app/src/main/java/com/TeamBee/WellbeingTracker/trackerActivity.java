package com.TeamBee.WellbeingTracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

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

        
    }

    private void setAdapter() {
        RecyclerAdapter adapter = new RecyclerAdapter(itemList);
        RecyclerView.LayoutManager  layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void setItemInfo() {
        itemList.add(new items(R.drawable.fruitandveg1, "fruit and veg"));
        itemList.add(new items(R.drawable.weights, "dummbells"));
        itemList.add(new items(R.drawable.water, "fruit and veg"));
    }
}