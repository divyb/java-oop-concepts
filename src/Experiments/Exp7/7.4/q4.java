import java.util.*;

abstract class Employee
{
  int eno;
  String ename;
  double sal;
  Employee(String ename,int eno)
  {
    this.ename=ename;
    this.eno=eno;
  }
  abstract void salary(double sal);

}
class RegularEmployee extends Employee
{
    double sal;
    RegularEmployee(String ename,int eno)
    {
      super(ename,eno);
    }
    public void salary(double sal)
    {
      this.sal=sal;
    }

    void disp()
    {
      System.out.println("Employee name   = "+ename);
      System.out.println("Employee number = "+eno);
      System.out.println("Salary = "+sal);

    }
}


class TemporaryEmployee extends Employee
{
    double sal;
    TemporaryEmployee(String ename,int eno)
    {
      super(ename,eno);
    }
    public void salary(double sal)
    {
      this.sal=sal;
    }
    void disp()
    {
      System.out.println("Employee name   = "+ename);
      System.out.println("Employee number = "+eno);
      System.out.println("Salary = "+sal);
    }
}


class Test
{
  public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("----------Divya Kheraj Bhanushali b204----------\n");
      System.out.println("*******Temporary Employee********");
      System.out.println("Enter \n1.Employee name");
      String ename = sc.nextLine();
      System.out.println("Employee number");
      int eno = sc.nextInt();

      TemporaryEmployee te = new TemporaryEmployee(ename,eno);
      System.out.println("Enter Salary");
      te.sal = sc.nextDouble();
      te.disp();
      //System.out.println("Salary = "+te.salary);
      System.out.println("*******Regular Employee********");
      System.out.println("Enter \n1.Employee name");
      sc.nextLine();
      ename = sc.nextLine();
      System.out.println("Employee number");
      eno = sc.nextInt();

      RegularEmployee re = new RegularEmployee(ename,eno);
      System.out.println("Enter Salary");
      re.sal = sc.nextDouble();

      re.disp();

      System.out.println("----------Divya Kheraj Bhanushali b204----------");
  }
}
