public class lesson9
{
 public static void main(String[] args)
 {
  /*
  sum100();
  int a ='b';
  System.out.println(a);
  char letter='d';
  int encode=letter+5;
  char encoded= (char) encode;
  System.out.println(encoded);
  encoder("zzz",5);
  toUpper("hello");
  double -- %f
  int -- %d
  string -- %s
  char -- %c
  */
  
 }
 //this method calculates sum of all number from 1 to 100
 public static void sum100()
 {
  int sum =0;
  int i;
  String s="0";
  for (i=1;i<=100;i++)
  {
   sum+= i;
   s+= " + "+i;
  }
  System.out.println(s+" = "+sum);
 }
 //method exxepts string and key and returns encoded string
 public static void encoder(String s, int k)
 {
  int l = s.length();
  s = s.toLowerCase();
  String s1= "";
  for(int i =0; i<=(l-1);i++)
  {
   char let = s.charAt(i);
   char let1 =(char) (let+k);
   if (let1>'z')
    let1 = (char)(let1-26);
   s1+=let1;
  }
  System.out.println(s1);
 }
 //convert all letters of  a string to uppercase
 public static void toUpper(String s)
 {
  int l = s.length();
  s = s.toLowerCase();
  String s1= "";
  for(int i =0; i<=(l-1);i++)
  {
   char let = s.charAt(i);
   if (let>='a'&& let<='z')
   {
    let =(char) (let-32);
   }
   s1+=let;
  }
  System.out.println(s1);
 }
 
}