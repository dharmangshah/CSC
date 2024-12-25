/*
Name: Aarsh Ganatra
Description: This program is about making programs recursively.
date: 5/4/2024
self-grade: 100%, as the program compiles and have written comments.
Testimony: All the code is written by myself and I have not copied the code from any resources. Name: Aarsh Ganatra
*/
import java.util.*;
import java.lang.*;
public class RecursiveGanatra
{
}
class YourDriver {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        for (char i = 'a'; i < 'f'; i++) {
            list.add(String.valueOf(i).toUpperCase());
        }
        System.out.print(list + " is palindrome?  ");
        System.out.println(Recursive.palindrome(list));
        System.out.println("#######################################################");

        LinkedList list2 = new LinkedList();
  for(char i = 'a'; i <= 'f'; i++)
  {
   list2.add(((String)(i + "")));
  }
  for(char i = 'f'; i >= 'a'; i--)
  {
   list2.add(((String)(i + "")));
  }    
  System.out.print(list2 + " is palindrome?  ");
  System.out.println(Recursive.palindrome(list2));
        System.out.println("#######################################################");

        System.out.println("\nTesting ASCII method");
        String s = "Hello, World!";
        System.out.println("The list of the ASCII code in the string \"" + s + "\" is \n" + Recursive.asccii(s)); // Changed string
        System.out.println("#######################################################");

        LinkedList<String> myList = new LinkedList<>();
        myList.add("Books");
        myList.add("Psychology");
        myList.add("Construction");
        myList.add("Amazon");
        System.out.println("\nTesting longest string in the list of strings " + myList.toString());
        System.out.println("The longest string in the list " + myList.toString() + " is " + Recursive.longest(myList, ""));
        System.out.println("#######################################################");

        LinkedList<String> m1 = new LinkedList<>();
        for (char i = 'd'; i <= 'm'; i++) {
            m1.add(String.valueOf(i));
        }
        LinkedList<String> m2 = new LinkedList<>();
        for (char i = 'm'; i >= 'd'; i--) {
            m2.add(String.valueOf(i));
        }
        System.out.println(m1);
        System.out.println(m2);
        System.out.println("Are the two lists equal in reverse order: " + Recursive.equalsReverse(m1, m2));
        System.out.println("#######################################################");

        for (char i = 'd'; i <= 'm'; i++) {
            m1.add(String.valueOf(i));
        }
        for (char i = 'm'; i >= 'd'; i--) {
            m2.add(String.valueOf(i));
        }
        m1.add("Z");
        System.out.println(m1);
        System.out.println(m2);
        System.out.println("Are the two lists equal in reverse order: " + Recursive.equalsReverse(m1, m2));
        System.out.println("#######################################################");

        System.out.println("\nTesting the average of the integers in a linked list");
        LinkedList<Integer> list3 = new LinkedList<>();
        Random rand = new Random();
        for (int i = 1; i <= 5; i++)
            list3.add(rand.nextInt(50) + 1);
        int sum = 0;
        System.out.println(list3);
        System.out.print("The average is: ");
        System.out.println(Recursive.findAvg(list3, sum, list3.size()));
        System.out.println("#######################################################");

        LinkedList<Integer> fibList = new LinkedList<>();
        System.out.println("The list of the first 13 Fibonacci numbers: ");
        Recursive.fib(fibList, 15);
        System.out.println(fibList);
        System.out.println("#######################################################");

        LinkedList<Integer> reverse = new LinkedList<>();
        System.out.println(fibList);
        Recursive.listReversed(fibList, reverse);
        System.out.println("The reversed list is: ");
        System.out.println(reverse);
        System.out.println("#######################################################");
    }
}

class Driver
{
   public static void main(String [] args)
   {
     
     ///********************************************************
      LinkedList   list = new LinkedList();
      //filling the link list with some letters
      for(char i = 'a'; i < 'm'; i++)
      {
         list.add(((String)(i + "")));
      }   
      //testing the palindrom method    
      System.out.print(list + " is palindrome?  ");
      System.out.println(Recursive.palindrome(list));
      System.out.println("\n***********************************************\n");
      
      //***********************************************************************
      //creating a palindorm list to check the palindrom method
      LinkedList list2 = new LinkedList();
      for(char i = 'a'; i <= 'm'; i++)
      {
         list2.add(((String)(i + "")));
      }
      for(char i = 'm'; i >= 'a'; i--)
      {
         list2.add(((String)(i + "")));
      }    
      System.out.print(list2 + " is palindrome?  ");
      System.out.println(Recursive.palindrome(list2));
      System.out.println("\n**************************************************\n");
      
      //*******************************************************************************
      
      //testing the asccii method      
      System.out.println("\ntesting ascci metod");
      String s ="What goes around comes around"; 
      System.out.println("The list of the asccii code in the string " + s  + " is \n"+ Recursive.asccii(s));
      System.out.println("\n*****************************************************\n");
      
      //*********************************************************************************
      
      //testing the longest method to find the longest word in the list
      //filling in the array list
      LinkedList myList = new LinkedList();
      myList.add("Computers");
      myList.add("Philosophy");
      myList.add("building materials");
      myList.add("Costco warehouse");
      System.out.println("\ntesting longest string in the list of string" + myList.toString());
       
      System.out.println("The longest string is the list " + myList.toString() + 
         " is " + Recursive.longest(myList,""));
      System.out.println("\n*******************************************************\n");   
      //*********************************************************   
        //testing the equlas method to see if two list are equals in the reverse order 
         
       LinkedList m1 = new LinkedList();
       for(char i = 'a'; i <= 'm'; i++)
      {
         m1.add(((String)(i + "")));
      } 
      LinkedList m2 = new LinkedList();
      for(char i = 'm'; i >= 'a'; i--)
      {
         m2.add(((String)(i + "")));
      } 
      System.out.println(m1);
      System.out.println(m2);  
      System.out.println("Are the two list equalin the reverse order: " + Recursive.equalsReverse(m1,m2)); 
      for(char i = 'a'; i <= 'm'; i++)
      {
         m1.add(((String)(i + "")));
      } 
      for(char i = 'm'; i >= 'a'; i--)
      {
         m2.add(((String)(i + "")));
      } 


      m1.add("z");
      System.out.println(m1);
      System.out.println(m2);
      System.out.println("Are the two list equal in the reverse order: " + Recursive.equalsReverse(m1,m2));
      System.out.println("\n*********************************************************\n");
      
      //********************************************************************************
           
      //testing the average method    
             
      System.out.println("\ntesting the avg of the integers in a link list");
      LinkedList list3 = new LinkedList();
      Random rand = new Random();
      for(int i = 1; i <= 5; i++)
         list3.add((Integer)(rand.nextInt(20) + 1));
      int sum = 0;
      System.out.println(list3);
      System.out.print("The average is: " );
      System.out.println(Recursive.findAvg(list3,sum,list3.size()));
      System.out.println("**********************************");
            //*******************************************************
      //Calling the fib method
      LinkedList fibList = new LinkedList();
      System.out.println("The list of the first 12 fibinaci numbers: ");
      Recursive.fib(fibList,12);
      System.out.println(fibList);
      System.out.println("***************************");
      
      //***********************************
      //Testin the reverse method
      LinkedList reverse = new LinkedList();
      System.out.println(fibList);
      Recursive.listReversed(fibList,reverse);
             System.out.println("The reverse list is: ");
      System.out.println(reverse);
      System.out.println("\n************************************************************\n");
      
   
   }
} //end of main method
/*
In this program you must use the following methods from the LinkedList class
getFirst
removeFirst
getLast
removeLast
size
get(index)
No loop can be used with any of the methods. methods with loop will get zero points.
*/
class Recursive {
  /*This function takes a linked list of integer values and generates a new list in reverse order.
  It should be implemented recursively.*/
  public static void listReversed(LinkedList list, LinkedList reversed) {
    if (list.size() == 0) {
      return;
    }
    reversed.add(list.removeLast());
    listReversed(list, reversed);
  }

  public static void fib(LinkedList list, int max) {
    if (max == 0) {
      return;
    }
    if (list.size() == 0) {
      list.add(1);
      list.add(1);
    }
    int sum = (int) list.getLast() + (int) list.get(list.size() - 2);
    list.add(sum);
    max--;
    fib(list, max);
  }

  /*This function prints the content of a linked list in reverse order recursively.*/
  public static void printReverse(LinkedList list) {
    if (list.size() == 0)
      return;
    System.out.println(list.getLast());
    list.removeLast();
    printReverse(list);
  }

  /*This method checks if a list is a palindrome.
  It must be implemented recursively.
  It should use LinkedList objects without using any loops.*/
  public static boolean palindrome(LinkedList list) {
    if (list.size() == 1 || list.size() == 2)
      return true;
    String first = (String) list.getFirst();
    String last = (String) list.getLast();
    boolean b = first.equals(last);
    list.removeFirst();
    list.removeLast();
    return b && palindrome(list);
  }

  /*This function takes a string and returns the sequence of ASCII codes in the string.
  For example, if the string is "abcdef", the return value would be "97 98 99 100 101 102".*/
  public static String asccii(String s) {
    if (s.length() == 0)
      return "";
    int code = s.charAt(0);
    s = s.substring(1);
    return code + " " + asccii(s);
  }

  /*This method finds the longest string in a list.
  It must be implemented recursively without using loops.*/
  public static String longest(LinkedList list, String longest) {
    if (list.size() == 0)
      return longest;
    String s = (String) list.getFirst();
    if (s.length() > longest.length()) {
      longest = s;
      list.removeFirst();
    } else {
      list.removeFirst();
    }
    return longest(list, longest);
  }

  /*This function compares two linked lists to check if they contain the same values in reverse order.
  For example, if list1 is 1 2 3 4 5 and list2 is 5 4 3 2 1, it returns true; otherwise, it returns false.*/
  public static Boolean equalsReverse(LinkedList list1, LinkedList list2) {
    if (list1.size() != list2.size())
      return false;
    if (list1.size() == 0)
      return true;
    String s1 = (String) list1.getFirst();
    String s2 = (String) list2.getLast();
    if (!s1.equals(s2))
      return false;
    list1.removeFirst();
    list2.removeLast();
    return true && equalsReverse(list1, list2);
  }

  /*This function calculates the average of the integers in a list recursively.*/
  public static int findAvg(LinkedList list, int sum, int size) {
    if (list.size() == 0)
      return sum / size;
    sum += (int) list.getFirst();
    list.removeFirst();
    return findAvg(list, sum, size);
  }
}