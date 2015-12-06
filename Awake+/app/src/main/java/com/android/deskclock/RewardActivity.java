package com.android.deskclock;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/**
* @file 	RewardActivity.java
* @brief 	Implements the point to reward interface with buttons and screens
* @author 	Mikhail Chowdhury
* @author 	Sam Skolnekovich
* @author 	Justin Schiller
* @author 	Jordan Peters
*/
public class RewardActivity extends Activity {
    /**
    * @file 	RewardActivity.java
    * @brief 	Initializes the Points Button
    * @author 	Mikhail Chowdhury
    * @author 	Sam Skolnekovich
    * @return 	Void
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reward);

        TextView points=(TextView) findViewById(R.id.Rpoints);
        String x= DeskClockApplication.getPointsString();
        points.setText("You have\n\n" + x + "!");


        Button z = (Button) findViewById(R.id.rew);

        z.setOnClickListener(new View.OnClickListener() {
	    /**
	    * @file 	RewardActivity.java
	    * @brief 	Initializes the Redeem Rewards Button
	    * @author 	Mikhail Chowdhury
	    * @author 	Sam Skolnekovich
	    * @author 	Justin Schiller
	    * @author 	Jordan Peters
	    * @return	Void
	    */
            @Override
            public void onClick(View v) {
                // ((DeskClockApplication) this.getApplication()).addPoints(-((DeskClockApplication) this.getApplication()).getPoints());
                TextView points=(TextView) findViewById(R.id.Rpoints);
                points.setText("Reward Redeemed!");
            }
        });

    }

}
