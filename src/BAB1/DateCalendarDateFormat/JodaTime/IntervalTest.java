/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.DateCalendarDateFormat.JodaTime;

import org.joda.time.DateTime;
import org.joda.time.Interval;

/**
 *
 * @author radgeek
 */
public class IntervalTest {
    public static void main(String[] args){
        DateTime now = new DateTime();
        DateTime oneMonthLater = now.plusMonths(1);
        Interval interval = new Interval(now, oneMonthLater);
        
        System.out.println("interval: " + interval);
        System.out.println("start: " + interval.getStart());
        System.out.println("end: " + interval.getEnd());
        System.out.println("duration: " + interval.toDuration());
        interval.withEnd(interval.getEnd().plusHours(1));
    }
}
