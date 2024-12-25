/*
Name: Dharmang Shah
Date: 7 February,2024
Description: This program is about a game that provides the prize according to the matched numbers.
Self-grade: 100% as I have followed all the rubrics.
Correct output: I have checked the output and it is working correctly based on the given requirments otherwise I will lose 50 points. Name: 
Testimony: I have not recived the code from any AI websites or any other websites. I have written the code myself. Name: Dharmang Shah
*/
import java.util.*;
public class LotteryShah
{
}
class LotteryMachine
{
   public static void main(String[] args)
   {
      run();
   }
   //This method initiates the process by calling the other methods.
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
   //Based on the matches identified in the two large integer values generated, this algorithm determines the prize amount. 
   //Every match, the user will receive $100. 
   public static int prize(int match)
   {
     int prizeAmount;
     prizeAmount = match*100;
     System.out.println("You won: "+prizeAmount); 
     return prizeAmount;
   }
  //this method generates a number according to the number of digits provided.
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
  //This method counts the number of matches in the 2 numbers provided.
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
  //This method plays the entire game. 
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
   //Thes method displays the description of the program.
   public static void description()
   {
      System.out.println("* Welcome to number matching game.\n"+
      "At each round of the game, computer generates two big integer random numbers.\n"+
      "Based on the digits macthed in both numbers you will get prize.\n"+
      "For each matched digit you will get a 100$ prize.");
   }
}