/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.Operator.Op_Arithmetic;

/**
 *
 * @author radgeek
 */
public class TestOpArithmetic {
    
    public static void main(String [] args){
        
        int a = 10;
        
        System.out.println("Now, a = " + a);
        System.out.println("Operation: a++ = " + a++);
        System.out.println("Now, a = " + a);
        System.out.println("Operation, ++a = " + ++a);
        System.out.println("Now, a = " + a);
        
        System.out.println("\n");
        int x = 10;
        
        System.out.println(--x);
        System.out.println( x++ + 21 + ++x);
        
        System.out.println("\n");
        int y = 10;
        System.out.println(--x);
        System.out.println(x++ + "dan" + ++x);
    }
    
}
