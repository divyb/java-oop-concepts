import java.util.*;
class AddArrayListTest {
	
      public String addition(String a,String b){
		float c = Float.parseFloat(a.trim())+Float.parseFloat(b.trim());
		return c+"";
      }
 	public static void main(String...args){
        System.out.println("----------Divya Kheraj Bhanushali B204----------");
        Scanner sc = new Scanner(System.in);
		ArrayList<String> lst = new ArrayList<String>();
        AddArrayListTest t =new AddArrayListTest (); 
        String a;
        for(int i = 0; i<5;i++)
        {
            System.out.println("Enter Two numbers whose addition is to be stored in Array list");
            a = t.addition(sc.next(),sc.next());
            lst.add(a);
        }
		

		// using interator pattern of java... [it is predieined OO desing pattern]
		Iterator it = lst.iterator();
		for(  ;it.hasNext();  )
            System.out.println(it.next());
            
    
        System.out.println("----------Divya Kheraj Bhanushali B204----------");
    }           
};
