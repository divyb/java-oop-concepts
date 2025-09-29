import java.util.*;
class Manager extends Employee
{
  double salary;
  void setdata()
  {
    super.setdata();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employee salary");
    salary  = sc.nextDouble();

  }
  void getdata()
  {
    super.getdata();
    System.out.println("Employee salary = "+salary);
  }

}
