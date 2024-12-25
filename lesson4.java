public class lesson4
{
 public static void main(String[] args)
 {
  things();
  getArea();
  bodyMass();
  tempConverter();
  
 }
 public static void things()
 {
  //declare a variable to store your age.
  int age = 18;
  //declare a variable to hold your gpa.
  double gpa = 3.9;
  //declare a variable to check if you are hungry or not.
  boolean hungry = true;
  //declare a variable to hold your initial.
  char initial = 'D';
  //declare a variable to hold your name.
  String name = "Dharmang";
  //output: Hello Dharmang
  System.out.println("Hello "+name);
  //output: My GPA is: 3.9
  System.out.println("My GPA is: "+gpa);
  System.out.println("Is "+name+" hungry? "+hungry);
  System.out.println("My initial is "+initial);
  int a=12,b=13,c=13,money;
 }
 //method to get area of a circle
 public static void getArea()
 {
  //declare
  double radius=7.0, pi = 3.14, area;
  //calculation
  area = pi *radius*radius;
  //display
  System.out.println("The area of circle with radius "+radius+" is "+area);
 }
 //method to calculate the body mass index
 public static void bodyMass()
 {
  //declare
  double weight = 60.5, height=1.72, bodyMassIndex;//weight in Kg, height in cm
  //caluclation
  bodyMassIndex = weight/(height*height);
  //display
  System.out.println("The body mass index of a person with weight of "+weight+"Kg, height of "+height+"m is "+bodyMassIndex);
 }
 //method to convert temperature from farenheit to celcius
 public static void tempConverter()
 {
  //declare
  double tempFarenheit= 98.6, tempCelcius;
  //caluclation
  tempCelcius = (tempFarenheit-32) * 5/9;
  //display
  System.out.println(tempFarenheit+"F in celius is "+tempCelcius+"C.");
 }
}