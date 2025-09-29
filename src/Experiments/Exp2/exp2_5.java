//-	Write a program to check whether a triangle is valid and Scalene Triangle or not.  Triangle is scalene if, it has no equal sides.

import java.util.*;
class exp2_5
{
  public static void main(String[] args)
  {
    System.out.println("----------Divya Kheraj Bhanushali B204----------");
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter sides of the triangle");
    double a=sc.nextDouble();
    double b=sc.nextDouble();
    double c=sc.nextDouble();

    if((a + b) > c && (a + c) > b && (b + c) >a && a!=b && b!=c && a!=c)
    {
      System.out.println("Triangle is valid and scalene");
    }
    System.out.println("----------Divya Kheraj Bhanushali B204----------");
  }
}
