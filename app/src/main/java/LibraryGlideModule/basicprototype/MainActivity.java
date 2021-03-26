package LibraryGlideModule.basicprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toolbar;

import com.example.basicprototype.R;

public class MainActivity extends AppCompatActivity{
    //Private variables (images)
   private ImageView calendar = findViewById(R.id.Calendar);
   private ImageView wellbeing = findViewById(R.id.Wellbeing);
   private ImageView tick = findViewById(R.id.Tick);
   private ImageView home = findViewById(R.id.Home);
   private ImageView help = findViewById(R.id.Help);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.Layout);
        setSupportActionBar(toolbar);


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
        Intent intent = new Intent(MainActivity.this, WellbeingActivity.trackerActivity.class);
        startActivity(intent);
    }

    public void openHome(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
    }




    private void setSupportActionBar(Toolbar toolbar) {
    }
}