//-	Write a Java Program to illustrate arithmetic, relational, logical, bitwise, and conditional operators supported by Java.
import java.util.*;

class exp2_2
{
	public static void main(String[] args)
	{
		System.out.println("----------Divya Bhanushali B204----------");
		int a=10,b=5;
		System.out.println("a= "+a+" b= "+b);

		System.out.println("-----Arthmetic operators-----");
		System.out.println("a+b = "+(a+b));
		System.out.println("a-b = "+(a-b));
		System.out.println("a*b = "+(a*b));
		System.out.println("a/b = "+(a/b));
		System.out.println("a%b = "+(a%b));

		System.out.println("-----Relational----- ");
		if(a==b)
			System.out.println("a=b");
		if(a<b)
			System.out.println("a<b");
		if(a>b)
			System.out.println("a>b");
		if(a!=b)
			System.out.println("a!=b");
		if(a<=b)
			System.out.println("a<=b");
		if(a>=b)
			System.out.println("a>=b");

		System.out.println("-----Logical----- ");
		if(a!=b && a>b)
			System.out.println("a!=b && a>b");
		if(a==b || a>b)
			System.out.println("a==b || a>b");

		System.out.println("-----Bitwise-----");
		System.out.println("a|b"+(a|b));
		System.out.println("a&b = "+(a&b));
		System.out.println("a^b = "+(a^b));
		System.out.println("~b = "+(~b));
		System.out.println("a<<b = "+(a<<b));
		System.out.println("a>>b = "+(a>>b));

		System.out.println("-----conditional-----");
		System.out.println(a>=b?"a>=b":"a<b");

		System.out.println("----------Divya Bhanushali B204----------");
	}
}
