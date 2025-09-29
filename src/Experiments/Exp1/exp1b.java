import java.util.*;

public class exp1b
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
}