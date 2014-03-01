/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.Collection_Generics.Classes.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author radgeek
 */
public class ListTest {
    public static void main(String [] args){
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("z");
        System.out.println("Isi dari list: ");
        
        /*for(int i=0; i<list.size(); i++){
            System.out.println("Index ke-" + i + ": " + list.get(i));
        }*/
        
        Iterator<String> i = list.iterator();
        while(i.hasNext()){
            String curr = i.next();
            System.out.println("Indeks ke-" + i + " adalah:" + curr);
        }
    }
}
