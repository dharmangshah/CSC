import java.util.Scanner;
/*
name: Dharmang Shah
date: 21 october,2023
program description: this program is like a calculator
self grade: 100%, as i followed all the rubrics and submitted on time.
Testimony: I did all the code by myself and did not get help from unothourized resources : Dharmang Shah
Make sure to follow all the requirmnets including the method names and parameters
 by reading the documnet first. Every single requirmnet has points.
*/
public class AlgebraShah
{
}
class Operations
{
   public static void main(String[] args)
   {
      start();
   }
   //the following method is the last method which puts together everything else.
   public static void start()
   {
      Scanner kb = new Scanner(System.in);
      System.out.println("Welcome to Calculator app");
      System.out.print("How many expressions do you have: ");
      int count = kb.nextInt();
      for(int i = 1; i <= count; i++)
      {  
       System.out.println("*****************************************");
       list();
       String operator = kb.next();
       System.out.println("Please enter the first number: ");
       int num1 = kb.nextInt();
       System.out.println("Please enter the second number: ");
       int num2 = kb.nextInt();
       double ans = evaluate(num1,num2,operator);
       String number1 = numToWord(num1);
       String number2 = numToWord(num2);
       String op = OpToWord(operator);
       System.out.println(number1+op+number2+" is equal to: "+ans);
      }
   }
   //This method converts the operator to words.
   public static String OpToWord(String operator)
   {
     if (operator.equalsIgnoreCase("+"))
      return " Plus ";
     else if (operator.equalsIgnoreCase("-"))
      return " Minus ";
     else if (operator.equalsIgnoreCase("*"))
      return " Multiply ";
     else if (operator.equalsIgnoreCase("/"))
      return " Divide ";
     else if (operator.equalsIgnoreCase("%"))
      return " Modulus ";
     else if (operator.equalsIgnoreCase("^"))
      return " Raise to ";
     else if (operator.equalsIgnoreCase("percent"))
      return " percent of ";
     else 
      return "Invalid";  
   }
   //This method convers numbers to words.
   public static String numToWord(int z)
   {       
     if (z ==0)
      return "Zero";
     else if (z==1)
      return "One";
     else if (z==2)
      return "Two";
     else if (z==3)
      return "Three";
     else if (z==4)
      return "Four";
     else if (z==5)
      return "Five";
     else if (z==6)
      return "Six";
     else if (z==7)
      return "Seven";
     else if (z==8)
      return "Eight";
     else if (z==9)
      return "Nine";
     else 
      return "Invalid";
   }
   //This method does all the calculation and returns the result.
   public static double evaluate(int a, int b, String op)
   {
    switch (op)
    {
     case "+": return (a+b);
     case "-": return (a-b);
     case "*": return (a*b);
     case "/": return (a/b);
     case "%": return (a%b);
     case "^": return Math.pow(a,b);
     case "percent": return ((a*b)/100); 
     default: return(0);
    }
   }
   //This method lists the options for the user.
   public static void list()
   {
     System.out.println("To add enter +: ");
     System.out.println("To subtact enter -: ");
     System.out.println("To divide enter /: ");
     System.out.println("To multiply enter *: ");
     System.out.println("To find exponent enter ^: ");
     System.out.println("To do modulus enter %: ");
     System.out.println("To find percentage enter percent: ");     
   }
}