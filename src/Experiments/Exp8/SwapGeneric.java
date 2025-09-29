import java.util.*;

class SwapGeneric<S>
{
  S a;
  S b;
  SwapGeneric(S a,S b)
  {
    this.a = a;
    this.b = b;

  }
  void Swap()
  {
    S c;
    c=a;
    a=b;
    b=c;
  }

  void printGeneric()
  {
    System.out.println("\n__________Before Swap__________");
    System.out.println("a = " + a + "\tb = " + b );

    Swap();

    System.out.println("__________After Swap__________");
    System.out.println("a = " + a + "\tb = " + b );


  }
  public static void main(String[] args)
  {
    System.out.println("-----------Divya Kheraj Bhanushali B204----------");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Two strings");
    SwapGeneric<String> str = new SwapGeneric<String>(sc.nextLine(),sc.nextLine());
    str.printGeneric();

    System.out.println("Enter Two Integers");
    SwapGeneric<Integer> intNumber = new SwapGeneric<Integer>(sc.nextInt(),sc.nextInt());
    intNumber.printGeneric();

    System.out.println("Enter Two Characters");
    SwapGeneric<Character> ch = new SwapGeneric<Character>(sc.next().charAt(0),sc.next().charAt(0));
    ch.printGeneric();

    System.out.println("Enter Two Float");
    SwapGeneric<Float> FloatNumber = new SwapGeneric<Float>(sc.nextFloat(),sc.nextFloat());
    FloatNumber.printGeneric();

    System.out.println("Enter Two Double");
    SwapGeneric<Double> DoubleNumber = new SwapGeneric<Double>(sc.nextDouble(),sc.nextDouble());
    DoubleNumber.printGeneric();

    System.out.println("-----------Divya Kheraj Bhanushali B204----------");
  }
}
