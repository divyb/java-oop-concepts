import java.util.*;

class point
{
  int x,y;
  point(int x,int y)
  {
    this.x = x;
    this.y = y;
  }
  point()
  {
    x=0;
    y=0;
  }
  public static void main(String[] args)
  {
    System.out.println("----------Divya Kheraj Bhanushali B204----------");
    point ob1 = new point(10,20);
    point ob2 = new point();

    System.out.println("Parameterized x= "+ob1.x+"  y= "+ob1.y);
    System.out.println("Default x= "+ob2.x+"  y= "+ob2.y);

    System.out.println("----------Divya Kheraj Bhanushali B204----------");
  }

}
