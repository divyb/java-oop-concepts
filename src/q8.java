import java.util.*;

class q8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str= sc.nextLine();
        int num=0,letter=0,space=0,otherchat=0;

    for(int i = 0; i < str.length(); i++)
    {
        char ch = str.charAt(i);
        if(Character.isLetter(ch)){
            letter ++ ;
        }
        else if(Character.isDigit(ch)){
            num ++ ;
        }
        else if(Character.isSpaceChar(ch)){
            space ++ ;
        }
        else{
            otherchat ++;
        }
    }
    System.out.println("The string is : "+str);
    System.out.println("letter: " + letter);
    System.out.println("space: " + space);
    System.out.println("number: " + num);
    System.out.println("other: " + otherchat);
        }
}
