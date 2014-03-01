/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.DateCalendarDateFormat.JodaTime;

import java.util.Calendar;
import java.util.Date;
import org.joda.time.DateTime;
/**
 *
 * @author radgeek
 */
public class DateTimeTest {
    public static void main(String[] args){
        DateTime dateTime = new DateTime();
        
        int date = dateTime.getDayOfMonth();
        System.out.println("Tanggal: " + date);
        
        int month = dateTime.getMonthOfYear();
        System.out.println("Bulan: " + month);
        
        int year = dateTime.getYear();
        System.out.println("Tahun: " + year);
        
        int jam = dateTime.getHourOfDay();
        System.out.println("Jam: " + jam);
        
        int menit = dateTime.getMinuteOfHour();
        System.out.println("Menit: " + menit);
        
        int detik = dateTime.getSecondOfMinute();
        System.out.println("Detik: " + detik);
        
        DateTime plusMonth = dateTime.plusMonths(2);
        DateTime plusMinute = dateTime.plusMinutes(2);
        
        Date d = plusMonth.toDate();
        Calendar cal = plusMinute.toGregorianCalendar();
        
        System.out.println(dateTime);
    }
}
