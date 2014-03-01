/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BAB1.IO.InputStream;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author raditya
 */
public class UrlInputStreamTest {
    public static void main(String[] args){
        try{
            URL url = new URL("http://www.yahoo.com");
            URLConnection urlconn = url.openConnection();
            InputStream is = urlconn.getInputStream();
            int byteRead;
            do{
                byteRead = is.read();
                System.out.print((char)byteRead);
            }while(byteRead != -1);
        }catch(MalformedURLException e){
            
        }catch(IOException e){
            
        }
    }
}
