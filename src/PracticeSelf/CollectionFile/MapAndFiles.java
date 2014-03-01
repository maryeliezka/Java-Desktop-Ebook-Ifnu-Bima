/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeSelf.CollectionFile;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author radgeek
 */
public class MapAndFiles {
    public static void main(String[] args){
        Map<String, List<List<File>>> list = new HashMap<String, List<List<File>>>();
        List<List<File>> lists = new ArrayList<List<File>>();
        List<File> listFiles = new ArrayList<>();
        List<File> listDir = new ArrayList<>();
        File f = new File(System.getProperty("user.dir"));
        
        //System.out.println("output!");
        
        for(int i=0; i<lists.size(); i++){
            List<File> listInLists = lists.get(i);
            for(int j=0; i<listInLists.size(); i++){
                File doubleInLists = listInLists.get(i);
                if(doubleInLists.isFile()){
                    listFiles.add(doubleInLists);
                    lists.add(listFiles);
                    list.put("f", lists);
                }else{
                    listDir.add(doubleInLists);
                    lists.add(listDir);
                    list.put("d", lists);
                }
            }
            
            
        }
        
        Set<String> keys = list.keySet();
        Iterator<String> iterator = keys.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            List<List<File>> masterFileDir = list.get(key);
            for(int i=0; i<masterFileDir.size(); i++){
                List<File> files = masterFileDir.get(i);
                for(int j=0; j<files.size(); j++){
                File file = files.get(j);
                System.out.println("Code: " + key + "\nName: " + file.getName() + "  | Type: " + ((key.equals("d")) ? "Directory" : "Files"));
            }
            }
            System.out.println("=========");
        }
    }
}
