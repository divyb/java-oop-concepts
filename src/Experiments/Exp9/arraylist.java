import java.util.*;

class arraylist
{

  public static void main(String[] args)
  {

    System.out.println("----------Divya Kheraj Bhanushali B204----------");
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> al = new ArrayList<Integer>();
    System.out.println("\n*****a.	Use add( ) method to add 5 elements******");
    for(int i=0;i<5;i++)
    {
      System.out.println("Enter element number "+(i+1));

      al.add(sc.nextInt());
    }



    System.out.println("\n*****b.	Use addall( ) methods to add 4- elements to array list.******");
    ArrayList<Integer> al2 = new ArrayList<Integer>();
    for (int i = 0;i<4;i++)
    {
        System.out.println("Enter element number "+(i+1));
        al2.add(sc.nextInt());
    }
    al.addAll(al2);
    System.out.println("\n*****c.	Access elements of list using for each loop (Display all elements)*****");
    for(int i:al)
      System.out.print(i+"\t");
    System.out.println();
    
    System.out.println("\n*****d.	Use set( ) method to replace 4th position element with new element*****");
    System.out.println("Enter element to be set at position 4");
    al.set(3,sc.nextInt());

    System.out.println("\n*****e.	Use add( ) method to add new element at 5th position*****");
    System.out.println("Enter element to be added at 5th position");
    al.add(4,sc.nextInt());


    System.out.println("\n***** f.Retrieve elements from list using Iterator*****");

    Iterator access = al.iterator();
    while(access.hasNext())
    {
      System.out.print(access.next()+"\t");
    }
    System.out.println();

  System.out.println("\n***** g.	Check size( ) of collection*****");
  System.out.println("The size of the Array List is  "+al.size());

  System.out.println("\n*****h.	Find the last occurrence of any element*****");
  System.out.println("Enter element for which last occurrence is to be found");
  int a = al.lastIndexOf(sc.nextInt());
  System.out.println("last Index = "+a);

  System.out.println("\n*****i.	Remove one element by index.*****");
  System.out.println("Enter index of element to be removed");
  int index = sc.nextInt();
  al.remove(index);
  System.out.println("\n*****j.	Remove one element by element.*****");
  System.out.println("Enter value of element to be removed");
  index = sc.nextInt();
  al.remove(new Integer(index));
  System.out.println("\n*****k.	Traverse the list using ListIterator*****");
  ListIterator ltr = al.listIterator();
  while(ltr.hasNext())
  {
    System.out.print(ltr.next()+"\t");
  }
  System.out.println();
    System.out.println("\n----------Divya Kheraj Bhanushali B204----------");
  }


}
