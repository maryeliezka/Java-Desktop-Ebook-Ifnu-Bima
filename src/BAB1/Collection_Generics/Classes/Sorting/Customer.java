/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.Collection_Generics.Classes.Sorting;

/**
 *
 * @author radgeek
 */
public class Customer implements Comparable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    
    @Override
    public int compareTo(Object o) {
        Customer c = (Customer)o;
        return getId().compareTo(c.getId());
    }
    
    public boolean equals(Object obj){
    if(obj == null){
        return false;
    }
    if(getClass() != obj.getClass()){
        return false;
    }
    final Customer other = (Customer)obj; 
    if(this.id != other.id && (this.id == null || !this.id.equals(other.id))){
        return false;
    }
    return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7; 
        hash = 53 * hash + (this.id != null ? this.id.hashCode() : 0); //53 * 7 = 371 + 2 = 373 atau 371 + 1 = 372
        return hash;
    }
    
}
