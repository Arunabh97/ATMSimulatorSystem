package bankmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Transactions extends JFrame implements ActionListener {
    
    JLabel l1;
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    Transactions(String pin){
        
        this.pin = pin;
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 850, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 900, 850);
        add(l2);
        
        l1 = new JLabel("Please Select Your Transaction");
        l1.setForeground(Color.white);
        l1.setBackground(Color.red);
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(230, 270, 250, 40);
        l2.add(l1);
        
        b1 = new JButton("Deposit");
        b1.setBounds(170,350,150,35);
        b1.addActionListener(this);
        l2.add(b1);
        
        b2 = new JButton("Cash Withdrawl");
        b2.setBounds(350,350,150,35);
        b2.addActionListener(this);
        l2.add(b2);
        
        b3 = new JButton("Fast Cash");
        b3.setBounds(170,390,150,35);
        b3.addActionListener(this);
        l2.add(b3);
        
        b4 = new JButton("Mini Statement");
        b4.setBounds(350,390,150,35);
        b4.addActionListener(this);
        l2.add(b4);
        
        b5 = new JButton("Pin Change");
        b5.setBounds(170,430,150,35);
        b5.addActionListener(this);
        l2.add(b5);
        
        b6 = new JButton("Balance Enquiry");
        b6.setBounds(350,430,150,35);
        b6.addActionListener(this);
        l2.add(b6);
        
        b7 = new JButton("Exit");
        b7.setBounds(350,470,150,35);
        b7.addActionListener(this);
        l2.add(b7);
        
        setLayout(null);
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,790);
        setLocation(360,10);
        setVisible(true);
    }
    

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            setVisible(false);
            new Deposit(pin).setVisible(true);           
        }
        else if(ae.getSource()==b2){ 
            setVisible(false);
            new Withdrawl(pin).setVisible(true);
        }
        else if(ae.getSource()==b3){ 
            setVisible(false);
            //new FastCash(pin).setVisible(true);
        }
        else if(ae.getSource()==b4){ 
            //new MiniStatement(pin).setVisible(true);
        }
        else if(ae.getSource()==b5){ 
            setVisible(false);
            //new Pin(pin).setVisible(true);
        }
        else if(ae.getSource()==b6){ 
            this.setVisible(false);
            //new BalanceEnquiry(pin).setVisible(true);
        }
        else if(ae.getSource()==b7){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new Transactions("").setVisible(true);
    }
}
