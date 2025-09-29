import java.util.*;
interface Add
{
  int add(int x,int y);
}
interface Sub
{
  int sub(int x,int y);
}
interface Mul
{
  int mul(int x,int y);
}
interface Div
{
  int div(int x,int y);
}

class Calculator implements Add,Sub,Mul,Div
{
  public static void main(String[] args)
  {
    System.out.println("----------Divya Kheraj Bhanushali b204----------");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    Calculator ob = new Calculator();
    System.out.println("Enter 1. add\n2.Sub\n3.mul \n3.div");
    int choice=sc.nextInt();
    switch (choice)
    {
      case 1:
      System.out.println("Result = "+ob.add(a,b));
      break;
      case 2:
      System.out.println("Result = "+ob.sub(a,b));
      break;
      case 3:
      System.out.println("Result = "+ob.mul(a,b));
      break;
      case 4:
      System.out.println("Result = "+ob.div(a,b));
      break;
    }
  System.out.println("----------Divya Kheraj Bhanushali b204----------");
  }
  public int sub(int x,int y)
  {
    return (x-y);
  }
  public int add(int x,int y)
  {
    return (x+y);
  }
  public int mul(int x,int y)
  {
    return (x*y);
  }
  public int div(int x,int y)
  {
    return (x/y);
  }


}
