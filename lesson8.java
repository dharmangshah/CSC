public class lesson8
{
 public static void main (String[] args)
 {
  even(3);
  even(6);
  roller(101,5.7);
  grade(95.89);
  System.out.println(quadrant(4,5)+" Quadrant");
  month(5);
 }
 // write a method that gets an int as its parameter and then displays even if he numbrr is even.
 public static void even(int a)
 {
  if (a%2 ==0)
  {
   System.out.println("EVEN");
  }
  else
  System.out.println("ODD");
 }
 // write a method that accepts the height and the weight of a person if w>100 && h>5.5
 public static void roller(double w, double h)
 {
  if (w>100.0 && h>5.5)
  {
   System.out.println("You can ride the roller coaster");
  }
 }
 //write a method to convert percent grade to letter grade
 public static void grade(double percent)
 {
  if (percent>=90 && percent<=100)
   System.out.println("Your grade is A");
  else if (percent>= 80 && percent<90)
   System.out.println("Your grade is B");
  else if (percent>= 70 && percent<80)
   System.out.println("Your grade is C");
  else if (percent>= 60 && percent<70)
   System.out.println("Your grade is D");
  else
   System.out.println("Your grade is F");
 }
 //write method to return quadrant from a cartesian point
 public static int quadrant(double x, double y)
 {
  if (x>0 && y>0)
   return 1;
  else if (x<0 && y>0)
   return 2;
  else if (x<0 && y<0)
   return 3;
  else if (x>0 && y<0)
   return 4;
  else
   return 0;
 }
 //write  method that accepts a number for a month and returns the name of the month
 public static void month(int num)
 {
  switch (num)
  {
   case 1: System.out.println("Jan"); break;
   case 2: System.out.println("Feb"); break;
   case 3: System.out.println("Mar"); break;
   case 4: System.out.println("Apr"); break;
   case 5: System.out.println("May"); break;
   case 6: System.out.println("Jun"); break;
   case 7: System.out.println("Jul"); break;
   case 8: System.out.println("Aug"); break;
   case 9: System.out.println("Sep"); break;
   case 10: System.out.println("Oct"); break;
   case 11: System.out.println("Nov"); break;
   case 12: System.out.println("Dec"); break;
   default: System.out.println("Unknown"); break;
  }
 }
}