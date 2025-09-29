//-	Write a program to implement a currency calculator. The program should request to user to input Indian Rupees and display its equivalent currency in Pounds and Euro. Assume:

import java.util.*;

class exp2_6
{
  public static void main(String[] args)
  {

  System.out.println("----------Divya Kheraj Bhanushali B204----------");
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter amount in Rupees");
  double inr = sc.nextDouble();

  System.out.println("Amount in Euro "+ (inr/(float)80));
  System.out.println("Amount in Pound "+ (inr/(float)90));
  System.out.println("----------Divya Kheraj Bhanushali B204----------");
  }
}
