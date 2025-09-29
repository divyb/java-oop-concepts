import java.util.*;

class child extends demo
{
    final int interest=12;//Final keyword makes the value of interest unchangable

    child(int r)
    {
      interest = r;
    }
    int calc(int p,int t,int r)
    {
      return(p*t*r/100);
    }

    public static void main(String[] args)
    {
      child ob = new child(16);

    }

}
