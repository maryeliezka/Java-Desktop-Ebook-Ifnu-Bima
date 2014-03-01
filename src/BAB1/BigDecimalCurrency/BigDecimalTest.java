/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.BigDecimalCurrency;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author radgeek
 */
public class BigDecimalTest {
    public static void main(String[] args){
        BigDecimal amount = new BigDecimal("1000000.05");
        BigDecimal discountPercent = new BigDecimal("0.10");
        BigDecimal discount = amount.multiply(discountPercent);
        discount = discount.setScale(2, RoundingMode.HALF_UP);
        BigDecimal total  = amount.subtract(discount);
        total = total.setScale(2, RoundingMode.HALF_UP);
        BigDecimal taxPercent = new BigDecimal("0.05");
        BigDecimal tax = total.multiply(taxPercent);
        tax.setScale(2, RoundingMode.HALF_UP);
        BigDecimal taxedTotal = total.add(tax);
        taxedTotal = taxedTotal.setScale(2, RoundingMode.HALF_UP);
        
        NumberFormat money = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));
        
        System.out.println("Subtotal: " + money.format(amount));
        System.out.println("Discount: " + money.format(discount));
        System.out.println("Total: " + money.format(total));
        System.err.println("Tax: " + money.format(tax));
        System.err.println("Tax+Total: " + money.format(taxedTotal));
    }
}
