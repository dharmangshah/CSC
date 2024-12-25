import java.util.*;
public class lesson11
{
 public static void main(String[] args)
 {
  Scanner kb = new Scanner(System.in);
  //System.out.println("Please enter a number: ");
  //int num = kb.nextInt();
  System.out.println(getInput(kb));
  
 }
 //hasNextInt, hasNextDouble, hasNext, hasNextLine.
 //write a method to ask the user to entr an int between 1-10
 //must do data validation and range validation.
 public static int getInput(Scanner kb)
 {
  int num = 0;
  while (num<1 || num>10)
  {
   System.out.println("Enter a number between 1-10: ");
   while (!kb.hasNextInt())
   {
    kb.nextLine();
    System.out.println("Enter a number between 1-10: ");
   }
   num = kb.nextInt();
  }
  return num;
 }
}
class doWhile
{
 public static void main(String[] args)
 {
  Scanner kb = new Scanner(System.in);
  //System.out.println(getOdd(kb));
  dice();
 }
 //write a while loop to enter an even number.
 public static int getEven(Scanner kb)
 {
  int num =1;
  while (num%2 !=0)
  { 
   System.out.println("Please enter a even number: ");
   while (!kb.hasNextInt())
   {
    kb.nextLine();
    System.out.println("Please enter a even number: ");
   }
   num = kb.nextInt();
  }
  return num;
 }
 //write a while loop to enter a odd number.
 public static int getOdd(Scanner kb)
 {
  int num =0;
  do
  {
   System.out.println("enter a odd number: ");
   while (!kb.hasNextInt())
   {
    kb.nextLine();
    System.out.println("Please enter a odd number: ");
   }
   num = kb.nextInt();
  }while(num%2==0);
  return num;
 }
 //write a method tosimulate the action of rolling 2 die until the sum of the 2 is 12
 public static void dice()
 {
  Random rand = new Random();
  int sum,num1,num2; 
  do
  {
   num1 = rand.nextInt(6)+1;
   num2 = rand.nextInt(6)+1;
   sum = num1+num2;
   System.out.println(num1+" "+num2);
  }while (sum !=12);
 }
}
class shortCircuit
{
 public static void main(String[] args)
 {
  String s = "";
  if (s.length()>0 && s.charAt(0)=='a')
  {
   System.out.println(s);
  }
 }
}