import java.util.Scanner;//1
public class interaction
{
 public static void main(String args[])
 {  //2 create a pointer to the scanner class
  Scanner s = new Scanner(System.in);
  /*
  for (int i =1;i<=3;i++)
  {
   System.out.println("How many hours did you work?");
   double hours = s.nextDouble();
   System.out.println("What is the  hourly rate?");
   double rate = s.nextDouble();
   double salary = salary(rate,hours);
   System.out.println("Your salary is: "+salary);
  }
  
  System.out.println("What is your name?");
  String name = s.nextLine();
  System.out.println("How many units?");
  int units = s.nextInt();
  */
  int age = getAge(s);
 }
 //method to calculate the salary of a person
 public static double salary(double rate, double hour)
 {
  double salary = rate*hour;
  return salary;
 }
 public static int getAge(Scanner s)
 {
  System.out.println("What is your age?");
  int age = s.nextInt();
  return age;
 }
}