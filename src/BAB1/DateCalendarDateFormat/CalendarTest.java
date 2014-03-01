/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.DateCalendarDateFormat;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author radgeek
 */
public class CalendarTest {
    public static void main(String[] args){
        Calendar calendar = new GregorianCalendar(2000, Calendar.FEBRUARY, 1);
        int maxFeb = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(maxFeb);
    }
}
