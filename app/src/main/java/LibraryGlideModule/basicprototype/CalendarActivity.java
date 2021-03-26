package LibraryGlideModule.basicprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.basicprototype.R;

public class CalendarActivity extends AppCompatActivity {


    private ImageView calendar = findViewById(R.id.Calendar);
    private ImageView wellbeing = findViewById(R.id.Wellbeing);
    private ImageView tick = findViewById(R.id.Tick);
    private ImageView home = findViewById(R.id.Home);
    private ImageView help = findViewById(R.id.Help);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
    }

    public void calendar_openCalendar(View view) {
        Intent intent = new Intent(CalendarActivity.this, CalendarActivity.class);
        startActivity(intent);
    }

    public void calendar_openWellbeing(View view) {
        Intent intent = new Intent(CalendarActivity.this, WellbeingActivity.class);
        startActivity(intent);
    }

    public void calendar_openHelp(View view) {
        Intent intent = new Intent(CalendarActivity.this, HelpActivity.class);
        startActivity(intent);
    }

    public void calendar_openTracker(View view) {
        Intent intent = new Intent(CalendarActivity.this, WellbeingActivity.trackerActivity.class);
        startActivity(intent);
    }

    public void calendar_openHome(View view) {
        Intent intent = new Intent(CalendarActivity.this, MainActivity.class);
        startActivity(intent);
    }
}