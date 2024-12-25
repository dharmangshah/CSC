public class lesson7
{
 public static void main (String[] args)
 {
  String a = "Hello";
  //find the char at 4th index
  char s = a.charAt(4);
  System.out.println(s);
  //find length of string a
  int len = a.length();
  System.out.println(len);
  //find a method to convert a to uppercase
  String aUpper= a.toUpperCase();
  System.out.println(aUpper);
  String b = a.toLowerCase();
  System.out.println(b);
  //if string has h
  boolean h = a.contains("h");
  System.out.println(h);
  //find index of e
  int e = a.indexOf("e");
  System.out.println(e);
  String f = "I love java programming";
  String g = f.substring(7,11);
  System.out.println(g);
  String i = f.substring(7);
  System.out.println(i);
  int ab = Math.abs(-21);
  System.out.println(ab);
  double x = Math.pow(2,4);
  System.out.println(x);
  int y= Math.min(2,4);
  System.out.println(y);
  int z= Math.max(2,4);
  System.out.println(z);
  double w = Math.sqrt(12);
  System.out.println(w);
 }
}