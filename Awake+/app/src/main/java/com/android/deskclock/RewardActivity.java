package com.android.deskclock;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RewardActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reward);

        TextView points=(TextView) findViewById(R.id.Rpoints);
        String x= DeskClockApplication.getPointsString();
        points.setText("You have\n\n" + x + "!");


        Button z = (Button) findViewById(R.id.rew);

        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ((DeskClockApplication) this.getApplication()).addPoints(-((DeskClockApplication) this.getApplication()).getPoints());
                TextView points=(TextView) findViewById(R.id.Rpoints);
                points.setText("Reward Redeemed!");
            }
        });

    }

}
