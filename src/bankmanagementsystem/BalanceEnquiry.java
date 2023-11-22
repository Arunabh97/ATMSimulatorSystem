package bankmanagementsystem;

import com.mysql.cj.jdbc.result.ResultSetImpl;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class BalanceEnquiry extends JFrame implements ActionListener{
    
    String pin;
    JLabel l1;
    JButton b1;
    BalanceEnquiry(String pin) {
        this.pin=pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 850, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 900, 850);
        add(l2);
        
        l1 = new JLabel();
        l1.setForeground(Color.white);
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(180, 270, 350, 40);
        l2.add(l1);
        
        b1 = new JButton("BACK");
        b1.setBounds(320,470,150,35);
        b1.addActionListener(this);
        l2.add(b1);
        
        int balance = 0;
        try{
            Conn c1 = new Conn();
            ResultSet rs = c1.s.executeQuery("select * from bank where pin = '"+pin+"'");
            while(rs.next()){
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        l1.setText("Your Current Account Balance is Rs "+balance);
        
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
            new Transactions(pin).setVisible(true);
        }
        
    }
    public static void main(String[] args) {
        new BalanceEnquiry("").setVisible(true);
    }
}
