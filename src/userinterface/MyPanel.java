/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import DataModel.PersonModel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author saadb
 */
public class MyPanel extends JPanel implements ActionListener,MouseListener{
    
    JTextField input1;
    JTextField input2;
    JButton add;
    JButton mul;
    JButton sub;
    JLabel   result;
    JTable jTable;
    PersonModel model;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        double a,b , res=0;
        a=Double.parseDouble(input1.getText());
        b=Double.parseDouble(input2.getText());
        if(e.getSource()==add){
            res=a+b;
        }
        if(e.getSource()==mul){
            res=a*b;
        }
        if(e.getSource()==sub){
            res=a-b;
        }
        result.setText(res+"");
    }

    public MyPanel() {
        input1=new JTextField();
        input2=new JTextField();
        input1.setPreferredSize(new Dimension(100, 30));
        input2.setPreferredSize(new Dimension(100, 30));
        model=new PersonModel();
        jTable=new JTable(model);
        
        add=new JButton("Add"); mul=new JButton("Mul") ; sub=new JButton("Sub");
        result=new JLabel("My result here");
        
        this.add(input1); this.add(input2); this.add(add);
        this.add(result); this.add(mul) ; this.add(sub);
        this.add(jTable);
        
        add.addActionListener(this); 
        add.addActionListener(new MyListner());
        mul.addActionListener(this);
        sub.addActionListener(this);
        sub.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setBackground(Color.red);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setBackground(Color.GREEN);
    }


}
