/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.DateCalendarDateFormat;

import java.util.Date;

/**
 *
 * @author radgeek
 */
public class GetTimeNow {
    public static void main(String[] agrs){
        //Long waktuSekarang = System.currentTimeMillis();
        //System.out.println(waktuSekarang);
        
        /*
        Date d = new Date();
        int tahun = d.getYear();
        int bulan = d.getMonth();
        int hari = d.getDay();
        Long waktuSekarang = d.getTime();
        System.out.println("Waktu Sekarang: " + waktuSekarang
                + "\nHari: " + hari
                + "\nBulan: " + bulan
                + "\nTahun: " + tahun);
                **/
        
        Long waktuSekarang = System.currentTimeMillis();
        Date d = new Date(waktuSekarang);
        System.out.println(d);
        
    }
}
