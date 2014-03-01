/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.OOP.Inheritance;

/**
 *
 * @author radgeek
 */
public class Customer {
    private Long id;
    private Address address;
    
    public void setId(long id){
        this.id = id;
    }
    
    public Long getId(){
        return this.id;
    }
    
    public void setAddress(Address address){
        this.address = address;
    }
    
    public Address getAddress(){
        return this.address;
    }
}
