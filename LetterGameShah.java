 /*
 Name:Dharmang shah
 Description: this is a letter guessing game.
 Date: 1 November, 2023
 self-grade: 100% as I have followed all the rubrics and metioned comments wherever necessary.
 Testimony: The submitted program is written by me and I have not received any help from unauthorzied resources. 
 Dharmang shah
 */
import java.util.*;
public class LetterGameShah
{
}

class letterGame
{
 public static void main(String[] args)
 {
  Scanner console = new Scanner(System.in);   
  introduction(); 
  System.out.println(); 
  funGame(console);
 }
 
 //This method provides the introduction of the game.
 public static void introduction()
 {
  System.out.println("Welcome to the letter guessing game");
  System.out.println("In this game, the computer will generate a rondom letter and you need to guess it.");
  System.out.println("You can play this game with your friends and see who can guess the letter the fastest.");
  System.out.println("Please enter all answers in Capitals");
 }
 
 //This method allows the user to play the games multiple times.
 public static void funGame(Scanner console)
 {
  int numGames =0, totGuesses=0, max =0;
  String again = "YES";
  while (again.equalsIgnoreCase("yes"))
  {
   int guesses = playGame(console);
   if (guesses>max)
   {
    max = guesses;
   }
   totGuesses = totGuesses + guesses;
   numGames++;
   again = playAgain(console);
   System.out.println();
  }
  summary(numGames,totGuesses,max);
 }
 
 //This method asks the user if they want to play it again or no.
 public static String playAgain(Scanner console)
 {
  System.out.print("Do you want to play again(YES/NO)? ");
  String choice = console.next();
  boolean condition = choice.equalsIgnoreCase("YES") || choice.equalsIgnoreCase("NO");
  while (!condition)
  {
   System.out.print("Do you want to play again(YES/NO)? ");
   choice = console.next();
   condition = choice.equalsIgnoreCase("YES") || choice.equalsIgnoreCase("NO");
  }
  return choice;
 }
 
 //This method plays the game.
 public static int playGame(Scanner console)
 {
  Random r = new Random();
  int min = 'A', max = 'Z';
  int num = r.nextInt(max+1-min) + min;
  char pick = (char) num;
  char guess =' ';
  int numGuesses = 0;
  boolean done = false;
  System.out.println("I am randomly picking a letter between A and Z and you need to guess it.");
  while (!done)
  {
   numGuesses++;
   guess = userRespond(console);
   if (guess == pick)
   {
    done = true;
    System.out.println("You got it");
   }
   else if (guess>pick)
   {
    System.out.println("Lower");
   }
   else
   {
    System.out.println("Higher");
   }
  }
  System.out.println("You got it right in " + numGuesses + " guesses");
  System.out.println();
  return numGuesses;
 }
 
 //This method asks the user guess.
 public static char userRespond(Scanner console)
 {
  System.out.print("Guess a letter between A-Z:  ");
  String input = console.next();
  char guess = input.charAt(0);
  while (guess>'Z' || guess<'A')
  {
   System.out.print("Guess a letter between A-Z:  ");
   input = console.next();
   guess = input.charAt(0);
  }
  return guess;
 }
 
 //This method provides the summary of all the games played.
 public static void summary(int gamesPlayed, int guesses,int max) 
 {
  System.out.println("Overall results:");
  System.out.println("    Games Played   = " + gamesPlayed);
  System.out.println("    total guesses  = " + guesses);
  double average = (double) guesses / gamesPlayed;
  System.out.printf("    guesses/game   = %.2f\n" , average);
  System.out.println("    max guesses    = " + max);
 }
}