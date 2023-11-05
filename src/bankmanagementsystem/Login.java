package bankmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    
    JLabel l1,l2,l3;
    JTextField tf;
    JPasswordField pf;
    JButton b1,b2,b3;
    
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel jl1 = new JLabel(i3);
        jl1.setBounds(70, 10, 100, 100);
        add(jl1);
        
        l1 = new JLabel("WELCOME TO ATM");
        l1.setFont(new Font("Osward", Font.BOLD, 38));
        l1.setBounds(200,40,450,40);
        add(l1);
        
        l2 = new JLabel("Card No:");
        l2.setFont(new Font("Raleway", Font.BOLD, 28));
        l2.setBounds(125,150,200,30);
        add(l2);
        
        tf = new JTextField();
        tf.setFont(new Font("Arial", Font.BOLD, 14));
        tf.setBounds(300,150,230,30);
        add(tf);
        
        l3 = new JLabel("PIN:");
        l3.setFont(new Font("Raleway", Font.BOLD, 28));
        l3.setBounds(125,220,375,30);
        add(l3);
        
        pf = new JPasswordField();
        pf.setFont(new Font("Arial", Font.BOLD, 14));
        pf.setBounds(300,220,230,30);
        add(pf);
        
        b1 = new JButton("SIGN IN");
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setBounds(300,300,100,30);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("CLEAR");
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBounds(430,300,100,30);
        b2.addActionListener(this);
        add(b2);
        
        b3 = new JButton("SIGN UP");
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.setBounds(300,350,230,30);
        b3.addActionListener(this);
        add(b3);
        
        setLayout(null);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,480);
        setLocation(400,100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        try{
            Conn c1 = new Conn();
            if(ae.getSource()==b1){
                
            }
            else if(ae.getSource()==b2){
                tf.setText("");
                pf.setText("");
            }
            else if(ae.getSource()==b3){
                setVisible(false);
                new Signup().setVisible(true);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login().setVisible(true);
    }
}