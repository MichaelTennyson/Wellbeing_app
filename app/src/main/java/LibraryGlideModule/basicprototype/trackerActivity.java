package LibraryGlideModule.basicprototype;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.basicprototype.R;

import java.util.ArrayList;

public class trackerActivity extends AppCompatActivity {

    private static final String TAG = "trackerActivity";

    //variables
    private final ArrayList<String> mNames = new ArrayList<>();
    private final ArrayList<String> mImageDir = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracker);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing images");
        mImageDir.add("C:\\Users\\customer1\\Documents\\year 3 Semester 2\\Icons\\fruitandveg1.png");
        mNames.add("have you eaten healthy food?");

        mImageDir.add("C:\\Users\\customer1\\Documents\\year 3 Semester 2\\Icons\\weights.png");
        mNames.add("Have you exercised?");

        mImageDir.add("C:\\Users\\customer1\\Documents\\year 3 Semester 2\\Icons\\water.png");
        mNames.add("have you drank water?");

        initRecyclerView();

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recylerv_view);
        recyclerViewAdapter adapter = new recyclerViewAdapter(this, mNames, mImageDir);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }



    public void tracker_openCalendar(View view) {
        Intent intent = new Intent(trackerActivity.this, CalendarActivity.class);
        startActivity(intent);
    }

    public void tracker_openWellbeing(View view) {
        Intent intent = new Intent(trackerActivity.this, WellbeingActivity.class);
        startActivity(intent);
    }

    public void tracker_openHelp(View view) {
        Intent intent = new Intent(trackerActivity.this, HelpActivity.class);
        startActivity(intent);
    }

    public void tracker_openTracker(View view) {
        Intent intent = new Intent(trackerActivity.this, trackerActivity.class);
        startActivity(intent);
    }

    public void tracker_openHome(View view) {
        Intent intent = new Intent(trackerActivity.this, MainActivity.class);
        startActivity(intent);
    }
}