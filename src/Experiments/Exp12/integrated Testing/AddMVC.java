import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class AddMVC extends AddTest implements ActionListener{
	JFrame f1;
	JTextField tf1,tf2,tf3,tf4;
	JButton b1;
	JLabel l1;
	ArrayList <String> lst = new ArrayList<String>();
	AddMVC(){
		f1=new JFrame("----------Divya Kheraj Bhanushali B204----------");
		l1=new JLabel("+");
		tf1=new JTextField("",3);
		tf2=new JTextField("",3);
		tf3=new JTextField("",3);
		tf4=new JTextField("",50);
		b1 =new JButton("=");
		f1.setLayout(new FlowLayout());
		f1.add(tf1);
		f1.add(l1);
		f1.add(tf2);
		f1.add(b1);
		f1.add(tf3);
		f1.add(tf4);
		f1.setVisible(true);
		f1.setSize(400,100);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1.addActionListener(this);   //registering Event
		
	}
    public void actionPerformed(ActionEvent e)
    {
		String add = addition(tf1.getText(),tf2.getText());
		tf3.setText(add+"");
		lst.add(new AddArrayListTest().addition(tf1.getText(),tf2.getText()));
		Iterator it = lst.iterator();
		String ts="";
		for(  ;it.hasNext();  )
			ts+=it.next() +" ";
		tf4.setText(ts);
		System.out.println(lst);
	}
	
    public static void main(String...args)
    {
        System.out.println("----------Divya Kheraj Bhanushali B204----------");
        new AddMVC();
        System.out.println("----------Divya Kheraj Bhanushali B204----------");
	}
}
