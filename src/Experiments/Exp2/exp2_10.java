//-	Write a program to check entered number is prime or not.

import java.util.*;

class exp2_11
{
  public static void main(String[] args)
  {
    System.out.println("----------Divya Kheraj Bhanushali B204----------");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number to be prime");
    int num=sc.nextInt();
    int cnt=0;
    for(int i=1;i<=num/2;i++)
      {
        if(num%i == 0)
            cnt++;
      }

      if(cnt==1)
        System.out.println("Prime");
      else
        System.out.println("not prime");
        
        System.out.println("----------Divya Kheraj Bhanushali B204----------");
  }
}
