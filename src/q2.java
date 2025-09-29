import java.util.*;

import javax.print.event.PrintJobListener;

import jdk.vm.ci.meta.Constant;
class q2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        float r = sc.nextFloat();
        float pi = (22/7);
        
        
        System.out.println("perimeter = \t"+(2*pi*r));
        System.out.println("Area = \t"+(pi*r*r));
    }
    
}
