/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.Operator.Op_Ternary;

/**
 *
 * @author radgeek
 */
public class TestOpTernary {    
    
     public static void main(String [] args){
        
         int x = 100;
         String s = (x < 10) ? "kurang dari sepuluh" : (x > 100) ? "lebih dari seratus" : 
                 "sama dengan seratus";
         
         System.out.println(s);
        
    }
    
}
