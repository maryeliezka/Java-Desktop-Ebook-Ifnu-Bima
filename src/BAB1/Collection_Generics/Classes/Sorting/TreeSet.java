/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.Collection_Generics.Classes.Sorting;

import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author radgeek
 */
public class TreeSet {
    public static void main(String [] args){
        Set<Customer> customers = new java.util.TreeSet<Customer>();
        
        Customer id1 = new Customer();
        id1.setId(1L);
        customers.add(id1);
        Customer id2 = new Customer();
        id2.setId(2L);
        customers.add(id2);
        Customer c = new Customer();
        c.setId(1L);
        customers.add(c);
        
        Iterator<Customer> i = customers.iterator();
        while(i.hasNext()){
            Customer current = i.next();
            System.out.println("Keranjang no-" + current.hashCode()
                    + " idnya: " + current.getId());
        } 
    }
}
