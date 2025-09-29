import java.util.*;
class q6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);       
        System.out.println("Enter Side length of Square");
        int n= sc.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            System.out.print("* ");

            System.out.println();
        }
    }
}