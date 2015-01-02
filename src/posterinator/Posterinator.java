/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posterinator;

import javax.swing.JFrame;

/**
 *
 * @author Arthur
 */
public class Posterinator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        window w=new window();
        w.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        w.setVisible(true);
    }
    
}