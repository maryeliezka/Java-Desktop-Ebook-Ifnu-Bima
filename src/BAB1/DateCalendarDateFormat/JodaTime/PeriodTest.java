/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.DateCalendarDateFormat.JodaTime;

import org.joda.time.DateTime;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.Period;

/**
 *
 * @author radgeek
 */
public class PeriodTest {
    public static void main(String[] args){
        Period p = new Period(1000); // 1000 milidetik = 1 detik
        System.out.println("Period: " + p);
        p = new Period(2,3,9,125); // 2jam, 3 menit, 9 detik, 125 milidetik
        System.out.println("Period: " + p);
        DateTime startTime = new DateTime(2000,1,1,9,0,0); // tahun 2000, bulan 1, tanggal 1, jam 9, menit 0, detik 0
        DateTime endTime = startTime.plus(p);
        System.out.println("End Time: " + endTime);
        Hours hours = Hours.hoursBetween(startTime, endTime);
        int hoursBetween = hours.getHours();
        System.out.println("Hours duration: " + hours + " " + hoursBetween);
        Minutes minutes = Minutes.minutesBetween(startTime, endTime);
        System.out.println("Minutes duration: " + minutes);
    }
}
