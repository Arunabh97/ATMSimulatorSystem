package bankmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements  ActionListener{
    
    JLabel l1;
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    FastCash(String pin) {
        
        this.pin=pin;       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 850, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 900, 850);
        add(l2);
        
        l1 = new JLabel("SELECT WITHDRAWL AMOUNT");
        l1.setForeground(Color.white);
        l1.setBackground(Color.red);
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(230, 270, 250, 40);
        l2.add(l1);
        
        b1 = new JButton("Rs 100");
        b1.setBounds(170,350,150,35);
        b1.addActionListener(this);
        l2.add(b1);
        
        b2 = new JButton("Rs 500");
        b2.setBounds(350,350,150,35);
        b2.addActionListener(this);
        l2.add(b2);
        
        b3 = new JButton("Rs 1000");
        b3.setBounds(170,390,150,35);
        b3.addActionListener(this);
        l2.add(b3);
        
        b4 = new JButton("Rs 2000");
        b4.setBounds(350,390,150,35);
        b4.addActionListener(this);
        l2.add(b4);
        
        b5 = new JButton("Rs 5000");
        b5.setBounds(170,430,150,35);
        b5.addActionListener(this);
        l2.add(b5);
        
        b6 = new JButton("Rs 10000");
        b6.setBounds(350,430,150,35);
        b6.addActionListener(this);
        l2.add(b6);
        
        b7 = new JButton("BACK");
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
        try{
            String amount = ((JButton)ae.getSource()).getText().substring(3);
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pin+"'");
            int balance = 0 ;
            while(rs.next()){
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
                String num = "17";
                if (ae.getSource() != b7 && balance < Integer.parseInt(amount)) {
                JOptionPane.showMessageDialog(null, "Insuffient Balance");
                return;
            }
                if (ae.getSource() == b7) {
                setVisible(false);
                new Transactions(pin).setVisible(true);
            }else{
                Date date = new Date();
                c.s.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Withdrawl', '"+amount+"')");
                JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
                    
                setVisible(false);
                new Transactions(pin).setVisible(true);
            }
        }
        catch(Exception e){
        e.printStackTrace();
    }
        
    }
    public static void main(String[] args) {
        new FastCash("").setVisible(true);
    }
}
