//-	Write a program that takes cost price and selling price as input and displays whether the transaction is a Profit or a Loss or Neither. Consider all possibilities of input data.

import java.util.*;

class exp2_7
{
  public static void main(String[] args)
  {
    System.out.println("----------Divya Kheraj Bhanushali B204----------");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter cost price");
    double cp = sc.nextDouble();
    System.out.println("Enter selling price");
    double sp = sc.nextDouble();

    int net =(int)(sp-cp);

    if(net>0)
    {
      System.out.println("The transaction is profitable ");
      System.out.println("Profit = Rs."+net);
      System.out.println("Profit % = "+(net/cp)*100);
    }
    if(net<0)
    {
      System.out.println("The transaction is Loss making ");
      System.out.println("Loss = Rs."+net*-1);
      System.out.println("Loss % = "+(net/cp)*100*-1);
    }
    if(net==0)
    {
      System.out.println("The transaction is Neither loss making nor profitable");
    }

    System.out.println("----------Divya Kheraj Bhanushali B204----------");
  }
}
