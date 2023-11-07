package bankmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Signup2 extends JFrame implements ActionListener{
    
    JLabel lh,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JRadioButton r1,r2,r3,r4;
    JComboBox cb1,cb2,cb3,cb4,cb5;
    JTextField tf1,tf2;
    JButton but;
    String formno;
    Signup2(String formno){
        
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
       Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel l14 = new JLabel(i3);
       l14.setBounds(150, 0, 100, 100);
       add(l14);
        
       setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
       getContentPane().setBackground(Color.white);
       this.formno = formno;
       
       lh = new JLabel("Page 2: Additional Details");
       lh.setFont(new Font("Raleway", Font.BOLD, 22));
       lh.setBounds(280,30,600,40);
       add(lh);
       
       l1 = new JLabel("Religion:");
       l1.setFont(new Font("Raleway", Font.BOLD, 18));
       l1.setBounds(100,120,100,30);
       add(l1);
       
       String religion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
       cb1 = new JComboBox(religion);
       cb1.setBackground(Color.WHITE);
       cb1.setFont(new Font("Raleway", Font.BOLD, 14));
       cb1.setBounds(350,120,320,30);
       add(cb1);
       
       l2 = new JLabel("Category:");
       l2.setFont(new Font("Raleway", Font.BOLD, 18));
       l2.setBounds(100,170,100,30);
       add(l2);
       
       String category[] = {"General","OBC","SC","ST","Other"};
       cb2 = new JComboBox(category);
       cb2.setBackground(Color.WHITE);
       cb2.setFont(new Font("Raleway", Font.BOLD, 14));
       cb2.setBounds(350,170,320,30);
       add(cb2);
       
       l3 = new JLabel("Income:");
       l3.setFont(new Font("Raleway", Font.BOLD, 18));
       l3.setBounds(100,220,100,30);
       add(l3);
       
       String income[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
       cb3 = new JComboBox(income);
       cb3.setBackground(Color.WHITE);
       cb3.setFont(new Font("Raleway", Font.BOLD, 14));
       cb3.setBounds(350,220,320,30);
       add(cb3);
       
       l4 = new JLabel("Educational");
       l4.setFont(new Font("Raleway", Font.BOLD, 18));
       l4.setBounds(100,270,150,30);
       add(l4);
             
       l10 = new JLabel("Qualification:");
       l10.setFont(new Font("Raleway", Font.BOLD, 18));
       l10.setBounds(100,290,150,30);
       add(l10);
       
       String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
       cb4 = new JComboBox(education);
       cb4.setBackground(Color.WHITE);
       cb4.setFont(new Font("Raleway", Font.BOLD, 14));
       cb4.setBounds(350,270,320,30);
       add(cb4);
       
       l5 = new JLabel("Occupation:");
       l5.setFont(new Font("Raleway", Font.BOLD, 18));
       l5.setBounds(100,340,150,30);
       add(l5);
       
       String occupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
       cb5 = new JComboBox(occupation);
       cb5.setBackground(Color.WHITE);
       cb5.setFont(new Font("Raleway", Font.BOLD, 14));
       cb5.setBounds(350,340,320,30);
       add(cb5);
       
       l6 = new JLabel("PAN Number:");
       l6.setFont(new Font("Raleway", Font.BOLD, 18));
       l6.setBounds(100,390,150,30);
       add(l6);
       
       tf1 = new JTextField();
       tf1.setFont(new Font("Raleway", Font.BOLD, 14));
       tf1.setBounds(350,390,320,30);
       add(tf1);
       
       l7 = new JLabel("Aadhar Number:");
       l7.setFont(new Font("Raleway", Font.BOLD, 18));
       l7.setBounds(100,440,180,30);
       add(l7);
       
       tf2 = new JTextField();
       tf2.setFont(new Font("Raleway", Font.BOLD, 14));
       tf2.setBounds(350,440,320,30);
       add(tf2);
       
       l8 = new JLabel("Senior Citizen:");
       l8.setFont(new Font("Raleway", Font.BOLD, 18));
       l8.setBounds(100,490,150,30);
       add(l8);
       
       r1 = new JRadioButton("Yes");
       r1.setFont(new Font("Raleway", Font.BOLD, 14));
       r1.setBackground(Color.white);
       r1.setBounds(350,490,100,30);
       add(r1);
       
       r2 = new JRadioButton("No");
       r2.setFont(new Font("Raleway", Font.BOLD, 14));
       r2.setBackground(Color.white);
       r2.setBounds(460,490,100,30);
       add(r2);
       
       ButtonGroup groupcitizen = new ButtonGroup();
       groupcitizen.add(r1);
       groupcitizen.add(r2);
       
       l9 = new JLabel("Existing Account:");
       l9.setFont(new Font("Raleway", Font.BOLD, 18));
       l9.setBounds(100,540,180,30);
       add(l9);
       
       r3 = new JRadioButton("Yes");
       r3.setFont(new Font("Raleway", Font.BOLD, 14));
       r3.setBackground(Color.white);
       r3.setBounds(350,540,100,30);
       add(r3);
       
       r4 = new JRadioButton("No");
       r4.setFont(new Font("Raleway", Font.BOLD, 14));
       r4.setBackground(Color.white);
       r4.setBounds(460,540,100,30);
       add(r4);
       
       ButtonGroup groupexiacc = new ButtonGroup();
       groupexiacc.add(r3);
       groupexiacc.add(r4);
       
       l11 = new JLabel("Form No:");
       l11.setFont(new Font("Raleway", Font.BOLD, 13));
       l11.setBounds(700,10,60,30);
       add(l11);
       
       l12 = new JLabel(formno);
       l12.setFont(new Font("Raleway", Font.BOLD, 13));
       l12.setBounds(760,10,60,30);
       add(l12);
       
       but = new JButton("Next");
       but.setBackground(Color.black);
       but.setForeground(Color.white);
       but.setBounds(570,640,100,30);
       but.addActionListener(this);
       add(but);
        
       setLayout(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(850,750);
       setLocation(400,25);
       setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        
        String religion = (String)cb1.getSelectedItem();
        String category = (String)cb2.getSelectedItem();
        String income = (String)cb3.getSelectedItem();
        String education = (String)cb4.getSelectedItem();
        String occupation = (String)cb5.getSelectedItem();
        String pan = tf1.getText();
        String aadhar = tf2.getText();
        String seniorcitizen = "";
        if(r1.isSelected()){
            seniorcitizen = "Yes";
        }
        else if(r2.isSelected()){
            seniorcitizen = "No";
        }
        String existingaccount = "";
        if(r3.isSelected()){
            existingaccount = "Yes";
        }
        else if(r4.isSelected()){
            existingaccount = "No";
        }
        
        try{
            if(tf2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }
            else{
                Conn c1 = new Conn();
                String q = "insert into signuptwo values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
                c1.s.executeUpdate(q);
                
                new Signup3(formno).setVisible(true);
                setVisible(false);
            }
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Signup2("").setVisible(true);
    }
}
