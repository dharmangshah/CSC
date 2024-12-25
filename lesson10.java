import java.util.Scanner;
import java.util.*;
public class lesson10
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      //double av = avg(kb);  
      //System.out.println(av);
      Random rand = new Random();
      int r = rand.nextInt(5);  
      //roll(rand);
      //toss(rand);
      //System.out.println(password(kb));
      //System.out.println(check(379));
      int count = 8;
 while (count > 0)
 {
     System.out.println(count);
     count-=2;
 }
   }
 //calculate average of some numbers.
   public static double avg(Scanner kb)
   {
      int a = 0;
      int sum =0;
      double c = 0.0;
      while (a!=-1)
      {
         System.out.println("Enter the number, enter -1 to end calculating: ");
         a = kb.nextInt();
         sum += a;
         c++;
      }
      double av = sum/c;
      return av;
   }
   //write method that generates 2 random number(1-6) until the sum is 11
   public static void roll(Random rand)
   {
    int a=0,b=0,sum=0;
    while (sum !=11)
    {
     a = rand.nextInt(6) +1;
     b = rand.nextInt(6) +1;
     sum = a+b;
     System.out.println(a+" + "+b+" = "+sum);
    }
   }
   public static void toss(Random rand)
   {
    int toss=0,c=0;
    //0-head
    //1-tail
    while(c!=3)
    {
     toss = rand.nextInt(2);
     if (toss == 0)
     {
      c++;
      System.out.println("Head");
     }
     else
     {
      c=0;
      System.out.println("Tail");
     }
     if (c==3)
      System.out.println("You got 3 heads");
    }
   }
   //wam that asks the user to create a password for email,
   //it should have length>=10
   //must have number
   //must have capital letter
   //must have one of the special character(&$_)
   public static String password(Scanner kb)
   {
    String pass="";
    boolean num=false,caps=false,spe=false,len=false;  
    while (!num && !caps && !spe && !len)
    {
     System.out.println("Please enter the password: ");
     pass = kb.next();
     for (int i =0; i< pass.length();i++)
     { 
      char c = pass.charAt(i);
      if (c >= 'A' && c<= 'Z')
       caps = true;
      else if (c>='1' && c<='9')
       num = true;
      else if (c =='&' || c=='_' || c=='$')
       spe = true;
      if (pass.length()>=10)
       len =true;
     }
    }
    return pass;
   }
   //check if number starts wth 9
   public static boolean check(int num)
   {
    while (num>9)
    {
     num /= 10;
    }
    if (num == 9)
     return true;
    else
     return false;
   }
}