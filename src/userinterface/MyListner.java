/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author saadb
 */
public class MyListner implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("I'am i listner the Component "+ ((JButton)e.getSource()).getText() + "is the source of event");
    }
    
    
}
