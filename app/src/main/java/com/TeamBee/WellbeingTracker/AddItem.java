package com.TeamBee.WellbeingTracker;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class AddItem extends AppCompatActivity {

    // TODO Add actual button references
    ImageButton smileySelection, fruitButton, vegButton, exerciseButton;
    Button confirmButton, updateButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracker);

        smileySelection = findViewById(R.id.);
        fruitButton = findViewById(R.id.);
        vegButton = findViewById(R.id.);
        exerciseButton = findViewById(R.id.);
        confirmButton = findViewById(R.id.);
        updateButton = findViewById(R.id.);

        // TODO Update add item with proper variables
        confirmButton.setOnClickListener(v -> {
            Database MyDB = new Database(AddItem.this);
            MyDB.addItem();
        });

        // TODO Update button after initial submit for current day
        updateButton.setOnClickListener(v -> {
            Database myDB = new Database(UpdateItem.this);
            myDB.updateItem();
        });

    }
}
