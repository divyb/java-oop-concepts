import java.util.*;

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
      te.salary = sc.nextDouble();
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
      re.salary = sc.nextDouble();

      re.disp();

      System.out.println("----------Divya Kheraj Bhanushali b204----------");
  }
}
