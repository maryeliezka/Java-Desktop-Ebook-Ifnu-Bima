/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.Collection_Generics.Classes.Equals;

/**
 *
 * @author radgeek
 */
public class EqualsTest {
    public static void main(String [] args){
        String abc = new String("abc");
        String abc1 = new String("abc");
        boolean equalsOperator = (abc == abc1);
        System.out.println("abc == abc1 ? " + equalsOperator);
        boolean equalsMethod = abc.equals(abc1);
        System.out.println("abc.equals(abc1) ? " + equalsMethod);
    }
}
