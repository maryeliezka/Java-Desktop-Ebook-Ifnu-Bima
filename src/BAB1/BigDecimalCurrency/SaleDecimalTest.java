/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.BigDecimalCurrency;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author radgeek
 */
public class SaleDecimalTest {
    public static void main(String[] args){
        double amount = 1000000.05;
        double discount = amount * 0.10;
        double total = amount - discount;
        double tax = total * 0.05;
        double taxTotal = tax + total;
        
        NumberFormat money = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));
        
        System.out.println("Subtotal: " + money.format(amount));
        System.out.println("Discount: " + money.format(discount));
        System.out.println("Total: " + money.format(total));
        System.err.println("Tax: " + money.format(tax));
        System.err.println("Tax+Total: " + money.format(taxTotal));
    }
}
