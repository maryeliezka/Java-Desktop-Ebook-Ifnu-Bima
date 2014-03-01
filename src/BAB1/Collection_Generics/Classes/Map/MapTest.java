/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.Collection_Generics.Classes.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author radgeek
 */
public class MapTest {
    public static void main(String [] args){
        Map<String, List<Customer>> customerCityByMap = new HashMap<String, List<Customer>>();
        List<Customer> jakartaCust = new ArrayList<Customer>();
        
        Customer a = new Customer();
        a.setId(1L);
        a.setNama("SuwitoPORN");
        jakartaCust.add(a);
        /* membuat objek customer baru (a) dengan id: 1
         * jakartaCust adalah objek list yang akan berfungsi sebagai key pada Map.
         * Map bisa digunakan sebagai pencari dari value berdasarkan key. Key unik karena menggunakan Set
         * 
         */
        
        Customer b = new Customer();
        b.setId(2L);
        b.setNama("PUR");
        jakartaCust.add(b);
        customerCityByMap.put("jakarta", jakartaCust);
        List<Customer> surabayaCust = new ArrayList<Customer>();
        
        Customer c = new Customer();
        c.setId(3L);
        c.setNama("EMANS");
        surabayaCust.add(c);
        customerCityByMap.put("surabaya", surabayaCust);
        
        Set<String> keys = customerCityByMap.keySet(); //method keySet() berfungsi untuk mengambil Key dari sebuah Map. Lalu dimasukkan ke dalam objek keys dari Set<String>
        Iterator<String> iterator = keys.iterator(); //melakukan perulangan untuk isi dari keys (atau untuk setiap key dalam Map)
        while(iterator.hasNext()){ //ketika ada elemen berikutnya dari Set (atau true), maka
            String key = iterator.next(); //assign nilai key dari value iterator yang sedang berlangsung (key saat ini dari Map)
            List<Customer> customers = customerCityByMap.get(key); //method get() berfungsi mengambil VALUE objek Customer dari Map berdasarkan KEY dan dimasukkan ke dalam objek cust
            for(int i = 0; i < customers.size(); i++){ //looping untuk list objek dalam cust (misal: jakartaCust, ada 2 objek di dalamnya), dan untuk setiap objek dilakukan perintah berikut:
                Customer cust = customers.get(i); //mengambil value objek yang ada dalam list berdasarkan nilai i
                System.out.println("Kota: " + key + "\nCustomer id: " + cust.getId() + ", Nama: " + cust.getNama() + "\n================\n");
                //mencetak Kota berdasarkan KEY dari Map, Id Customer dan Nama dari objek dalam looping i.
            }
        }
    }
}
