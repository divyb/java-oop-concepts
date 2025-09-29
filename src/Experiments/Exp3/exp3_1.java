import java.util.*;

class exp3_1
{
  String name;
  String roll;

  void accept()
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter name:");
    name=sc.nextLine();

    System.out.println("Enter roll number");
    roll=sc.nextLine();

  }

  void disp()
  {
    System.out.println("Name: " + name);
    System.out.println("Roll number: " + roll );
  }
  public static void main(String[] args)
  {
    System.out.println("---------- Divya Bhanushali B204 -----------");
    exp3_1 ob = new exp3_1();
    ob.accept();
    ob.disp();
    System.out.println("---------- Divya Bhanushali B204 -----------");
  }
}
