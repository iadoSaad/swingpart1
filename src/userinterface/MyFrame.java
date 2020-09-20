/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author saadb
 */
public class MyFrame  extends JFrame{
    
    MyPanel myPanel;

    public MyFrame() throws HeadlessException {
        myPanel=new MyPanel();
        setContentPane(myPanel);
        setSize(800, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
       
}
