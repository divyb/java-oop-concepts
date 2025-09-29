//-	Write a program to check whether given number is palindrome or not.

import java.util.*;

class exp2_8
{
  public static void main(String[] args)
  {
    System.out.println("----------Divya Kheraj Bhanushali B204----------");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number to be Checked");
    int n=sc.nextInt();

    int sum=0,t=n;

    while(t!=0)
    {
      int rem = t%10;
      sum =sum*10 + rem;
      t/=10;
    }
    if(sum==n)
      System.out.println("number is palindrome");
    else
      System.out.println("number is not palindrome");
    System.out.println("----------Divya Kheraj Bhanushali B204----------");
  }
}
