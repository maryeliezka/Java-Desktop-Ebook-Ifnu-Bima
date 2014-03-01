/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.Exception.ClassException;

/**
 *
 * @author radgeek
 */
public class ExceptionPertamaTest {
    public static void main(String [] args){
        try{
            System.out.println("Eksekusi exception pertama");
            throw new ExceptionPertama("ini pesan exception pertama");
        }catch(ExceptionPertama ex){
            ex.printStackTrace();
        }
    }
}
