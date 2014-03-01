/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.IO.File;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author radgeek
 */
public class FileTest {
    public static void main(String[] args){
        File f = new File("newfile.txt");
        if(!f.exists()){
            try{
                f.createNewFile();
                System.out.println(f.getAbsolutePath());
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        
        File folder = new File("newfolder");
        if(!folder.exists()){
            folder.mkdir();
            // folder.mkdirs() membuat folder dalam folder
        }
        
        File currentFolder = new File(System.getProperty("user.dir"));
        File[] siblings = currentFolder.listFiles();
        for(int i=0; i<siblings.length; i++){
            File sibling = siblings[i];
            if(sibling.isFile()){
                System.out.println("f: " + sibling.getName());
            }else{
                System.out.println("d: " + sibling.getName());
            }
        }
    }
}
