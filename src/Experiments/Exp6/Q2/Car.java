import java.util.*;
class Car extends MotorVehicle
{
  double disc;
  Car(String name,int number,int price,double disc)
  {
    super(name,number,price);

  this.disc = disc;
}
  int discount()
  {
    int fin;
    fin = (int)(price - (price*disc/100));
    return fin;
  }

  public static void main(String[] args)
  {
    System.out.println("----------Divya Kheraj Bhanushali B204----------");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Model name,number,price and discount");
    String name = sc.nextLine();
    int number = sc.nextInt();
    int price = sc.nextInt();
    double d= sc.nextDouble();

    Car ob = new Car(name,number,price,d);
    ob.display();
    System.out.println("discounted price  = "+ob.discount());
    System.out.println("----------Divya Kheraj Bhanushali B204----------");
  }
}
