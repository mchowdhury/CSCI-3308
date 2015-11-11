package com.android.deskclock.alarms;
import java.lang.Math;
import java.util.Date;

/**
 * Created by samuelskolnekovich on 11/10/15.
 */
public class testAlarms {
    public boolean isnewDay;
    public boolean isSnooze;
    public int totalpoints=0;
    private int points=1;
    private Date oldDate=new Date();
    private int counter=0;

    public void test(Date currentDate){
        //is it a new day
        if(currentDate==oldDate){
            counter=counter+1;
            if(counter==1){
                isnewDay=true;
            }
            else{
                isnewDay=false;
            }
        }
        if(currentDate!=oldDate){
            oldDate=currentDate;
            isnewDay=true;
            counter=1;
        }


        //Snooze functionality
        double x =Math.random();
        if(x<.5){
            isSnooze=true;
        }
        if(x>=.5){
            isSnooze=false;
        }

        if(isSnooze==false && isnewDay==true) {
            totalpoints = totalpoints + points;
        }


    }
    public boolean getIsSnooze(){
        return isSnooze;
    }
    public boolean getIsNewDay(){
        return isnewDay;
    }
    public int getTotalPoints(){
        return totalpoints;
    }
}
