/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BAB1.IO.Writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author raditya
 */
public class WriterTest {
    public static void main(String[] args){
        try{
            BufferedWriter write = new BufferedWriter(new FileWriter("Example.txt"));
            write.write("Hello World!");
            write.flush();
            write.write("Hello World!!");
            write.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
