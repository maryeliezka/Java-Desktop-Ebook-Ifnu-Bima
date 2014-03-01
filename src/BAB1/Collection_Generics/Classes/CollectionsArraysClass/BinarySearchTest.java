/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.Collection_Generics.Classes.CollectionsArraysClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author radgeek
 */
public class BinarySearchTest {
    public static void main(String [] args){
        List<Customer> customers = new ArrayList<Customer>();
        
        Customer id1 = new Customer();
        id1.setId(10L);
        Customer id2 = new Customer();
        id2.setId(2L);
        Customer id3 = new Customer();
        id3.setId(5L);
        customers.add(id1);
        customers.add(id2);
        customers.add(id3);
        
        Collections.sort(customers);
        int index = Collections.binarySearch(customers, id3);
        System.out.println("Customer dengan id: " + id3.getId() + " ditemukan di index ke-" + index);
    }
}
