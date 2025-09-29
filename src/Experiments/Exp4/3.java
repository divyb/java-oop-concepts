import java.util.*;

class Time
{
  int hours,minutes,seconds;

  Time()
  {
    hours=0;
    minutes=0;
    seconds=0;
  }

  Time(int hours,int minutes, int seconds)
  {
    this.hours=hours;
    this.minutes=minutes;
    this.seconds=seconds;
  }
  void accept()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter hours");
    hours = sc.nextInt();
    System.out.println("Enter minutes");
    minutes = sc.nextInt();
    System.out.println("Enter seconds");
    seconds = sc.nextInt();
  }
  static void disp(Time ob)
  {
    System.out.println(ob.hours+":"+ob.minutes+":"+ob.seconds);
  }

  public static void main(String[] args)
  {
    System.out.println("----------Divya Kheraj Bhanushali B204----------");
    Time ob=new Time();
    ob.accept();
    Time t1= new Time(ob.hours,ob.minutes,ob.seconds);
    ob.accept();
    Time t2= new Time(ob.hours,ob.minutes,ob.seconds);
    Time sum= new Time();

    sum.hours=t1.hours+ t2.hours;
    sum.minutes=t1.minutes+ t2.minutes;
    sum.seconds=t1.seconds+ t2.seconds;

    if(sum.seconds>=60)
      {
        sum.seconds-=60;
        sum.minutes+=1;
      }
    if(sum.minutes>=60)
      {
          sum.minutes-=60;
          sum.hours+=1;
      }
    if(sum.hours>=24)
      {
        sum.hours-=24;
      }

      System.out.println("Time 1:");
      disp(t1);
      System.out.println("Time 2:");
      disp(t2);
      System.out.println("Sum");
      disp(sum);
      System.out.println("----------Divya Kheraj Bhanushali B204----------");

  }

}
