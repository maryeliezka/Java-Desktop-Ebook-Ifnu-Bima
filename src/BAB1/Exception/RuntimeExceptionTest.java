/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.Exception;

/**
 *
 * @author radgeek
 */
public class RuntimeExceptionTest {
    
    public static void main(String [] args){
        
        try{
            int i = Integer.parseInt("abc");
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
            
        
        System.out.println("Kode setelah Exception");
    }
    
}
