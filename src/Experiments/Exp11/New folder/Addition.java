import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Addition implements ActionListener
{ 
	JFrame f1;
	JTextField tf1,tf2,tf3;
	JLabel l1,l2,l3;
	JButton b1;
	Addition()
	{
		f1 = new JFrame("B228");
		l1 = new JLabel("Enter first number");
		l2 = new JLabel("Enter second number");
		l3 = new JLabel("Addition is:-");
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		tf3 = new JTextField(10);
		b1 = new JButton("Add");
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
		f1.setTitle("B228-Addition"); //Not important if the title is specified in JFrame
		b1.addActionListener(this);   //Register Event
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		String n1 = tf1.getText();
		String n2 = tf2.getText();
		float add = Float.parseFloat(n1) + Float.parseFloat(n2);
		tf3.setText(add + "");
	}
	public static void main(String args[])
	{
		new Addition(); 
	}
}
	