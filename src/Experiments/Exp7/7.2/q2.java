import java.util.*;

interface Shape
{
  public void displayArea();

}



class Triangle implements Shape
{
  int base,h;
  Triangle(int base, int h)
  {
    this.h = h;
    this.base = base;
  }
  public void displayArea()
  {
    System.out.println("Area of Triangle = "+(base*h/2));
  }


}
class Rectangle implements Shape
{
  int len,bre;
  Rectangle(int len,int bre)
  {
    this.len=len;
    this.bre=bre;
  }
  public void displayArea()
  {
    System.out.println("Area of Rectangle = "+(len*bre));
  }


  public static void main(String[] args)
  {
    System.out.println("----------Divya Kheraj Bhanushali B204----------");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Dimensions");
    int len=sc.nextInt();
    int bre=sc.nextInt();
    Shape s;
    s = new Rectangle(len,bre);
    s.displayArea();
    s = new Triangle(len,bre);
    s.displayArea();

  }


}
