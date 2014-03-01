/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.Collection_Generics.Classes.CollectionsArraysClass;

import java.util.Arrays;

/**
 *
 * @author radgeek
 */
public class CopyPartialArrayTest {
    public static void main(String [] args){
        String[] names = {"me", "you", "they", "us"};
        
        String[] n = Arrays.copyOf(names, 2);
        System.out.println("setelah dipotong: " + Arrays.toString(n));
        
        n = Arrays.copyOf(names, 7);
        System.out.println("setelah ditambah: " + Arrays.toString(n));
        
        n = Arrays.copyOfRange(names, 1, 3);
        System.out.println("setelah dipotong: " + Arrays.toString(n));
        
        n = Arrays.copyOfRange(names, 2, 10);
        System.out.println("setelah dipotong dan bertambah panjang: " + Arrays.toString(n));
    }
}
