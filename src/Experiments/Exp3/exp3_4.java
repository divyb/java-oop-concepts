import java.util.*;

class exp3
{
  int x,y;

  void disp()
  {
    System.out.println(x+" + "+y+"i");
  }
  void accept()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter real part");
    x=sc.nextInt();

    System.out.println("\nEnter imaginary part");
    y=sc.nextInt();

  }
  exp3 add(exp3 p1,exp3 p2)
  {
    exp3 p3 = new exp3();
    p3.x = p1.x + p2.x;
    p3.y = p1.y + p2.y;
    return p3;
  }

  public static void main(String[] args)
  {
    System.out.println("----------Divya Bhanushali B204----------");
    exp3 p1 = new exp3();
    exp3 p2 = new exp3();

    exp3 p3 = new exp3();
    exp3 ob = new exp3();
    p1.accept();
    p2.accept();

    p3 = ob.add(p1,p2);
    p3.disp();
    System.out.println("----------Divya Bhanushali B204----------");
  }
}
