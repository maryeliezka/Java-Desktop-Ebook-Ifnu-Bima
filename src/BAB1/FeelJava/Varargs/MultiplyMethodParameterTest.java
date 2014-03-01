/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BAB1.FeelJava.Varargs;

/**
 *
 * @author raditya
 */
public class MultiplyMethodParameterTest {
    public void printAll(String... param){
        for(String curr : param){
            System.out.println("Parameter: " + curr);
        }
    }
    
    public static void main(String[] agrs){
        MultiplyMethodParameterTest mmpt = new MultiplyMethodParameterTest();
        mmpt.printAll("A", "B", "C", "1", "2", "3");
    }
}
