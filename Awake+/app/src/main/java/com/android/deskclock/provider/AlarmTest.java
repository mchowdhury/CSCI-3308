package com.android.deskclock.provider;

import junit.framework.TestCase;

import java.util.Calendar;

/**
 * Created by Jbp173 on 11/10/2015.
 */
public class AlarmTest extends TestCase {


   public void testIsTomorrow() throws Exception
   {
       final Calendar now = Calendar.getInstance();
       Alarm test = new Alarm(2,59);
       if (now.get(Calendar.HOUR_OF_DAY) <= 2)
       {
           assertEquals("Alarm time not correctly compared with calender time", false, test.isTomorrow(test));
       }
       else
       {
           assertEquals("Alarm time not correctly compared with calender time", true, test.isTomorrow(test));
       }
   }

    public void testAddPoints() throws Exception
    {
        Alarm test = new Alarm(2,2);
        test.addPoints(52);
        assertEquals("totalPoints is not 52", 52, test.totalPoints);
    }

    public void testGetPoints() throws Exception
    {
        Alarm test = new Alarm(2,2);
        test.totalPoints = 32;
        assertEquals("totalPoints is not 32", 32, test.getPoints());
    }
}