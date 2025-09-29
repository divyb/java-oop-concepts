import java.util.*;

class GenericConstuctor
{

  public <G> GenericConstuctor(G a, G b)
  {
    System.out.println("A = "+a+"\tB= "+b);
  }

  public static void main(String[] args)
  {
    System.out.println("-----------Divya Kheraj Bhanushali B204----------");

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Two Integers");
    Integer i1= sc.nextInt(),i2 = sc.nextInt();
    GenericConstuctor iob = new GenericConstuctor(i1,i2);

    System.out.println("-----------Divya Kheraj Bhanushali B204----------");

  }
}
