/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.BigDecimalCurrency;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author radgeek
 */
public class DoubleProblemTest {
    public static void main(String[] args){
        double dd = .35;
        BigDecimal d = new BigDecimal(dd);
        System.out.println(".35 = " + d);
        d = d.setScale(2, RoundingMode.HALF_UP);
        System.out.println(".35 = " + d);
        BigDecimal dec = new BigDecimal("0.35");
        System.out.println(".35 = " + dec);
        
    }   
}
