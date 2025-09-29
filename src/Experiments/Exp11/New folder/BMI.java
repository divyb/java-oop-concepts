import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class BMI implements ActionListener
{ 
	JFrame f1;
	JTextField tf1,tf2,tf3;
	JLabel l1,l2,l3;
	JButton b1;
	BMI()
	{
		f1 = new JFrame("B228");
		l1 = new JLabel("Enter Weight in kg");
		l2 = new JLabel("Enter Height in meter");
		l3 = new JLabel("BMI is:-");
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		tf3 = new JTextField(10);
		b1 = new JButton("BMI");
		f1.setLayout(new FlowLayout()); //AWT package
		f1.add(l1);
		f1.add(tf1);
		f1.add(l2);
		f1.add(tf2);
		f1.add(b1);
		f1.add(l3);
		f1.add(tf3);
		f1.setVisible(true);
		f1.setSize(300,500);
		b1.addActionListener(this);   //Register Event
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		String n1 = tf1.getText();
		String n2 = tf2.getText();
		float bmi = Float.parseFloat(n1) / (Float.parseFloat(n2)*Float.parseFloat(n2));
		if(bmi<=18.5)
			tf3.setText("Underweight");
		else if(bmi>18.5 && bmi<=25)
			tf3.setText("Normal Weight");
		else if(bmi>25 && bmi<=30)
			tf3.setText("Overweight");
		else
			tf3.setText("Obese");
	}
	public static void main(String args[])
	{
		new BMI(); 
	}
}
	