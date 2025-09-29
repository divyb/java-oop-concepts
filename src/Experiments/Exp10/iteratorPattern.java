class iteratorPattern
{

  public static void main(String[] args)
  {
    System.out.println("----------Divya Kheraj Bhanushali B204----------");
    collectionOfNames cmpnyRepo = new collectionOfNames();
    Iterator it = cmpnyRepo.getIterator();

    while(it.hasNext())
    {
      String name = (String)it.next();
      System.out.println("Car: "+name);
    }
    System.out.println("----------Divya Kheraj Bhanushali B204----------");
  }

}
