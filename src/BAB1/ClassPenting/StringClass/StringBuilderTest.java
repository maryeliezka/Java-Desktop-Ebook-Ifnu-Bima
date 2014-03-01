/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.ClassPenting.StringClass;

/**
 *
 * @author radgeek
 */
public class StringBuilderTest {
    public static void main(String[] args){
        StringBuilder s = new StringBuilder("Ini StringBuilder tidak immutable");
        System.out.println("Sebelum operasi concat nilai s: " + s);
        s.append("concat");
        System.out.println("Setelah operasi concat nilai s: " + s);
        s.append(s.append("concat")).append("objek baru");
    }
    
}
