/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.Operator.Op_Relasi;


public class CompareWrapperClass {
    
    public static void main(String [] args){
        Integer i = new Integer(10);
        Integer x = new Integer(10);
        
        System.out.println("new Integer(10) == new Integer(10)? " + (i==x));
        System.out.println("new Integer(10) 'equals' new Integer(10)? " + (i.equals(x)));
    }
    
}
