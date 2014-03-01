/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.OOP.Inheritance;

/**
 *
 * @author radgeek
 */
public class CustomerTest {
    public static void main(String [] args){
        MemberCustomer member = new MemberCustomer();
        member.setId(100L);
        System.out.println("Id Customer: " + member.getId());
    }
}
