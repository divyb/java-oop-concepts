import java.util.*;

class NoOfobjects
{
  static int count=0;

  {
    count++;
  }
  void disp()
  {
    System.out.println("Divya Bhanushali");
  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    NoOfobjects ob1 = new NoOfobjects();
    NoOfobjects ob2 = new NoOfobjects();
    ob1.disp();
    ob2.disp();

    System.out.println("number of objects = "+count);
  }
}
