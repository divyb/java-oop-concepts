import java.util.*;

class MaxTest
{
  float max(float a,float b)
  {
    if(a>b)
      return a;

    return b;
  }
  double max(double a,double b)
  {
    if(a>b)
      return a;

    return b;
  }
  int max(int a,int b)
  {
    if(a>b)
      return a;

    return b;
  }
  public static void main(String[] args)
  {
    System.out.println("----------Divya Kheraj Bhanushali B204----------");
    MaxTest ob = new MaxTest();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two Integers");
    int I1=sc.nextInt();
    int I2=sc.nextInt();

    System.out.println("Enter two Float numbers");
    float F1=sc.nextFloat();
    float F2=sc.nextFloat();

    System.out.println("Enter two double");
    double D1=sc.nextDouble();
    double D2=sc.nextDouble();

    System.out.println("Larger Integer = "+ob.max(I1,I2));
    System.out.println("Larger float = "+ob.max(F1,F2));
    System.out.println("Larger double = "+ob.max(D1,D2));
    System.out.println("----------Divya Kheraj Bhanushali B204----------");
  }
}
