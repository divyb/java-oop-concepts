import java.util.*;

class linkedlist
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("----------Divya Kheraj Bhanushali B204----------");
    LinkedList<Integer> list = new LinkedList<Integer>();

    System.out.println("\n*****add(element obj) – use for 3 number of times *****");
    for(int i = 0;i<3;i++)
    {
        System.out.println("Enter element number"+ (i+1));
        list.add(sc.nextInt());
    }

    System.out.println("\n*****add (int position,element obj) *****");
    System.out.println("enter position and value");
    list.add(sc.nextInt(),sc.nextInt());

    System.out.println("\n*****addFirst(elelemt obj) *****");
    System.out.println("Enter value");
    list.addFirst(sc.nextInt());

    System.out.println("\n*****addLast(element obj) *****");
    list.addLast(sc.nextInt());

    System.out.println("\n*****removeFirst() *****");
    list.removeFirst();
    System.out.println("\n*****removeLast() *****");
    list.removeLast();

    System.out.println("\n*****remove(int position) *****");
    System.out.println("Enter index position");
    list.remove(sc.nextInt());


    System.out.println("\n*****get(int position) *****");
    System.out.println("Enter index position");
    int pos =list.get(sc.nextInt());
    System.out.println("position = "+pos);


    System.out.println("\n*****getFirst() *****");
    pos = list.getFirst();
    System.out.println("position = "+pos);
    System.out.println("\n*****getLast() *****");
    pos = list.getLast();
    System.out.println("position = "+pos);

    System.out.println("\n*****set(int position, element object) *****");
    System.out.println("Enter position and value");
    list.set(sc.nextInt(),sc.nextInt());


    System.out.println("\n*****b.	Traverse the list using following techniques *****");
    System.out.println("\nfor each");

    for(int i:list)
      System.out.print(i+"\t");


    System.out.println("\n\n*****Iterator *****");
    Iterator itr = list.iterator();
    while(itr.hasNext())
      System.out.println(itr.next()+"\t");

    System.out.println("\n\n*****List Iterator *****");
    ListIterator litr = list.listIterator();
    while(litr.hasNext())
      System.out.println(litr.next()+"\t");

    System.out.println("----------Divya Kheraj Bhanushali B204----------");

  }

}
