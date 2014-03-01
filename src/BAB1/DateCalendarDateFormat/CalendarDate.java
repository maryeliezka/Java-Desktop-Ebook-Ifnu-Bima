/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.DateCalendarDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author radgeek
 */
public class CalendarDate {
    public static void main(String[] args){
        Calendar calendar = new GregorianCalendar(2000, Calendar.JANUARY, 1);
        /*
        calendar.set(2000, Calendar.JANUARY, 1, 0, 0, 0);
        Date d = calendar.getTime();
        System.out.println(d);
        */
        
        /*
        int tahun = calendar.get(Calendar.YEAR);
        calendar.add(Calendar.MONTH, 1);
        int bulan = calendar.get(Calendar.MONTH);
        int tanggal = calendar.get(Calendar.DATE);
        int hari = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("Tahun: " + tahun
                + "\nBulan: " + bulan
                + "\nTanggal: " + tanggal
                + "\nHari: " + hari);
                */
       
        /*
        int bulan = calendar.get(Calendar.MONTH);
        System.out.println(bulan);
        */
        
        /*
        Calendar calendar = new GregorianCalendar(2000, Calendar.JANUARY, 31,0,0,0);
        calendar.roll(Calendar.DATE, 1);
        Date d = calendar.getTime();
        System.out.println(d);
        */
    }
}
