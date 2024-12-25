import java.util.*;
public class week1
{
 public static void main(String[]args)
 {
  /*
  Scanner kb = new Scanner(System.in);
  int size;
  System.out.println("Please enter an integer for the size of arrays: ");
  size = kb.nextInt();
  int[] arr = new int[size];
  fill(arr,kb);
  display(arr);
  datavalidation(kb);
  */
  
 }
 public static void secret(Stack<Integer> s)
{
      
     Stack<Integer> temp = new Stack<Integer>();
     while(!s.isEmpty())
     {
        int m = s.pop();
        if(m % 2 != 0)
        {
          for(int i = 0; i <= m/2; i++)
             temp.push(m);
           
        }
        else
        {
          temp.push(m);
        }
     }
     while(!temp.isEmpty())
     {
       s.push(temp.pop());
     }
      
   }
}
/*
 public static void fill(int[] num, Scanner kb)
 {
  int i;
  for(i=0;i < num.length;i++)
  {
   System.out.println("Enter a number: ");
   num[i] = kb.nextInt();
  }
  System.out.println(Arrays.toString(num));
 }
 public static void display(int[] num)
 {
  int i;
  for(i=0;i < num.length;i++)
  {
   System.out.print(num[i]);
   if (i!=(num.length-1))
    System.out.print(", ");
  }
 }
 public static void datavalidation(Scanner kb)
 {
  int num;
  System.out.println("Enter an integer");
  while (!kb.hasNextInt())
  {
   kb.nextLine();
   System.out.println("Enter an integer");
  }
  num = kb.nextInt();
 }
}*/