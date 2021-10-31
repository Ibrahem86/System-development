
package forme;

import javax.swing.*;


public class FormClass extends JFrame{
    JButton b1,b2;
    JTextField t1;
    JPasswordField t2;
    JRadioButton r1,r2,r3,r4;
    JLabel l1,l2,l3,l4,l5;
    ButtonGroup g1,g2;
    JCheckBox c1,c2,c3,c4;
    
    public FormClass(){
        Frame();
    }
    public void Frame(){
        this.setTitle("Form");
        this.setSize(700,800 );
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocation(200, 100);
        b1 = new JButton ("login");
        b2 = new JButton ("Show");
        t1 = new JTextField();
        t2 = new JPasswordField();
        r1 = new JRadioButton("male");
        r2 = new JRadioButton("female");
        r3 = new JRadioButton("single");
        r4 = new JRadioButton("married");
        g1 = new ButtonGroup();
        g2 = new ButtonGroup();
        c1 = new JCheckBox("CA");
        c2 = new JCheckBox("IT");
        c3 = new JCheckBox("CS");
        c4 = new JCheckBox("IS");
        l1 = new JLabel("Full Name");
        l2 = new JLabel("Password");
        l3 = new JLabel("Gender :");
        l4 = new JLabel("Stetus :");
        l5 = new JLabel("Spcialise :");
        l1.setBounds(150, 100, 100 , 40);
        l2.setBounds(150, 150, 100 , 40);
        t1.setBounds(250, 100, 200 , 40);
        t2.setBounds(250, 150, 200 , 40);
        this.add(l1);this.add(l2);this.add(t1);this.add(t2);
        b1.setBounds(240, 220, 90, 30);
        b2.setBounds(360, 220, 90, 30);
        this.add(b1);this.add(b2);
        r1.setBounds(170, 290, 70, 30);
        r2.setBounds(300, 290, 70, 30);
        r3.setBounds(170, 320, 70, 30);
        r4.setBounds(300, 320, 70, 30);
        g1.add(r1);g1.add(r2);
        g2.add(r3);g2.add(r4);
        this.add(r1);this.add(r2);
        this.add(r3);this.add(r4);
        l3.setBounds(60, 285, 70, 40);
        l4.setBounds(60, 315, 70, 40);
        this.add(l3);this.add(l4);
        l5.setBounds(60, 350, 70, 40);
        this.add(l5);
        c1.setBounds(180, 355, 50, 30);
        c2.setBounds(250, 355, 50, 30);
        c3.setBounds(320, 355, 50, 30);
        c4.setBounds(390, 355, 50, 30);
        this.add(c1);this.add(c2);this.add(c3);this.add(c4);
    }
}
