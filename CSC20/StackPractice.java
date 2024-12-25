import java.util.*;
public class StackPractice
{
 public static void main(String args[])
 {
  //creating a stack
  Stack<Integer> s = new Stack<Integer>();
  s.push(-1);
  s.push(4);
  s.push(44);
  s.push(-55);
  s.push(10);
  s.push(-45);
  s.push(10);
  System.out.println(s);
  System.out.println(maxValue(s));
  split(s);
  System.out.println(s);
  System.out.println(copy(s));
  System.out.println(s);
 }
 //write a method that return a copy of the stack
 public static Stack<Integer> copy(Stack<Integer> s)
 {
  ArrayList<Integer> list = new ArrayList<Integer>();
  Stack<Integer> a = new Stack<Integer>();
  while(!s.empty())
  {
   list.add(s.pop());
  }
  for (int i =0;i<list.size();i++)
  {
   s.push(list.get(list.size()-i-1));
   a.push(list.get(list.size()-i-1));
  }
  return a;
 } 
 //write a method to push all negative to top and al positives to last of the stack
 public static void split(Stack<Integer> s)
 {
  Stack<Integer> negative = new Stack<Integer>();
  Stack<Integer> positive = new Stack<Integer>();
  while(!s.empty())
  {
   int num =s.pop();
   if (num>0)
   {
    positive.push(num);
   }
   else
   {
    negative.push(num);
   }
  }
  while(!negative.empty())
  {
   s.push(negative.pop());
  }
  while(!positive.empty())
  {
   s.push(positive.pop());
  }
 }
 //write a method to find the max value
 public static int maxValue(Stack<Integer> s)
 {
  int max = Integer.MIN_VALUE;
  int temp;
  Stack<Integer> copy = new Stack<Integer>();
  while(!s.empty())
  {
   //pop
   temp = s.pop();
   copy.push(temp);
   if(temp>max)
    max = temp;
  }
  while(!copy.empty())
  {
   s.push(copy.pop());
  }
  System.out.println(s);
  return max;
 }
 
}