public class lesson5
{
 public static final double FEET_TO_METRE = 0.3048;
 public static final double FAR_TO_CEL = 5.0/9;
 public static final double POUND_TO_KILO = 0.454;
 public static void main(String[] args)
 {
  int i =4;
  i ++;
  //System.out.println(i);
  boolean b = 3==5;
  i += 3;
  //System.out.println(i);
  //even();
  //odd();
  //tempConverter();
  //lengthConverter();
  //poundToKilo();
 }
 
 //Method to give even numbers from 100 to 200.
 public static void even()
 {
  for (int c=100;c<=200;c+=2)
  System.out.print(c+" ");
  System.out.println();
 }
 
 //Method to give odd numbers from 500 to 1000.
 public static void odd()
 {
  for (int j=999;j>=500;j-=2)
  System.out.print(j + " ");
  System.out.println();
 }
 //Method to display temperature in celcius from farenhiet from 104 to 96
 public static void tempConverter()
 {
  System.out.println("Farenheit|Celcius");
  double c;
  for (int f=104;f>=96;f-=2)
  {
   c = (f-32)*FAR_TO_CEL;
   System.out.println(f +"\t |"+ (int) c);
  }
 }
 //Method to convert feet to metres from 100 to 1 dec by 5
 public static void lengthConverter()
 {
  double metre;
  System.out.println("Feet\t |Metre");
  for (double feet=100.0;feet>=1;feet-=5)
  {
   metre = feet*FEET_TO_METRE;
   System.out.println(feet+"\t |"+(int) metre);
  }
  System.out.println("1.0\t |0");
 }
 //method to convert pound to kilo from 100 to 1 dec by 3
 public static void poundToKilo()
 {
  System.out.println("Pound\t|Kilo");
  double kilo;
  for (int pound =100; pound>=1;pound-=3)
  {
   kilo = pound * POUND_TO_KILO;
   System.out.println(pound+"\t|"+kilo);
  }
 }
 
}