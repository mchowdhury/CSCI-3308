package com.android.deskclock;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RewardActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reward);

        TextView points=(TextView) findViewById(R.id.Rpoints);
        String x= DeskClockApplication.getPointsString();
        points.setText("You have: " + x + "Points");

    }
}
