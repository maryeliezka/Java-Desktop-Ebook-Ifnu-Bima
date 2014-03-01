/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BAB1.FeelJava.TypeSafeEnum;

/**
 *
 * @author raditya
 */
public class EnumTest {
    Day day;
    
    public EnumTest(Day day){
        this.day = day;
    }
    
    public void tellItLikeItIs(){
        switch(day){
            case MONDAY :
                System.out.println("It's: " + day);
                break;
            case FRIDAY :
                System.out.println("Alhamdulillah, we pray Jumu'ah on " + day);
                break;
            default:
                System.out.println("---");
                break;
        }
    }
    
    public static void main(String[] args){
        EnumTest et = new EnumTest(Day.FRIDAY);
        et.tellItLikeItIs();
    }
}
