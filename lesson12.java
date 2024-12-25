import java.util.*;
public class lesson12
{
 public static void main(String[] args)
 {
  //declare an array of int.
  int[] nums = new int[4];
  //declare an array of double.
  double[] num = new double[10];
  //declare an array of boolean.
  boolean[] results = new boolean[10];
  //declare an array of char.
  nums[0] = 1;
  nums[1] = 2;
  nums[2] = 3;
  nums[3] = 4;
  char[] cha ={'a','b','c'};
  char[] letters = new char[26];
  for (int i =0; i<letters.length; i++)
  {
   letters[i] = (char)((int)('a') +i);
  }
  for (int i =0; i<letters.length; i++)
  {
   System.out.print(letters[i]+" ");
  }
  System.out.println();
  System.out.println(Arrays.toString(letters));
  System.out.println(letters);
  System.out.println(nums);
  System.out.println(cha);
  System.out.println(num);
  System.out.println(results);
  //declare an array to hold even number from0 to20 
  int[] even = new int[11];
  for (int i =0; i<even.length; i+=1)
  {
   even[i] = i*2;
  }
  System.out.println(Arrays.toString(even));
  System.out.println();
  System.out.println();
  System.out.println();
  int[] a = new int[10];
  fill(a);
  System.out.println();
  System.out.println();
  System.out.println();
  int[] c = new int[10];
  int[] d = new int[10];
  System.out.println(check(c,d));
  System.out.println();
  System.out.println();
  System.out.println();
  String[] st = {"hello","car","by","car","computer","car"};
  String target = "car";
  System.out.println(count(st,target));
 }
 public static void fill(int[] a)
 {
  Random rand = new Random();
  for (int i=0; i<a.length; i++)
   a[i] = rand.nextInt(101);
  System.out.println(Arrays.toString(a));
 }
 //write a method to compare the content of the 2 arrays.
 public static boolean check(int[] a, int[] b)
 {
  boolean cond = true;
  if (a.length == b.length)
  {
   int index = 0;
   do{
   if (a[index] ==b[index])
   {
    cond = true;
   }
   index++;
   }while (index<a.length && cond);
  }
  else
   cond =false;
  return cond;
 }
 //write a method that accepts an array of string and a target string 
 //this method counts the numbner of times the target strings appears in the array.
 public static int count(String[] a, String target)
 {
  int count =0;
  for (int i=0; i<a.length; i++)
  {
   if (a[i].equals(target))
    count++;
  }
  return count;
 }
 //
}