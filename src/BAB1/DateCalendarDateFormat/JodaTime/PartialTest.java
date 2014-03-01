/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.DateCalendarDateFormat.JodaTime;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
/**
 *
 * @author radgeek
 */
public class PartialTest {
    public static void main(String[] args){
        LocalDate birthday = new LocalDate(1965, 1, 23);
        long millis = birthday.toDateTimeAtCurrentTime().getMillis();
        System.out.println(millis);
        birthday = birthday.plusYears(27);
        int year = birthday.getYear();
    }
}
