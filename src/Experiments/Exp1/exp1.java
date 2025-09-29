import java.util.*;

public class exp1
{
	public void swapvar(int a, int b)
	{
		System.out.println("Before Swapping a= "+a+" b= "+b+"\n");
		int c=a;
		a=b;
		b=c;
		System.out.println("After Swapping  a= "+a+" b= "+b+"\n");
	}
	
	public void swapwvar(int a, int b)
	{
		System.out.println("Before Swapping a= "+a+" b= "+b+"\n");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping  a= "+a+" b= "+b+"\n");
	}
	public void swapxor(int a, int b)
	{
		System.out.println("Before Swapping a= "+a+" b= "+b+"\n");
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping  a= "+a+" b= "+b+"\n");
	}

	public static void main(String[] args)
	{
		System.out.println("----------B204 Divya Kheraj Bhanushali----------\n");
		Scanner sc = new Scanner(System.in);
		exp1 obj = new exp1();
		

		System.out.println("Enter two numbers to be swapped");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Calling Function Swap with third variable\n");
		obj.swapvar(a,b);

		System.out.println("Calling Function Swap without third variable\n");
		obj.swapwvar(a,b);
		
		System.out.println("Calling Function Swap with XOR\n");
		obj.swapxor(a,b);
		
		System.out.println("----------B204 Divya Kheraj Bhanushali----------\n");
	}
	
}