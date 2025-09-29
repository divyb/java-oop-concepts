import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Leap implements ActionListener
{
  JFrame f;
  JLabel l1,l2;
  JTextField tf1,tf2;
  JButton b;
  Leap()
  {
    f = new JFrame();
    l1 = new JLabel("Enter a year");


    tf1 = new JTextField("",10);
    tf2 = new JTextField("",10);

    b = new JButton("Calculate");
    f.setTitle("----------Divya Kheraj Bhanushali B204----------");
    f.setLayout(new FlowLayout());
    f.add(l1);
    f.add(tf1);
    f.add(b);
    f.add(tf2);

    f.setVisible(true);
    f.setSize(550,550);
    b.addActionListener(this);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }
  public void actionPerformed(ActionEvent e)
  {
    String year = tf1.getText();
    int y = Integer.parseInt(year);

    if(y%400==0||(y%4==0 && y%100!=0))
    {
			tf2.setText("Leap Year");
      tf2.setBackground(Color.GREEN);
    }
    else
      {
        tf2.setText("Not a leap year");
        tf2.setBackground(Color.RED);
      }
  }
  public static void main(String[] args)
  {
    new Leap();
  }
}
