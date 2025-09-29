import java.util.*;
class Employee
{
  int id;
  String name;

  void setdata()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employee name and ID");
    name  = sc.nextLine();
    id = sc.nextInt();
  }
  void getdata()
  {
    System.out.println("Employee name = "+name+"\nID = "+id);
  }

}
