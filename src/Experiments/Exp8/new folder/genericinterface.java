interface GenericInterface <T> {
  void name(T obj);
}

class Example <T> implements GenericInterface <T> {
  public void name(T obj)
  {
    String name = obj.getClass().getName();
    if(name.equals("Car"))
    {
      System.out.println("Car");
    }
    else if(name.equals("Bike"))
    {
      System.out.println("Bike");
    }
  }
}

class Car {}
class Bike {}


class Test
{
  public static void main(String []args)
  {
      System.out.println("-----------Divya Kheraj Bhanushali B204----------");
      Car d = new Car();
      Bike c = new Bike();
      Example <Car> a1 = new Example<Car>();
      Example <Bike> a2 = new Example<Bike>();
      a1.name(d);
      a2.name(c);
      System.out.println("-----------Divya Kheraj Bhanushali B204----------");
  }
}
