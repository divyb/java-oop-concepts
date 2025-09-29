import java.util.*;

class q4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();

        System.out.println("------Table-----");
        for(int i=0;i<=10;i++)
        {
            System.out.println(n+"  *   "+i+"   =   "+n*i);
        }
    }
}