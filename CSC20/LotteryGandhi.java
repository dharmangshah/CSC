/*
Name: Dev Gandhi
Date: 7February
Description:
Self-grade:
Correct output: I have checked the output and it is working correctly based on the given requirments otherwise I will lose 50 points. Name: 
Testimony: I have not recived the code from any AI websites or any other websites. I have written the code myself. Name: Dev Gandhi
*/
import java.util.*;
public class LotteryGandhi
{
}
class LotteryMachine
{
   public static void main(String[] args)
   {
      run();
   }
   /*
   This method calls the other methods to start the excution
   */
   public static void run()
   {        
     
      Scanner kb = new Scanner(System.in);
      Random rand = new Random();                    
      String answer = "";
      while (!answer.equalsIgnoreCase("q"))
      {
         description();
         System.out.print("\nWhat is your name: ");
         String name = kb.nextLine();
         System.out.println("\nHello " + name + " lets start playing\n");
         play(rand);
         System.out.print("Hit enter to let another person play or enter Q to quit the program");
         answer = kb.nextLine();
      }
      System.out.println("Good Bye! Come Back soon to play again");
   }
   /*
  This method finds the amount of the prize based on the matches found in the
  two big integer values generate. The user will win 100$ per match. For example if the
  generated numbers are 456789 and 912300 the person will win 100 since the digit 9 has appeard in both numbers
  */

   public static int prize(int match)
   {
     int prizeAmount;
     prizeAmount = match*100;
     System.out.println("You won: "+prizeAmount); 
     return prizeAmount;
   }
  /*
  This method generates a big number based on the parameter digitCounts. For example if the
   digitCounts is three then the method will generate a three-digit number such as 123. If the digitCounts is five then 
   this method generates a five-digit integer number such as 12456. 
   12456 can be written as :
   1 * 10000 + 2 * 1000 + 4 * 100 + 5 * 10 + 6. this algorithm is used in the method below to create a 5-digits number 
  */
   public static int bigNumber(Random rand, int digitCounts)
   {
      int num = 0;
      for (int i=digitCounts; i>=1;i--)
      {
        int a = rand.nextInt(9);
        num += (int)Math.pow(10,i-1)*a;
      }
      return num;
   }
  /*
  This method checks to see if there are any matchig digits in the two big number.
  returns the numbers that are matched. This method gets two parameters of type int. Scan through the numbers 
  to count the digits that are appeared in both numbers. This method will store each digit in the given numbers
  in two arrays in order to scan and find the matches.
  
  */
   public static int match(int n1, int n2)
   {
      String s1 = n1 +"";
      String s2 = n2 +"";
      int matchCount = 0;
      char[] m1 = new char[s1.length()]; 
      char[] m2 = new char[s2.length()];
      for (int i=0;i<s1.length();i++)
      {
         m1[i] = s1.charAt(i);
      }
      for (int i=0;i<s2.length();i++)
      {
         m2[i] = s2.charAt(i);
      }
      String s = "";
      boolean b = false;
      for (int i=0;i<m1.length;i++) 
      {
         b = false;
         for (int j=0;j<m2.length;j++)
         {
           if (m1[i] == m2[j])
            {
              s = s +m2[j]+" ";
              b=true;
              m2[j] = ' ';
              matchCount++;
            }
            if (b==true)
            {
             break;
            }
         }
      } 
      System.out.println("Here are the matching numbers: " + s);
      return matchCount;  
   }
  /*
  this method calls the bigNumbers method to generate two big random integers. then it calls the match method
  then it calls the prize method. and finally displays the amount the person won
  */ 
   public static void play(Random rand)
   {
      Scanner kb = new Scanner(System.in);
      boolean more = true;
      int total = 0;
      String answer = "";
      while(!answer.equalsIgnoreCase("q"))
      {
        int num1 = bigNumber(rand,5);
        int num2 = bigNumber(rand,5);
        System.out.println("The numbers that were generated are: "+num1+","+num2);
        int matches = match(num1,num2);
        int prizeAmount = prize(matches);
        total += prizeAmount;
        System.out.print("\nHit enter to continue or press q/Q to quit  ");
        answer = kb.nextLine();      
      }
      System.out.println("\nTotal amount you won: " + total);
      System.out.println("\n");
   }
   //HERE AND THIS METHOD TO BE CHANGED
   public static void description()
   {
      System.out.println("*********************************************************************************************");
      System.out.println("* Welcome to number matching game.  At each round of the game, computer generates two\n"+
      "two big integer random numbers . Based on the digits macthed in both numbers you will get prize.\n"+
      " For each matched digit you will get a 100$ prize. For example if the generated numbers are 45678 and 86547 you will get 500$");
      System.out.println("*********************************************************************************************");    
   }
}