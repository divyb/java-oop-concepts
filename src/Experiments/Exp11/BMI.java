import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BMI implements ActionListener
{
  JFrame f;
  JLabel l1,l2,l3,l4;
  JTextField tf1,tf2,tf3,Bmi;
  JButton b;
  BMI()
  {
    f = new JFrame();
    l1 = new JLabel("Enter Weight in kg");
    l2 = new JLabel("Enter Height in m");
    l3 = new JLabel("BMI = ");

    tf1 = new JTextField("weight",10);
    tf2 = new JTextField("height",10);
    tf3 = new JTextField("0",10);
    Bmi = new JTextField("0",10);
    b = new JButton("Calculate");
    f.setTitle("----------Divya Kheraj Bhanushali B204----------");
    f.setLayout(new FlowLayout());
    f.add(l1);
    f.add(tf1);
    f.add(l2);
    f.add(tf2);


    f.add(b);
    f.add(Bmi);

    f.add(tf3);
    f.setVisible(true);
    f.setSize(550,550);
    b.addActionListener(this);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }
  public void actionPerformed(ActionEvent e)
  {
    String weight = tf1.getText();
    String height = tf2.getText();

    float bmi = Float.parseFloat(weight)/(Float.parseFloat(height) * Float.parseFloat(height));
    Bmi.setText(bmi+"");

    if(bmi<=18.5)
    {
			tf3.setText("Underweight");
      tf3.setBackground(Color.RED);
    }
		else if(bmi>18.5 && bmi<=25)
			tf3.setText("Normal Weight");

		else if(bmi>25 && bmi<=30)
      {
        tf3.setText("Overweight");
        tf3.setBackground(Color.YELLOW);
      }
    else
    {		tf3.setText("Obese");

        tf3.setBackground(Color.GRAY);
      }
  }
  public static void main(String[] args)
  {
    new BMI();
  }
}
