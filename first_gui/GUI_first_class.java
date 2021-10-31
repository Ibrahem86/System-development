/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
public class GUI_first_class extends JFrame {
    JButton b1 = new JButton("  1  ");
    JButton b2 = new JButton("  2  ");
    JButton b3 = new JButton("  3  ");
    JButton b4 = new JButton("  4  ");
    JButton b5 = new JButton("  5  ");
    JButton b6 = new JButton("  6  ");
    JButton b7 = new JButton("  7  ");
    JButton b8 = new JButton("  8  ");
    JButton b9 = new JButton("  9  ");
    JButton b10 = new JButton("  0  ");
    JButton b11 = new JButton("  +  ");
    JButton b12 = new JButton("  =  ");
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JTextField t1 = new JTextField();
    public GUI_first_class()
    { 
       frame();
    }
    public void frame(){
       this.setTitle("Fiest_GUI");
       this.setSize(300, 500);
       this.setVisible(true);
       this.setResizable(false);
       p1.setLayout(null);
       p1.setBackground(Color.black);
       p2.setBackground(Color.LIGHT_GRAY);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(new GridLayout(2,1));
       p1.add(t1);
       t1.setBounds(50, 100, 200,50 );
       this.add(p1);this.add(p2);
       p2.setLayout(new GridLayout(3,4,2,2));
       p2.add(b1);p2.add(b2);p2.add(b3);p2.add(b4);
       p2.add(b5);p2.add(b6);p2.add(b7);p2.add(b8);
       p2.add(b9);p2.add(b10);p2.add(b11);p2.add(b12);
      
       
    
    }
    
    
}
