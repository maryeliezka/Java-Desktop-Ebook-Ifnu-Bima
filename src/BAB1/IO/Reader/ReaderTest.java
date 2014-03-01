/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.IO.Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author radgeek
 */
public class ReaderTest {
    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("Example.txt"));
            String line;
            while((line = reader.readLine())!=null){
                System.out.println(line + "\n");
            }
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
