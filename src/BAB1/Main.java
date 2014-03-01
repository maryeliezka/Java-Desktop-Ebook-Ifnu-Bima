/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BAB1;


/**
 *
 * @author raditya
 */
public class Main {
    public static void main(String[] args) {
        int total = 0;
        for(int i=0; i<100; i++){
            if(i%5 == 0){
                total+=1;
            }
        }
        System.out.println(total);
    }
}
