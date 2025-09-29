import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Swing implements ActionListener
{
  JFrame frame;
  JLabel lab1,lab2,name;
  JTextField Tf1,Tf2,Tf3;
  JButton B;

  Swing()
  {
    frame = new JFrame("Square Area");
    name = new JLabel("---------------------------------------------------------Divya Kheraj Bhanushali B204---------------------------------------------------------");
    lab1 = new JLabel("Enter Length\n");
    lab2 = new JLabel("Area = ");

    Tf1 = new JTextField("0",10);
    Tf2 = new JTextField("0",10);

    B =new JButton("Calculate");

    frame.setLayout(new FlowLayout());
    frame.add(name);
    frame.add(lab1);
    frame.add(Tf1);

    frame.add(B);

    frame.add(lab2);
    frame.add(Tf2);

    frame.setVisible(true);
    frame.setSize(600,600);

    B.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e)
  {
    String side = Tf1.getText();
    float area = Float.parseFloat(side) * Float.parseFloat(side);
    Tf2.setText(area+"");
  }

  public static void main(String[] args)
  {
    System.out.println("----------Divya Kheraj Bhanushali B204----------");
    new Swing();
  }
}
