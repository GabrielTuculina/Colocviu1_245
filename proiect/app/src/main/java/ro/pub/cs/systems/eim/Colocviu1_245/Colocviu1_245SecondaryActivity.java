package ro.pub.cs.systems.eim.Colocviu1_245;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Colocviu1_245SecondaryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int sum = 0;

        Intent intent = getIntent();
        if (intent != null && intent.getExtras().containsKey("All terms")) {
            sum = intent.getIntExtra("All terms", 0);
        }

        savedInstanceState.putInt("All terms", sum);
    }
}
