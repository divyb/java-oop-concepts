import java.util.*;
class User
{
  String name,emailId,add,nationality,tel;
  int age;
  // User(String name,String emailId,String add, String nationality,long tel)
  // {
  //   this.name=name;
  //   this.emailId=emailId;
  //   this.add=add;
  //   this.nationality=nationality;
  //   this.tel=tel;
  //   this.age=age;
  // }
  void accept()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter \n1.Name");
    name = sc.nextLine();
    System.out.println("2. Email ID");
    emailId=sc.nextLine();
    System.out.println("3. Address");
    add = sc.nextLine();
    System.out.println("4. Nationality");
    nationality = sc.nextLine();
    System.out.println("5. Age");
    age = sc.nextInt();
    System.out.println("6.Phone number");
    tel = sc.next();
  }
  void disp()
  {
    System.out.println("Name = "+name+"\nEmail Id = "+emailId+"\nAddress = "+add+"\nNationality = "+ nationality + "\nPhone number = "+tel);
  }

}
