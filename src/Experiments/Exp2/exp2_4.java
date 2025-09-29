//-	Write a program to find area of circle, declare PI as constant.

import java.util.*;

class exp2_4
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("-----------Divya Kheraj Bhanushali B204----------");
    final double pi= 3.14;

    System.out.println("Enter radius of the circle");
    double r=sc.nextDouble();

    double area=pi*Math.pow(r,2);
    System.out.println("area = "+area);
    System.out.println("-----------Divya Kheraj Bhanushali B204----------");
  }
}
