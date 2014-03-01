/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.DateCalendarDateFormat.JodaTime;

import org.joda.time.DateTime;

/**
 *
 * @author radgeek
 */
public class CalculateComplicatedJodaTimeTest {
    public static void main(String[] args){
        DateTime d = new DateTime(2000,1,1,0,0,0,0);
        System.out.println("date: " + d.plusMonths(1).plusDays(45).dayOfWeek().withMaximumValue().toString("dd MMM yyyy HH:mm:ss"));
    }
}
