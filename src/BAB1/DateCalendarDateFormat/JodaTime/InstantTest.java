/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.DateCalendarDateFormat.JodaTime;

import org.joda.time.Instant;
/**
 *
 * @author radgeek
 */
public class InstantTest {
    public static void main(String[] args){
        Instant instant = new Instant(1000);
        instant = instant.plus(100);
        instant = instant.plus(60000);
        System.out.println(instant);
    }
}
