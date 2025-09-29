import java.util.*;

class Test extends Student
{
  int marks;
  Test(String name, int roll ,int marks)
  {
    super(name,roll);
    this.marks=marks;
    this.roll=roll;
  }

  public static void main(String[] args)
  {
    System.out.println("----------Divya Kheraj Bhanushali B204----------");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name");
    String n=sc.nextLine();

    System.out.println("Enter roll number");
    int r=sc.nextInt();

    System.out.println("Enter marks");
    int m=sc.nextInt();

    Test ob = new Test(n,r,m);
    ob.disp();
    System.out.println("Marks "+ob.marks);

    System.out.println("----------Divya Kheraj Bhanushali B204----------");
  }
}
