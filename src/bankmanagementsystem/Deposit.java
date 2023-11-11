package bankmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;

public class Deposit extends JFrame implements ActionListener{
    
    JTextField tf1;
    JButton b1,b2;
    String pin;
    Deposit(String pin) {
        
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 850, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 900, 850);
        add(l2);
        
        JLabel l1 = new JLabel("Enter the amount you want to deposit");
        l1.setForeground(Color.white);
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(190, 270, 300, 40);
        l2.add(l1);
        
        tf1 = new JTextField();
        tf1.setBounds(185, 320, 300, 30);
        l2.add(tf1);
        
        b1 = new JButton("DEPOSIT");
        b1.setBounds(350,430,150,35);
        b1.addActionListener(this);
        l2.add(b1);
        
        b2 = new JButton("BACK");
        b2.setBounds(350,470,150,35);
        b2.addActionListener(this);
        l2.add(b2);
        
        setLayout(null);
        //setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,790);
        setLocation(360,10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try{
            String amount = tf1.getText();
            Date date = new Date();
            if(ae.getSource()==b1){
                if(tf1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Deposit");               
            }
            else {
                Conn c1 = new Conn();
                c1.s.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Deposit', '"+amount+"')");
                JOptionPane.showMessageDialog(null, "Rs. "+amount+" Deposited Successfully");
                setVisible(false);
                new Transactions(pin).setVisible(true);
            }
            
        }
        else if(ae.getSource()==b2){
            setVisible(false);
            new Transactions(pin).setVisible(true);
        }
      }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Deposit("").setVisible(true);
    }
}
