/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BAB1.FeelJava.EnchancedforLoop;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author raditya
 */
public class ForLoopMap {
    public static void main(String[] args){
        Map<String, String> maps = new HashMap<String, String>();
        maps.put("Rp", "Rupiah");
        maps.put("$", "Dollar");
        for(String key : maps.keySet()){
            System.out.println("key: " + key);
            System.out.println("value: " + maps.get(key));
        }
    }
}
