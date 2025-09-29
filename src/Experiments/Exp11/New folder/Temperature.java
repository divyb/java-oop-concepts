import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Temperature implements ActionListener
{ 
	JFrame f1;
	JTextField tf1,tf2,tf3;
	JLabel l1,l2;
	JButton b1;
	Temperature()
	{
		f1 = new JFrame("B228-Convert");
		l1 = new JLabel("Enter the temperature in Fahrenheit");
		l2 = new JLabel("Temperatue in Celsius is:- ");
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		b1 = new JButton("Convert");
		f1.setLayout(new FlowLayout()); //AWT package
		f1.add(l1);
		f1.add(tf1);
		f1.add(l2);
		f1.add(b1);
		f1.add(tf2);
		f1.setVisible(true);
		f1.setSize(300,500);
		b1.addActionListener(this);   //Register Event
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		String n1 = tf1.getText();
		double val = (Double.parseDouble(n1)-32.0);
		double conv = (5.0/9.0) * val;
		tf2.setText(conv + "");
	}
	public static void main(String args[])
	{
		new Temperature(); 
	}
}
	