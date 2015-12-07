package com.android.deskclock.provider;

import junit.framework.TestCase;

import java.util.Calendar;

/**
 * @file 	AlarmTest.java
 * @brief	Unit testing cases
 * @author	Jordan Peters
 * @author	Sam Skolnekovich
 * @author	Mikhail Chowdhury
 */
public class AlarmTest extends TestCase {

   /**
    * @file 	AlarmTest.java
    * @brief	Testing if a day has passed since last alarm
    * @author	Jordan Peters
    * @author	Sam Skolnekovich
    * @author	Mikhail Chowdhury
    */
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
    /**
     * @file 	AlarmTest.java
     * @brief	Testing if points are successfully added on alarm activity
     * @author	Jordan Peters
     * @author	Sam Skolnekovich
     * @author	Mikhail Chowdhury
     */
    public void testAddPoints() throws Exception
    {
        Alarm test = new Alarm(2,2);
        test.addPoints(52);
        assertEquals("totalPoints is not 52", 52, test.totalPoints);
    }
    /**
     * @file 	AlarmTest.java
     * @brief	Testing if get points method works
     * @author	Jordan Peters
     * @author	Sam Skolnekovich
     * @author	Mikhail Chowdhury
     */
    public void testGetPoints() throws Exception
    {
        Alarm test = new Alarm(2,2);
        test.totalPoints = 32;
        assertEquals("totalPoints is not 32", 32, test.getPoints());
    }
}
