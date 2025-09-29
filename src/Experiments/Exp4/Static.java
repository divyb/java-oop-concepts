public class Static
{
	static int x,a; 
	int y;	
	static
	{
		int x = 30;
		System.out.println(" static block:- ");
	}

	static void vals()
	{
		System.out.println(" static method");
	}
	public static void main(String[] args)
	{
		System.out.println("B220 ARIHANT JAIN");
		Static.x = 45;
		Static.a = 90;
		Static.vals();
		System.out.println("Static variables:- " + Static.x + "  " + Static.a);
		Static st = new Static();
		st.y = 23;
		System.out.println("Non-static variable:- "+ st.y);
                System.out.println("B220 ARIHANT JAIN");	
 
      }
}