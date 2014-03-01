/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.Collection_Generics.Classes.Equals;

import java.util.Objects;

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
        return false; //jika tidak ada obj atau obj sama dengan null maka equals mengembalikan nilai false
    }
    if(getClass() != obj.getClass()){
        return false; //jika class ini class objek ini tidak sama dengan class objek lain maka equals mengembalikan nilai false
    }
    final Customer other = (Customer)obj; //mendeklarasikan objek other dengan tipe Customer dan casting dari variabel obj
    if(this.id != other.id && (this.id == null || !this.id.equals(other.id))){ //jika nilai id class ini tidak sama dengan nilai id dari class lain DAN id class ini sama dengan null ATAU NEGASI id class ini equals id class lain
        return false;
    }
    return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }
    
    
}
