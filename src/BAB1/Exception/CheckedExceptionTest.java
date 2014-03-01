/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author radgeek
 */
public class CheckedExceptionTest {
    
    public static void main(String [] args){
        try{
            FileInputStream file = new FileInputStream("file.txt");
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Kode setelah buka file");
        
    }
    
}
