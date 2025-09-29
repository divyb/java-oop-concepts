import java.util.*;

class exp3_3
{
    String Name,accountType;
    Long balance;
    int accountNumber;

    void init()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("\nEnter Name");
      Name = sc.nextLine();

      System.out.println("\nEnter Account Number");
      accountNumber = sc.nextInt();

      System.out.println("\nEnter Account Type");
      accountType = sc.next();

      System.out.println("\nEnter Balance in Rs.");
      balance = sc.nextLong();

    }
    void deposit(long amount)
    {
      balance+=amount;
    }

    void withdraw(long amount)
    {
      if(balance>=amount)
      {
        System.out.println(amount+" Withdrawn");
        balance-=amount;
      }
      else
      {
        System.out.println("Not Enough balance ");
      }
    }
    void disp()
    {
      System.out.println("\nName: "+Name);
      System.out.println("\nBalance "+balance);
    }

    public static void main(String[] args)
    {
      System.out.println("----------Divya Bhanushali B204----------");
      exp3_3 ob = new exp3_3();
      ob.init();
      ob.deposit(5000);
      ob.withdraw(2500);
      ob.disp();
      System.out.println("----------Divya Bhanushali B204----------");
    }
}
