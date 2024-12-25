/*
Name: Dharmang shah
Description: This program helps us to write a list of letters, it also avoids repetition of letters.
date: 2 February,2024
Self-grade: 100%, as I have followed all the rubric and given appropriate comments.
Testimony: I have written the code by myself without any help from the unauthorized resources. Name- Dharmang shah
*/
import java.util.*;
public class LettersShah
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
   //This method looks through the array of letters to locate the letter the user entered as input. 
   //The function will return true if the letter is present in the array. 
   //It will return false if the letter is not present in the array.
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
   //This method checks the user's input.The user is asked to enter a single letter, either a-z or A-Z. 
   //Any input that is longer than one will be ignored. Any other input will be ignored and returned. 
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
   //Using this method, several unique letters are added to an array of the specified size.
   //This technique repeatedly requests that the user input the letters a–z or A–Z.
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
   //This method gets an array of chars and displays the content of the array .
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
   //This method displays the description of this program
   public static void desc()
   {
    System.out.println("This program helps us to write a list of letters,\nit also avoids repetition of letters.");
   }
}