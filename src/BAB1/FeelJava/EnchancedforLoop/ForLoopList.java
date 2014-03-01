/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BAB1.FeelJava.EnchancedforLoop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raditya
 */
public class ForLoopList {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        for(String current : list){
            System.out.println("Current data from list: " + current);
        }
    }
}
