package bankmanagementsystem;

import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import java.sql.*;

public class Signup extends JFrame implements ActionListener{
    
    Random ran = new Random();
    int number = ran.nextInt(9999);
    String first = "" + Math.abs(number);
    JLabel lh,lsh,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
    JRadioButton r1,r2,r3,r4,r5;
    JDateChooser datechoser;
    JButton but;
    Signup(){
        setTitle("NEW ACCOUNT APPLICATION FORM");
        getContentPane().setBackground(Color.white);
        
        lh = new JLabel("APPLICATION FORM NO.  "+number);
        lh.setFont(new Font("Raleway",Font.BOLD,38));
        lh.setBounds(130, 20, 600, 40);
        add(lh);
        
        lsh = new JLabel("Page 1:Personal Details");
        lsh.setFont(new Font("TimesRoman",Font.BOLD,22));
        lsh.setBounds(290, 80, 600, 30);
        add(lsh);
        
        l1 = new JLabel("Name:");
        l1.setFont(new Font("Raleway", Font.BOLD, 20));
        l1.setBounds(100,140,100,30);
        add(l1);
        
        tf1 = new JTextField();
        tf1.setFont(new Font("Raleway", Font.BOLD, 14));
        tf1.setBounds(300,140,400,30);
        add(tf1);
        
        l2 = new JLabel("Father's Name:");
        l2.setFont(new Font("Raleway", Font.BOLD, 20));
        l2.setBounds(100,190,200,30);
        add(l2);
        
        tf2 = new JTextField();
        tf2.setFont(new Font("Raleway", Font.BOLD, 14));
        tf2.setBounds(300,190,400,30);
        add(tf2);
        
        l3 = new JLabel("Date Of Birth:");
        l3.setFont(new Font("Raleway", Font.BOLD, 20));
        l3.setBounds(100,240,200,30);
        add(l3);
        
        datechoser = new JDateChooser();
	datechoser.setBounds(300, 240, 400, 30);
	add(datechoser);
        
        l4 = new JLabel("Gender:");
        l4.setFont(new Font("Raleway", Font.BOLD, 20));
        l4.setBounds(100,290,200,30);
        add(l4);
        
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.white);
        r1.setBounds(300, 290, 60, 30);
        add(r1);
        
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.white);
        r2.setBounds(450, 290, 90, 30);
        add(r2);
        
        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);
        
        l5 = new JLabel("Email Address:");
        l5.setFont(new Font("Raleway", Font.BOLD, 20));
        l5.setBounds(100,340,200,30);
        add(l5);
        
        tf3 = new JTextField();
        tf3.setFont(new Font("Raleway", Font.BOLD, 14));
        tf3.setBounds(300,340,400,30);
        add(tf3);
        
        l6 = new JLabel("Marital Status:");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));
        l6.setBounds(100,390,200,30);
        add(l6);
        
        r3 = new JRadioButton("Married");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.white);
        r3.setBounds(300,390,100,30);
        add(r3);
        
        r4 = new JRadioButton("Unmarried");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.white);
        r4.setBounds(450,390,100,30);
        add(r4);
        
        r5 = new JRadioButton("Other");
        r5.setFont(new Font("Raleway", Font.BOLD, 14));
        r5.setBackground(Color.white);
        r5.setBounds(635,390,100,30);
        add(r5);
        
        ButtonGroup groupstatus = new ButtonGroup();
        groupstatus.add(r3);
        groupstatus.add(r4);
        groupstatus.add(r5);
        
        l7 = new JLabel("Address:");
        l7.setFont(new Font("Raleway", Font.BOLD, 20));
        l7.setBounds(100,440,200,30);
        add(l7);
        
        tf4 = new JTextField();
        tf4.setFont(new Font("Raleway", Font.BOLD, 14));
        tf4.setBounds(300,440,400,30);
        add(tf4);
        
        l8 = new JLabel("City");
        l8.setFont(new Font("Raleway", Font.BOLD, 20));
        l8.setBounds(100,490,200,30);
        add(l8);
        
        tf5 = new JTextField();
        tf5.setFont(new Font("Raleway", Font.BOLD, 14));
        tf5.setBounds(300,490,400,30);
        add(tf5);
        
        l9 = new JLabel("State:");
        l9.setFont(new Font("Raleway", Font.BOLD, 20));
        l9.setBounds(100,540,200,30);
        add(l9);
        
        tf6 = new JTextField();
        tf6.setFont(new Font("Raleway", Font.BOLD, 14));
        tf6.setBounds(300,540,400,30);
        add(tf6);
        
        l10 = new JLabel("Pin Code:");
        l10.setFont(new Font("Raleway", Font.BOLD, 20));
        l10.setBounds(100,590,200,30);
        add(l10);
        
        tf7 = new JTextField();
        tf7.setFont(new Font("Raleway", Font.BOLD, 14));
        tf7.setBounds(300,590,400,30);
        add(tf7);
        
        but = new JButton("Next");
        but.setBackground(Color.black);
        but.setForeground(Color.white);
        but.setBounds(620,660,80,30);
        but.addActionListener(this);
        add(but);
        
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,800);
        setLocation(400,15);
        setVisible(true);
   }

    Signup(String formno) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void actionPerformed(ActionEvent ae) {
        
        String formno = first;
        String name = tf1.getText();
        String father_name = tf2.getText();
        String dob = ((JTextField) datechoser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }
        else if(r2.isSelected()){
            gender = "Female";
        }
        
        String email = tf3.getText();
        String marital_status = null;
        if(r3.isSelected()){
            marital_status = "Married";
        }
        else if(r4.isSelected()){
            marital_status = "Unmarried";
        }
        else if(r5.isSelected()){
            marital_status = "Other";
        }
        String address = tf4.getText();
        String city = tf5.getText();
        String state = tf6.getText();
        String pincode = tf7.getText();
        
        try{
            if(tf6.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }
            else{
                Conn c1 = new Conn();
                String q1 = "insert into signup values('"+formno+"','"+name+"','"+father_name+"','"+dob+"','"+gender+"','"+email+"','"+marital_status+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                c1.s.executeUpdate(q1);
                
                new Signup2(first).setVisible(true);
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Signup().setVisible(true);
    }
}
