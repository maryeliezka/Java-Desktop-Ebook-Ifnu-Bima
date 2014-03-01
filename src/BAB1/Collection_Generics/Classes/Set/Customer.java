/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.Collection_Generics.Classes.Set;

/**
 *
 * @author radgeek
 */
public class Customer {
    private Long id;
    
    public void setId(long id){
        this.id = id;
    }
    
    public Long getId(){
        return this.id;
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
