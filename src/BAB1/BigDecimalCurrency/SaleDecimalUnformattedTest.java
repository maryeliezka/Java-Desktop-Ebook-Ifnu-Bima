/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.BigDecimalCurrency;

/**
 *
 * @author radgeek
 */
public class SaleDecimalUnformattedTest {
    public static void main(String[] args){
        double amount = 1000000.05;
        double discount = amount * 0.10;
        double total = amount - discount;
        double tax = total * 0.05;
        double taxTotal = tax + total;
        
        System.out.println("Subtotal: " + amount);
        System.out.println("Discount: " + discount);
        System.out.println("Total: " + total);
        System.err.println("Tax: " + tax);
        System.err.println("Tax+Total: " + taxTotal);
    }
}
