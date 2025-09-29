import java.util.*;

class MotorVehicle
{
  String name;
  int number,price;
  MotorVehicle(String name,int number,int price)
  {
    this.name = name;
    this.number = number;
    this.price = price;


  }
  void display()
  {
    System.out.println("Model name = "+name+"\nModel number = "+number+"\nModel price = "+price);
  }
}
