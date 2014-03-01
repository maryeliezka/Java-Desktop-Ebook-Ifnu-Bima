/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.DateCalendarDateFormat.JodaTime;

import org.joda.time.DateTime;
import org.joda.time.Duration;

/**
 *
 * @author radgeek
 */
public class DurationTest {
    public static void main(String[] args){
        Duration duration = new Duration(10000); //10 detik
        System.out.println("Duration: " + duration);
        DateTime now = new DateTime();
        DateTime oneMonthLater = now.plusMonths(1);
        duration = new Duration(now, oneMonthLater);
        System.out.println("duration of the month: " + duration);
        Duration oneHour = new Duration(1000  * 60 * 60);
        DateTime oneHourLater = now.plus(oneHour);
        System.out.println("One hour later: " + oneHourLater);
    }
}
