public class dogdriver
{
 public static void main(String args[])
 {
  dog.print();
  //declare and instantiate an object of type dog
  //dog(int id,String sex,String name,String breed,int age)
  dog c = new dog(55007431,"Male","Remy","Chihuahua",12);
  c.print();
  dog d = new dog(55007432,"Female","Felix","Pomerian",10);
  dog e = new dog();
  dog f = new dog(55007431,"Male","Remy","Chihuahua",12);
  //modify c
  c.setName("Mia");
  System.out.println(c);//implicitely calling toString()
  //print just the name of c
  System.out.println(c.getName());
  if (c.equals(f))
  {
   System.out.println("Same");
  }
  else
  {
   System.out.println("Not same");
  }
  System.out.println(dog.getCount());
 }
}