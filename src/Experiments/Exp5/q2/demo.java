import java.util.*;

final class demo//stops other classes from inheriting this class
{
  int interest= 8;
  final int calc(int p,int t,int r)//avoids overriding of this method
  {
    return(p*t*r/100);
  }
  public static void main(String[] args)
  {

      demo ob = new demo();
      System.out.println("Final interest = "+ob.calc(100,2,ob.interest));
  }

}
