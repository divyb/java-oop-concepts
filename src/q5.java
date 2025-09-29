import java.util.*;

class q5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str= sc.nextLine();

        String w ="";
        
        for(int i=0;i<str.length();i++)
        {
            w = str.charAt(i) +w; 
        }
        System.out.println("Reversed string = "+w);
    }
}