/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.Operator.Op_InstanceOf;

/**
 *
 * @author radgeek
 */
public class TestOperationInstanceOf {
    
    public static void main(String [] args){
        String test = "this is test";
        
        if(test instanceof String){
            System.out.println("Yes, variable 'test' is instance of String");
        }else{
           System.out.println("No, variable 'test' isn't instance of String");
        }
    }
    
}
