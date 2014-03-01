/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.Collection_Generics.Classes.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import sun.java2d.loops.CustomComponent;

/**
 *
 * @author radgeek
 */
public class CustomerSetTest {
    public static void main(String [] args){
        Set<Customer> customers = new HashSet<Customer>();
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
        } //alasan kenapa tidak memakai perulangan FOR dan memakai Iterator adalah karena isi dari customers yang berupa objek ingin dihitung. customers adalah objek yang kita buat sendiri, oleh karena itu harus 
    }
    
}
