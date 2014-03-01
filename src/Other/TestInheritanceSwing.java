/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Other;

import javax.swing.JFrame;

/**
 *
 * @author radgeek
 */
public class TestInheritanceSwing extends JFrame {
    public TestInheritanceSwing(){
        setDefaultLookAndFeelDecorated(true);
        setVisible(true);
        pack();
        setSize(100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String [] args){
        TestInheritanceSwing test = new TestInheritanceSwing();
    }
}
