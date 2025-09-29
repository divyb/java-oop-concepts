import java.util.*;

class Student
{
    String name;
    int roll;

    Student(String name, int roll)
    {
      this.name = name;
      this.roll = roll;
    }
    void disp()
    {
      System.out.println("Name :"+name+"\nRoll no.: "+roll);
    }
    
}
