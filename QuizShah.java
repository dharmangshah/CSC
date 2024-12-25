/*
name: Dharmang Shah
description: this program gives the user a math paper and gives the marks to the user.
self-grade: 100%, as I have followed all the rubrics and critireon.
Testimony: I have written the code by myself with no help from the internet or any other AI sites,
I am aware that getting help from unauthorized sources will result in a zero points.   name:Dharmang Shah
Any submission from previous semesters will be given zero points
*/
import java.util.*;
public class QuizShah
{
}
class Quiz 	 
{
   public static void main(String[] args)
   {
      makeExam(); 
   } 
   //This method mkaes the questions for the user.
   public static void makeExam()
   {
      Scanner kb = new Scanner(System.in);
      Random rand = new Random();
      int size = rand.nextInt(10- 5+ 1 ) + 5; 
      String[] questions = new String[size]; 
      int[] answers = new int[size];      
      int[] points= new int[size];
      boolean repeat = true;
      while(repeat)
      {
         populate(questions,answers,points);
         int[]  score = takeExam(answers,points, questions);
         System.out.println("Here are the scores for each question: "); 
         System.out.println(Arrays.toString(score));      
         int total = total(score);
         System.out.println("Total points earned: " + total);
         System.out.println("\n\nDo you want to take the again!!"); 
         String user = yesNo(kb);
         repeat = user.equalsIgnoreCase("yes");
      }      
   } 
   //This method calculates the total points of user.
   public static int total(int[] scores)
   {
      int total =0;
      for (int i = 0;i<scores.length;i++)
      {
         total += scores[i];
      }
      return total;
   }
   //This method asks the user if he wants to play again or not
   public static String yesNo(Scanner kb)
   {
      String userResponse;
      do
      {
         System.out.println("Enter yes or no: ");
         while (!kb.hasNext())
         {
            kb.nextLine();
            System.out.println("Please enter yes or no: ");
         }
         userResponse = kb.next();
      }while(!userResponse.equals("yes") && !userResponse.equals("no"));
      return userResponse;
   }
   //This method randomly chooses an operator and returns it.
   public static char getOp(Random rand)
   {
      String s = "*%/+-^";
      int index = rand.nextInt(5);
      char op = s.charAt(index);
      return op;
   }
   //this method gets the 2 numbers required for the expression.
   public static int getNum()  
   {
      Random rand = new Random();
      int[] nums = new int[100];
      for (int i =0; i<100; i++)
      {
       nums[i] = rand.nextInt(50)+1;
      }
      int index = rand.nextInt(100);
      return nums[index];
   }
   //this method creates the question and gives a random number of weightage to the question.
   public static void populate(String[] quiz, int[] answer,  int[] points)
   {
      Random rand = new Random();
      for(int i =  0; i < quiz.length; i++)
      {
         int num1 = getNum();
         int num2 = getNum();
         int index = rand.nextInt(5);
         char op = getOp(rand);
         quiz[i] = num1+ " " + op +" " +  num2;
         answer[i] = evaluate(num1,op,num2);
         int earned = rand.nextInt(10)+1;
         points[i] = earned;
      }  
   }
   //this method returns the correct answer of the expression.
   public static int evaluate(int num1, char op, int num2) 
   {
      switch(op)
      {
         case '*' : 
            return num1 * num2;
         case '/' : 
            return num1/num2;
         case '+' : 
            return num1 + num2;
         case '-' : 
            return num1 - num2;
         case '^': 
            return (int)Math.pow(num1,num2);
         case '%' : 
            return num1 % num2;   
         default :  
            return -1;
      }
   }
//this method checks if the answer given by the user is correct or not.
   public static int[] takeExam(int[] answers, int[] values, String[] questions)
   {
      info(); 
      int[]  scores = new int[answers.length];
      Scanner kb = new Scanner(System.in);
      for(int  i = 0; i < answers.length; i++)
      {
         System.out.println("The question is "+questions[i]);
         System.out.println("Enter your answer: ");
         int ans = kb.nextInt();
         if (ans == answers[i])
         {
            scores[i] = values[i];
            System.out.println("Correct");
         }
         else
            System.out.println("Incorrect");                
      }
      return scores;
   }
   //this method gives the introduction.
   public static void info()
   {
      System.out.println("****************************************\n");
      System.out.println("There are some math questions in this quiz.\nYou get certain points if you answer it correctly");
      System.out.println("lets take the quiz");
      System.out.println("****************************************\n");
   }	
} 
