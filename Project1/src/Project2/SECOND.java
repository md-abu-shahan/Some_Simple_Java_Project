package Project2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SECOND extends JFrame 
u{

    private Container c;
    private JLabel pic, tx;
    private JTextField tf;
    private JTextArea ta;
    private Font f;
    private JScrollPane sp;
    private ImageIcon img;
    private JButton bt;
    private Cursor cs;

    SECOND() {
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        img = new ImageIcon(getClass().getResource("SHAHAN.png"));

        pic = new JLabel(img);
        pic.setBounds(20, 10, img.getIconWidth(), img.getIconHeight());
        c.add(pic);

        tx = new JLabel("Enter any number");
        f = new Font("Arial", Font.BOLD, 20);
        tx.setBounds(20, 200, 250, 50);
        tx.setForeground(Color.MAGENTA);
        tx.setFont(f);
        c.add(tx);

        tf = new JTextField();
        tf.setBounds(230, 200, 90, 50);
        tf.setBackground(Color.ORANGE);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setFont(f);
        c.add(tf);

        tf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String va = tf.getText();
                if (va.isEmpty()) {

                    JOptionPane.showMessageDialog(null, "You did not put any number");
                } else {
                    ta.setText(null);
                    int num = Integer.parseInt(tf.getText());
                    for (int i = 1; i <= 10; i++) {
                        int res = num * i;

                        String r = String.valueOf(res);
                        String n = String.valueOf(num);
                        String incre = String.valueOf(i);

                        ta.append(n + " X " + incre + " = " + r + "\n");

                    }
                }
                tf.setText(null);

            }
        });

        cs = new Cursor(Cursor.HAND_CURSOR);

        bt = new JButton("Clear");
        bt.setBounds(230, 260, 90, 50);
        bt.setBackground(Color.WHITE);
        bt.setCursor(cs);
        c.add(bt);

        bt.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                tf.setText(null);
                ta.setText(null);
            }
        });

        ta = new JTextArea();
        ta.setBackground(Color.WHITE);
        ta.setFont(f);
//        ta.setForeground(Color.RED);
//        ta.setBackground(Color.YELLOW);
//        ta.setLineWrap(true);

        ta.setWrapStyleWord(true);

        sp = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        sp.setBounds(20, 350, 300, 300);

        c.add(sp);
    }

    public static void main(String[] args) {
        SECOND f = new SECOND();
        f.setVisible(true);
        f.setBounds(300, 20, 360, 700);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Multible line");
    }
}
