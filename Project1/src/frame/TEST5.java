package frame;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TEST5 extends JFrame{
    private Container c; 
    private ImageIcon img;
    private JLabel pic,l2;
    
   public TEST5(){

        img = new ImageIcon(getClass().getResource("shahan1.png"));
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);
        ImageIcon icon = new ImageIcon(getClass().getResource("shahan2.png"));
        this.setIconImage(icon.getImage());
        
        pic = new JLabel(img);
        pic.setBounds(10, 10,img.getIconWidth(), img.getIconHeight());
        c.add(pic);
        
        
        l2 = new JLabel("Welcome Shahan & Hanif Blog");
    
        l2.setBounds(300, 320, 200, 40);
        l2.setForeground(Color.red);
        l2.setOpaque(true);
        l2.setBackground(Color.PINK);
        l2.setHorizontalAlignment(JTextField.CENTER);
        c.add(l2);
        
        
    }
    
    
    public static void main(String[] args) {
        
        TEST5 f= new TEST5();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setBounds(200,200,540,400);
        f.setTitle("BEST FRIEND");
        f.setResizable(true);
    }
}
