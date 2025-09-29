import java.util.*;
class ProjectManager extends Manager
{
  double experience;
  int numberOfProjects;
  void setdata()
  {
    super.setdata();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employee Experience");
    experience  = sc.nextDouble();
    System.out.println("Enter total number of projects");
    numberOfProjects = sc.nextInt();

  }
  void getdata()
  {
    super.getdata();
    System.out.println("Employee Experience = "+experience+"\nNumber of projects = "+numberOfProjects);
  }

  public static void main(String[] args)
  {
    System.out.println("----------Divya Kheraj Bhanushali B204----------");
    ProjectManager ob = new ProjectManager();
    ob.setdata();
    ob.getdata();
    System.out.println("----------Divya Kheraj Bhanushali B204----------");

  }


}
