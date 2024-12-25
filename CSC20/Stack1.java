//create a stack class using an arraylist data structure.
import java.util.*;
public class Stack1
{
 ArrayList<Integer> s;
 public Stack1()
 {
  s = new ArrayList<>();
 }
 //pop method
 public int pop()
 {
  return s.remove(s.size()-1);
 }
 //push method
 public void push(int num)
 {
  s.add(num);
 }
 //peek method
 public int peek()
 {
  return s.get(s.size()-1);
 }
 //isEmpty method
 public boolean isEmpty()
 {
  return s.size()==0;
 }
 //toString method
 public String toString()
 {
  return s.toString();
 }
}
class Driver
{
 public static void main(String args[])
 {
  Stack1 s = new Stack1();
  s.push(1);
  s.push(10);
  s.push(100);
  s.push(1000);
  s.push(10000);
  System.out.println(s);
  s.pop();
  System.out.println(s);
  while(!s.isEmpty())
  {
   System.out.println(s.pop());
  }
 } 
}