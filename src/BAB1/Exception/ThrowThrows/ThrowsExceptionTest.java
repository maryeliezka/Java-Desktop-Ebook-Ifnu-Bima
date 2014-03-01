/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.Exception.ThrowThrows;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author radgeek
 */
public class ThrowsExceptionTest {
    
    public static void main(String [] args) throws FileNotFoundException, IOException{
        
        try{
            methodTidakBertanggungJawab();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        System.out.println("Kode dalam method main");
    }
    
    public static void methodTidakBertanggungJawab() throws FileNotFoundException, IOException{
        
            FileInputStream file = new FileInputStream("file.txt");
            System.out.println("Kode setelah buka file");
        
    }
}
