import java.util.*;

class exp3_2
{
  int employeeNo;
  String name;
  long salary;

  void accept()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter Name");
    name = sc.nextLine();

    System.out.println("\nEnter Employee Number");
    employeeNo = sc.nextInt();

    System.out.println("\nEnter Salary");
    salary = sc.nextLong();

  }

  void disp()
  {
    System.out.println("\nName: " + name);
    System.out.println("\nEmployee Number: " + employeeNo);
    System.out.println("\nSalary: Rs."+salary);
  }

  public static void main(String[] args)
  {
    System.out.println("----------Divya Bhanushali B204----------");
    exp3_2 ob = new exp3_2();

    ob.accept();
    ob.disp();
    System.out.println("----------Divya Bhanushali B204----------");
  }
}
