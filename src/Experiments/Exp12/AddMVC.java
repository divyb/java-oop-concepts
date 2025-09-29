import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class AddMVC implements ActionListener
{
    
    JFrame f1;
    JTextField tf1,tf2,tf3;
    JButton b1;
    JLabel l1;
    AddMVC()
    {  
        f1=new JFrame("----------Divya Kheraj Bhanushali B204----------");
        l1=new JLabel("+");
        tf1=new JTextField("0",10);
        tf2=new JTextField("0",10);
        tf3=new JTextField("0",10);
        b1=new JButton("=");
        f1.setLayout(new FlowLayout());
        f1.add(tf1);
        f1.add(l1);
        f1.add(tf2);
        f1.add(b1);
        f1.add(tf3);
        f1.setVisible(true);
        f1.setSize(600,200);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        String a=tf1.getText();
        String b=tf2.getText();
        String c=Float.parseFloat(a)+Float.parseFloat(b)+"";
        tf3.setText(c);
        
        System.out.println("a + b = "+c);

    }
    public static void main(String args[])
    {
        new AddMVC();

    }

}