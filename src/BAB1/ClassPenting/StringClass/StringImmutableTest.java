/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.ClassPenting.StringClass;

/**
 *
 * @author radgeek
 */
public class StringImmutableTest {
    public static void main(String [] args){
        String s = "ini string immutable";
        System.out.println("sebelum operasi concat nilai s : " + s);
        
        s.concat("concat");
        System.out.println("sesudah operasi concat nilai s : " + s);
        
        String concat = s + s.concat("concat") + " objek baru";
        //System.out.println(concat);
    }
}
