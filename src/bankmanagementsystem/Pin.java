package bankmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pin extends JFrame implements ActionListener {
    
    String pin;
    JLabel lh,l,l1;
    JPasswordField pf1,pf2;
    JButton b1,b2;
    Pin(String pin) {
        
        this.pin=pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 850, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 900, 850);
        add(l2);
        
        lh = new JLabel("CHANGE YOUR PIN");
        lh.setForeground(Color.white);
        lh.setFont(new Font("System", Font.BOLD, 16));
        lh.setBounds(250, 270, 300, 40);
        l2.add(lh);
        
        l = new JLabel("New PIN:" );
        l.setForeground(Color.white);
        l.setFont(new Font("System", Font.BOLD, 16));
        l.setBounds(170, 310, 100, 40);
        l2.add(l);
        
        pf1 = new JPasswordField();
        pf1.setFont(new Font("Raleway",Font.BOLD,25));
        pf1.setBounds(340, 310, 160, 30);
        l2.add(pf1);
        
        l1 = new JLabel("Re-Enter New PIN:" );
        l1.setForeground(Color.white);
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(170, 350, 200, 40);
        l2.add(l1);
        
        pf2 = new JPasswordField();
        pf2.setFont(new Font("Raleway",Font.BOLD,25));
        pf2.setBounds(340, 350, 160, 30);
        l2.add(pf2);
        
        b1 = new JButton("CHANGE");
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
            String npin = pf1.getText();
            String rpin = pf2.getText();
            
            if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                return;
            }
            if(ae.getSource()==b1){
                if(pf1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Enter New PIN");
                }
                if(pf2.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Re-Enter New PIN");
                }
            
            Conn c1 = new Conn();
            String q1 = "update bank set pin = '"+rpin+"' where pin = '"+pin+"'";
            String q2 = "update login set pin = '"+rpin+"' where pin = '"+pin+"'";
            String q3 = "update signupthree set pin = '"+rpin+"' where pin = '"+pin+"'";
            
            c1.s.executeUpdate(q1);
            c1.s.executeUpdate(q2);
            c1.s.executeUpdate(q3);
            
            JOptionPane.showMessageDialog(null, "PIN changed successufully");
            setVisible(false);
            new Transactions(rpin).setVisible(true);
            }
            else if(ae.getSource()==b2){
                 new Transactions(pin).setVisible(true);
                 setVisible(false);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Pin("").setVisible(true);
    }
   
}
