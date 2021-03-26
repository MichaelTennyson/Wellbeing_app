package LibraryGlideModule.basicprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.basicprototype.R;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
    }

    public void help_openCalendar(View view) {
        Intent intent = new Intent(HelpActivity.this, CalendarActivity.class);
        startActivity(intent);
    }

    public void help_openWellbeing(View view) {
        Intent intent = new Intent(HelpActivity.this, WellbeingActivity.class);
        startActivity(intent);
    }

    public void help_openHelp(View view) {
        Intent intent = new Intent(HelpActivity.this, HelpActivity.class);
        startActivity(intent);
    }

    public void help_openTracker(View view) {
        Intent intent = new Intent(HelpActivity.this, WellbeingActivity.trackerActivity.class);
        startActivity(intent);
    }

    public void help_openHome(View view) {
        Intent intent = new Intent(HelpActivity.this, MainActivity.class);
        startActivity(intent);
    }
}