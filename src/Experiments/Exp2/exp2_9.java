import java.util.*;

class exp2_8
{
  public static void main(String[] args)
  {
    System.out.println("----------Divya Kheraj Bhanushali B204----------");
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter value of n");
    int n = sc.nextInt();
    double sum=0;
    for(int i=1;i<=n;i++)
    {
      sum=sum+Math.pow(i,-1);
    }
    System.out.println("sum ="+sum);
  }
}
