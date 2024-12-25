import java.util.*;
public class Week7
{
 public static void main(String[] args)
 {
  /*
  //declare an array of strings
  ArrayList<String> list = new ArrayList<>();
  //add an element
  list.add("rfdhdggda");
  list.add("b");
  //add at given index
  list.add(0,"z");
  //access to the element at index 1
  String s = list.get(1);
  System.out.println(s);
  //remove an element
  list.remove(1);
  //getting size of list
  int size = list.size();
  System.out.println(Longest(list));
  duplicate(list);
  display(list);
  //declare an raaylist of int
  ArrayList<Integer> list2 = new ArrayList<>();
  //add some values to the list
  list2.add(1);
  list2.add(64);
  list2.add(1438);
  //display the size of list
  System.out.println(list2.size());
  //display if list is empty or not;
  System.out.println(list2.isEmpty());
  //display the value of element at index 2
  System.out.println(list2.get(2));
  //add 100 at index1
  list2.add(1,100);
  //indecx of an lement;
  int index = list2.indexOf(100);
  System.out.println(index);
  */
  System.out.println("Hello".compareTo("Bye"));
 }
}
 /*
 //problem1
 public static String Longest(ArrayList<String> list)
 {
  String longest="";
  for (int i =0; i<list.size();i++)
  {
   if (longest.length()<list.get(i).length())
   {
    longest = list.get(i);
   }
  }
  return longest;
 }
 //problem 2
 public static void duplicate(ArrayList<String> list)
 {
  for (int i =0; i<list.size();i+=2)
  {
   list.add(i,list.get(i));
  }
 }
 //problem 3
 public static void display(ArrayList<String> list)
 {
  for(String s : list)
  {
   System.out.print(s);
  }
  System.out.println();
 }
 //problem4
 public static void compare(String s1, String s2)
 {
  if (s1.compareTo(s2)<0)
  {
   System.out.println(s1+" "+s2);
  }
  else
  {
   System.out.println(s2+" "+s1);
  }
 }
 //problem5
 public static void add(ArrayList<String> list,String a)
 { 
  for (int i = 0; i<list.size();i++)
  {
   if (a.compareTo(list.get(i)<0)
   {
    list.add(i,s);
    break;
   }
  }
 }
}*/