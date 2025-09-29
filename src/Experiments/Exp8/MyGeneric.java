import java.util.*;
class MyGeneric<G>
{
  G a;
  MyGeneric(G a)
  {
    this.a = a;
  }

  G getterMethod()
  {
    return a;
  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("-----------Divya Kheraj Bhanushali B204----------");

    System.out.println("Enter String");
    MyGeneric<String> str = new MyGeneric<String>(sc.nextLine());
    String Str = str.getterMethod();

    System.out.println("Enter Integer");
    MyGeneric<Integer> IntNumber = new MyGeneric<Integer>(sc.nextInt());
    Integer intNumber = IntNumber.getterMethod();

    System.out.println("Enter Float");
    MyGeneric<Float> FloatNumber = new MyGeneric<Float>(sc.nextFloat());
    Float floatnumber = FloatNumber.getterMethod();

    System.out.println("Enter Double");
    MyGeneric<Double> DoubleNumber = new MyGeneric<Double>(sc.nextDouble());
    Double doublenumber = DoubleNumber.getterMethod();

    System.out.println(Str);
    System.out.println(intNumber);
    System.out.println(floatnumber);
    System.out.println(doublenumber);
    System.out.println("----------Divya Kheraj Bhanushali B204----------");


  }

}
