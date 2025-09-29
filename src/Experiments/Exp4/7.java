import java.util.*;
class q7
{
  static int count=0;//static variable

  {
    count++;
  }
  static
  {
    System.out.println("Static block");
  }
  public static void disp()
  {
    System.out.println("Static method disp()");
  }

  public static void main(String[] args)
  {
    System.out.println("----------Divya Kheraj Bhanushali B204----------");
    disp();
    System.out.println("Static variable count"+q7.count);
    System.out.println("----------Divya Kheraj Bhanushali B204----------");
  }
}
