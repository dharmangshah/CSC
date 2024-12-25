import java.util.Scanner;
public class lesson6
{
 public static void main(String args[])
 {
  Scanner s = new Scanner(System.in);
  double areaC = areaCircle(s);
  System.out.println("The area is: "+areaC);
  //areaCircle(4.5);
  //areaRectangle(3.0,5.6);
  //double salary = salary(15.5,14);
  //System.out.println(salary);
  //double vol = volCylinder(3.5,10);
  //System.out.println(vol);
  //int sum = add3(112,335,342);
  //System.out.println(sum);
 }
 //method to calculate the area of circle with radius 3.9
 public static double areaCircle(Scanner s)
 {
  System.out.println("What is the radius of the circle?");
  double radius = s.nextDouble();
  double area = Math.PI*radius*radius;
  return area;
 }
 //method to calculate the area of a reactangle
 public static void areaRectangle(double length,double width)
 {
  double area = length*width;
  System.out.println("Area of the rectangle: "+area);
 }
 //method to calculate the salary of a person
 public static double salary(double rate, double hour)
 {
  double salary = rate*hour;
  //System.out.println("The salary is: "+salary);
  return salary;
 }
 //method to calculate the volume of cylinder
 public static double volCylinder(double radius, double height)
 {
  double vol = Math.PI*radius*radius*height;
  //System.out.println("The volume is: "+vol);
  return vol;
 }
 //method to add 3 numbers
 public static int add3(int num1,int num2, int num3)
 {
  int sum= num1+num2+num3;
  //System.out.println(sum);
  return sum;
 }
}