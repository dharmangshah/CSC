/*
Name: Dharmang Shah
Description: This program is about changing expressions from infix to postfix.
date: 15/04/2024
self-grade: 100%, as I have followed all the rubrics and given necessary comments.
Testimony: All the code is written by myself and I have not copied the code from any resources. Name: Dharmang Shah
*/
import java.util.*;
import java.util.Stack;
import java.util.LinkedList;
public class ExpressionGanatra
{
}
class Expressions
{
 private String exp;
 public Expressions(String s)
 {
  exp = s;
 }
 public String getExp()
 {
  return exp;
 }
 //By using this technique, the exp is tokenized, and each token is kept in an ArrayList.
 public ArrayList<String> tokenize(String exp)  
 {
  ArrayList<String> token = new ArrayList<String>();
  String copy = exp;
  while(copy.length()>0)
  {
   int i =0;
   String s ="";
   if (copy.contains(" "))
   {
    i = copy.indexOf(' ');
    s = copy.substring(0,i);
    token.add(s);
    copy = copy.substring(i+1);
   }
   if(copy.charAt(0)=='?')
   {
    break;
   }
  }
  return token;
 }
 //this method switches from infix to postfix.
 public String getPostfix()
 {
  String postfix="";
  Stack s = new Stack();
  ArrayList<String> tokens = tokenize(this.exp);
  while(tokens.size()>0)
  {
   String token = tokens.get(0);
   String opr ="";
   tokens.remove(0);
   if ("+-/*".contains(token))
   {
    int prec = precedence(token);
    if (s.empty())
    {
     s.push(token);
    }
    else
    {
     if (prec == 2)
     {
      while (!s.empty())
      {
       opr = (String) s.pop();
       postfix+=opr+" ";
      }
     }
     else if (prec ==1)
     {
      while (!s.empty() && precedence((String) s.peek()) == 1)
      {
       opr = (String) s.pop();
       postfix+=opr+" ";
      }
     }
     s.push(token);
    }
   }
   else
   {
    postfix +=token+" ";
   }
  }
  while (!s.empty())
  {
   String o = (String) s.pop();
   postfix+=o+" ";
  }
  return postfix;
 }
 //this method returns the precedence of the operator
 private static int precedence(String opr)
 {
  String op1 = "*/";
  String op2 = "+-";
  if (op1.contains(opr))
  {
   return 1;
  }
  else if (op2.contains(opr))
  {
   return 2;
  }
  else
  {
   return 0;        
  }
 }
 //This method calculates the result.
 public int evalPostfix()
 {
  String opr = "*/+-";
  String post = this.getPostfix()+" ?";
  Stack<Integer> stack = new Stack<>();
  int ans = 0;
  ArrayList<String> tokens = tokenize(post);
  while (tokens.size()>0)
  {
   String s =tokens.get(0);
   tokens.remove(0);
   if (!opr.contains(s))
   {
    stack.push(Integer.parseInt(s));
   }
   else
   {
    if (s.equals("+"))
    {
     ans = stack.pop();
     ans += stack.pop();
     stack.push(ans);
    }
    else if (s.equals("-"))
    {
     ans = stack.pop();
     ans = stack.pop()-ans;
     stack.push(ans);
    }
    else if (s.equals("*"))
    {
     ans = stack.pop();
     ans *= stack.pop();
     stack.push(ans);
    }
    else if (s.equals("/"))
    {
     ans = stack.pop();
     ans = stack.pop()/ans;
     stack.push(ans);
    }
   }
  }
  return stack.pop();
 }
}
//driver class
class ExpDriver
{
 public static void main(String[] args)
 {
  LinkedList<String> list = new  LinkedList<String>();
  list.add("8 + 3 * 4 - 7 / 2 ?");
  list.add("5 * 3 - 2 + 9 / 3 ?");
  list.add("5 - 3 * 6 + 4 / 2 ?");
  list.add("6 + 2 * 7 - 9 / 3 ?");
  list.add("3 + 6 / 2 * 4 / 5 + 1 ?");
  Iterator<String> i = list.iterator();
  System.out.printf("%-40s%-40s%-40s","Infix","postfix","Result");
  System.out.println("\n**********************************************************");
  while(i.hasNext())
  {
   String infix = i.next();
   Expressions e = new Expressions(infix);
   String postfix = e.getPostfix();
   int result = e.evalPostfix();
   System.out.printf("%-40s%-40s%-40d",infix,postfix,result);
   System.out.println();
  }
 }
}
class Driver
{
   public static void main(String[] args)
   {
      LinkedList<String> list = new  LinkedList<String>();
      list.add("2 + 3 + 7 * 4 - 2 / 3 ?");
      list.add("3 - 4 / 2 + 6 * 3 ?");
      list.add("5 * 6 - 8 + 2 * 10 ?");
      list.add("4 + 8 * 3 - 2 / 34 ?");
      list.add("6 - 3 + 6 / 2 * 4 - 8 ?");
      list.add("2 + 3 * 6 ?");
      list.add("2 * 3 + 4 / 3 * 2 ?");
      list.add("2 * 3 + 1 - 3 * 4 ?");
      list.add("1 + 2 * 3 - 6 * 7 + 2 * 3 ?");
      list.add("5 * 6 - 8 + 2 * 10 ?");
      list.add("6 - 3 + 6 / 2 * 4 - 8 ?");
      list.add("11 + 12 * 21 - 22 ?");
      Iterator<String> itr= list.iterator(); 
      System.out.printf("%-40s%-40s%-40s", "Infix", "postfix","Result"); 
      System.out.println("\n_____________________________________________________________________________________");
      System.out.println(); 
      while (itr.hasNext())
      {
         String infix  = itr.next();
         Expressions e = new Expressions(infix);
         String post = e.getPostfix();
         int result = e.evalPostfix();
         System.out.printf("%-40s%-40s%-40d", infix,   post , result);
         System.out.println();
      }
   }
}