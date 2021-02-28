package project1;

import frame.TEST5;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Project1 extends JFrame {

    private Container c;
    private JTextField t1, t2;
    private JLabel l1, l2;
    private Font f, f2;
    private JPasswordField p;
    private JButton b, b2, b3;

    Project1() {
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.YELLOW);

        f = new Font("Arial", Font.ITALIC + Font.BOLD, 12);
        f2 = new Font("Arial", Font.BOLD, 20);

        l1 = new JLabel();
        l1.setText("Enter your name : ");
        l1.setToolTipText("name");

//        System.out.println(""+l1.getText());
//        System.out.println(""+l1.getToolTipText());
        l1.setBounds(90, 70, 130, 50);
        l1.setFont(f);

        l1.setForeground(Color.red);
        l1.setOpaque(true);
        l1.setBackground(Color.PINK);

        c.add(l1);

        l2 = new JLabel("Enter your passward :");
        l2.setToolTipText("passward");
        l2.setBounds(90, 130, 130, 50);
        l2.setFont(f);
        l2.setForeground(Color.red);
        l2.setOpaque(true);
        l2.setBackground(Color.PINK);
        c.add(l2);

        t1 = new JTextField();
        t1.setBounds(230, 70, 150, 50);
        t1.setFont(f);
        t1.setToolTipText("Full name");
        t1.setForeground(Color.BLACK);
        t1.setBackground(Color.PINK);
        t1.setHorizontalAlignment(JTextField.CENTER);
        c.add(t1);

        p = new JPasswordField();
        p.setBounds(230, 130, 150, 50);
        p.setFont(f2);
        p.setEchoChar('*');
        p.setToolTipText("Passward");
        p.setForeground(Color.BLACK);
        p.setBackground(Color.PINK);
        p.setHorizontalAlignment(JTextField.CENTER);

        c.add(p);

        b = new JButton("LOGIN");
        b.setBounds(100, 200, 90, 30);
        b.setFont(f);
        c.add(b);

        b2 = new JButton("RESET");
        b2.setBounds(200, 200, 90, 30);
        b2.setFont(f);
        c.add(b2);

        b3 = new JButton("EXIT");
        b3.setBounds(300, 200, 90, 30);
        b3.setFont(f);
        c.add(b3);
        
        b.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            
            String s = t1.getText();
            String s1= p.getText();
            if (s.equals("shahan hanif")&&s1.equals("king")){
    //                     JOptionPane.showMessageDialog(null, "Welcome", "Successfuly Login", JOptionPane.PLAIN_MESSAGE);
                        t1.setText(null);
                        p.setText(null);
//                        dispose();
                        TEST5 O = new TEST5();
                        TEST5.main(null);

                      }else {
                        t1.setText(null);
                        p.setText(null);
                        JOptionPane.showMessageDialog(null, "Wrong", "Error", JOptionPane.ERROR_MESSAGE);

                     }
          
           }
       });
        
        b2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            
            t1.setText(null);
                p.setText(null);
           }
       });
        
        b3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            
            JOptionPane.showMessageDialog(null, "Do you agree","Exit",JOptionPane.YES_NO_OPTION);
            
            
               System.exit(0); 
            
             
           }
       });
        
/*
        Hendle h = new Hendle();
        b.addActionListener(h);
        b2.addActionListener(h);
        b3.addActionListener(h);

    }
/***
    class Hendle implements ActionListener {

        public void actionPerformed((ActionEvent e) {
            if (e.getSource() == b) {
                    String s = t1.getText();
                    String s1 = p.getText();

                    String s2 = s + s1;
//                 System.out.println(s2);
                    if (s.equals("shahan hanifking")){
    //                     JOptionPane.showMessageDialog(null, "Welcome", "Successfuly Login", JOptionPane.PLAIN_MESSAGE);
                        t1.setText(null);
                        p.setText(null);
                        TEST5 O = new TEST5();
                        TEST5.main(null);

                      }else {
                        t1.setText(null);
                        p.setText(null);
                        JOptionPane.showMessageDialog(null, "Wrong", "Error", JOptionPane.ERROR_MESSAGE);

                     }

            } else if (e.getSource() == b2) {
                t1.setText(null);
                p.setText(null);
            } else {

                System.exit(0);

                //JOptionPane.showMessageDialog(null, "Do you agree","Exit",JOptionPane.YES_NO_CANCEL_OPTION);    
            }

        }   
*/
}
    public static void main(String[] args) {
        Project1 f = new Project1();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100, 50, 500, 400);
        f.setTitle("TEXT");
    }

}
