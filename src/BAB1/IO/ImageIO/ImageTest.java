/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BAB1.IO.ImageIO;

import java.net.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
/**
 *
 * @author raditya
 */
public class ImageTest {
    public static void main(String[] args){
        try{
            URL url = new URL("http://ifnubima.org/wp-content/uploads/2010/07/2010-07-25_0334.png");
            URLConnection urlcon = url.openConnection();
            InputStream is = urlcon.getInputStream();
            OutputStream os = new FileOutputStream("image.png");
            int byteRead;
            do{
                byteRead = is.read();
                os.write(byteRead);
            }while(byteRead!=-1);
            os.flush();
            os.close();
            Icon icon = new ImageIcon(ImageIO.read(new File("image.png")));
            JOptionPane.showMessageDialog(null, "ini gambar", "menampilkan gambar", JOptionPane.INFORMATION_MESSAGE, icon);
        }catch(MalformedURLException e){
            
        }catch(IOException e){
            
        }
    }
}
