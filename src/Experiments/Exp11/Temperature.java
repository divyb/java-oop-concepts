import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Temperature implements ActionListener
{
  JFrame f;
  JLabel l1,l2,l3;
  JTextField tf1,tf2,tf3;
  JButton b;
  Temperature()
  {
    f = new JFrame();
    l1 = new JLabel("Enter Temperature in Farenheit");
    l2 = new JLabel("Temperature in celcius = ");
    tf1 = new JTextField(10);
    tf2 = new JTextField(10);
    b = new JButton("Calculate");
    f.setTitle("----------Divya Kheraj Bhanushali B204----------");
    f.setLayout(new FlowLayout());
    f.add(l1);
    f.add(tf1);


    f.add(b);
    f.add(l2);
    f.add(tf2);
    f.setVisible(true);
    f.setSize(550,550);
    b.addActionListener(this);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }
  public void actionPerformed(ActionEvent e)
  {
    String f = tf1.getText();
    double temp = Double.parseDouble(f);
    double celcius = ((temp - 32.0)*5.0)/9.0;
    tf2.setText(celcius+"");
    
  }
  public static void main(String[] args)
  {
    new Temperature();
  }
}
