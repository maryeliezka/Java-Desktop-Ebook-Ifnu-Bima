/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.DateCalendarDateFormat.JodaTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author radgeek
 */
public class CalculateDateTest {
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        c.set(2000, Calendar.JANUARY, 1, 0, 0);
        c.add(Calendar.DATE, 20);
        SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
        System.out.println("date: " + format.format(c.getTime()));
    }
}
