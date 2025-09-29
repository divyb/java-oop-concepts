import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SwingAddition implements ActionListener
{
  JFrame f;
  JLabel l1,l2,l3;
  JTextField tf1,tf2,tf3;
  JButton b;
  SwingAddition()
  {
    f = new JFrame();
    l1 = new JLabel("Enter two Numbers to be added");
    l2 = new JLabel("Result = ");
    tf1 = new JTextField("",10);
    tf2 = new JTextField("",10);
    tf3 = new JTextField("0",10);
    b = new JButton("Calculate");
    f.setTitle("----------Divya Kheraj Bhanushali B204----------");
    f.setLayout(new FlowLayout());
    f.add(l1);
    f.add(tf1);
    f.add(tf2);


    f.add(b);
    f.add(l2);
    f.add(tf3);
    f.setVisible(true);
    f.setSize(550,550);
    b.addActionListener(this);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }
  public void actionPerformed(ActionEvent e)
  {
    String a = tf1.getText();
    String b = tf2.getText();

    float result = Float.parseFloat(a) + Float.parseFloat(b);
    tf3.setText(result+"");
  }
  public static void main(String[] args)
  {
    new SwingAddition();
  }
}
