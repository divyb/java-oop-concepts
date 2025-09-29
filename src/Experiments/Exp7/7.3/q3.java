import java.util.*;

interface Admin
{
  void Experience();
}
interface Account
{
  void Pay();
}

class Person implements Admin,Account
{
  String name,code;
  public void Experience()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter experience");
        int experience = sc.nextInt();
        System.out.println("Experience = "+experience);
    }
  public void Pay()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Salary");
      double pay = sc.nextDouble();
      System.out.println("Salary = "+ pay);
    }

}

class Master extends Person
{

  void disp()
  {

    System.out.println("Name = "+name+"\nCode = "+code);
  }

  public static void main(String[] args)
  {
      Master ob = new Master();
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter Name");
      ob.name = sc.nextLine();

      System.out.println("Enter Code");
      ob.code = sc.nextLine();
      ob.Pay();
      ob.Experience();
      ob.disp();



    }
  }
