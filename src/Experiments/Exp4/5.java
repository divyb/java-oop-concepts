import java.util.*;

class Areas
{
  double area(double len,double bre)
  {
    return (len*bre);
  }
  float area(float r)
  {
    return (22/7*r*r);
  }
  float area(float base,float height)
  {
    return (base*height/2);
  }

  public static void main(String[] args)
  {
    System.out.println("----------Divya Kheraj Bhanushali B204----------");
    Areas ob = new Areas();
    Scanner sc = new Scanner(System.in);
    System.out.println("~~~~~ Triangle ~~~~~~");

    System.out.println("Enter base and height");
    float base = sc.nextFloat();
    float height = sc.nextFloat();
    System.out.println("Area = "+ob.area(base,height));


    System.out.println("~~~~~ Rectangle ~~~~~~");

    System.out.println("Enter Length and breadth");
    double bre = sc.nextDouble();
    double len = sc.nextDouble();
    System.out.println("Area = "+ob.area(len,bre));


    System.out.println("~~~~~ circle ~~~~~~");

    System.out.println("Enter Radius");
    float r = sc.nextFloat();
    System.out.println("Area = "+ob.area(r));

    System.out.println("----------Divya Kheraj Bhanushali B204----------");
  }
}
