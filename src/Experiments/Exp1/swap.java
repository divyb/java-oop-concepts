import java.util.*;

class swap
{	
	public static void main(String[] args)
	{
		System.out.println("----------B204 Divya Kheraj Bhanushali----------\n");
		Scanner sc = new Scanner(System.in);
		exp1b obj = new exp1b();
		

		System.out.println("Enter two numbers to be swapped");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a!=b)
		{
		System.out.println("Calling Function Swap with third variable\n");
		obj.swapvar(a,b);//abstraction by parameterization

		System.out.println("Calling Function Swap without third variable\n");
		obj.swapwvar(a,b);//abstraction by parameterization
		
		System.out.println("Calling Function Swap with XOR\n");
		obj.swapxor(a,b);//abstraction by parameterization
		
		System.out.println("----------B204 Divya Kheraj Bhanushali----------\n");
		}
		
		else
			System.out.println("No need to swap");
	}
}