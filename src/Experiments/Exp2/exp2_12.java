/* -	Write program to print following patterns
*
**
***
****
*****
*/
import java.util.*;
class exp2_12
{
  public static void main(String[] args)
  {
        for(int i=0;i<=5;i++)
        {
          for (int j=0;j<i;j++)
          {
            System.out.print("*");
          }
          System.out.println();
        }
  }
}
