/*
Name: Aarsh Ganatra
Description: This programme prevents letter duplication while assisting us in writing a list of letters.
date: 5 February,2024
Self-grade: 100%, as I have completed all the rubric and provided the necessary comments.
Testimony: I have written the code by myself without any help from the unauthorized resources. Name- Aarsh Ganatra
*/
import java.util.*;
public class LettersGanatra
{
}
class Letters
{
 public static void main(String[] args)
  {
     desc();
     char[] letter = new char[]{'a','a','a','a','a'};
     populate(letter);
     print(letter);
  }
   /*
   The letter the user entered as input is found by this method by searching through the array of letters. 
   If the letter is in the array, the function will return true. 
   If the letter is not in the array, it will return false.
   */
   public static boolean found(char[] letters, char input)
   {
      for (int i=0;i<letters.length;i++)
      {
         if (letters[i] == input)
         {
          return true;
         }
      }
      return false;
   }
   /*
   This method verifies user input.One letter, either a-z or A-Z, must be entered by the user. 
   We will discard input that is longer than one.Any more input will be returned unread. 
   */
   public static char validateInput(Scanner kb)
   {
      
      String input=""; ;
      char firstLetter =' ';
      boolean done = false;
      while(!done)
      {
        System.out.println("Enter a letter a-z or A-Z: ");
        input = kb.next(); 
        while (input.length()>1)
        {
          System.out.println("You must enter a single letter\n");
          System.out.println("Enter a letter a-z or A-Z: ");
          input = kb.next();
        }
        input = input.toUpperCase(); 
        firstLetter = input.charAt(0);
        if (firstLetter>='A' && firstLetter<='Z')
        {
           done = true;
        }
        else
        {
          System.out.println("You did not enter a valid letter\n");
        }
      }
      return firstLetter;   
   }
   /*
   This method adds many distinct letters to an array of a particular size.
   This method asks the user to enter the letters a–z or A–Z repeatedly.
   */
   public static void populate(char[] letters)
   {
     Scanner kb = new Scanner(System.in);
     for(int i = 0; i < letters.length; i++)
     {
        char letter;
        letter = validateInput(kb);
        boolean f; 
        f = found(letters,letter);
        if (f == false)
        {
           letters[i] = letter;
           System.out.println("The letter was added to the array");
           System.out.println("You have "+(i+1)+" letters in the array");
        }
        else
        {
           System.out.println("You already entered this letter Try again");
           i--;
        }
     }
   }
   //This function retrieves an array of characters and shows the array's contents.
   public static void print(char[] letters)
   {
      System.out.println("\nHere is the list of the distinct letters you entered:");
      System.out.print("{");
      for (int i=0;i<letters.length;i++)
      {
       if (i == letters.length-1)
       {
        System.out.print(letters[i]);
       }
       else
       {
        System.out.print(letters[i]+",");
       }
      }
      System.out.println("}");
   }
   //This method shows the program's description.
   public static void desc()
   {
    System.out.println("This program helps us to write a list of letters,\nit also avoids repetition of letters.");
   }
}