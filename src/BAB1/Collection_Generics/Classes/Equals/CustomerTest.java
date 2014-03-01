/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.Collection_Generics.Classes.Equals;

/**
 *
 * @author radgeek
 */
public class CustomerTest {
    public static void main(String [] args){
        Customer cust = new Customer();
        MemberCustomer member = new MemberCustomer();
        
        cust.setId(100L);
        member.setId(100L);
        System.out.println("cust.equals(member): " + cust.equals(member));
    }
}
