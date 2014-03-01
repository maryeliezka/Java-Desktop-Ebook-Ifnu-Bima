/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.DateCalendarDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author radgeek
 */
public class SimpleDateFormatTest {
    public static void main(String[] args){
        Date now = new Date();
        System.out.println(new SimpleDateFormat("dd/MM/yyyy H:mm:ss").format(now));
        String tanggal = "21/12/1990 08:09:10";
        
        try{
            Date date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(tanggal);
            System.out.println("\nTanggal yang diformat dari Date: " + new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(date));
        }catch(ParseException e){
            e.printStackTrace();
            e.getMessage();
        }
    }
}
