public class dog
{
 private int id;
 private String sex;
 private String breed;
 private String name;
 private int age;
 //declare a variable to count thr number of dogs.
 private static int count=0;
 //constructor has the same name as the class name, no return type, 
 //the job of it is to initialize the instance variableby getting parameters
 public dog(int id,String sex,String name,String breed,int age)
 {
  this.id = id;
  this.sex=sex;
  this.name=name;
  this.breed=breed;
  this.age=age;
  count++;
 }
 //no argument constructor
 public dog()
 {
  count++;
 }
 //setter methods
 //allows the user to modify the instance variables
 public void setId(int newId)
 {
  id = newId;
 }
 public void setName(String newName)
 {
  name = newName;
 }
 public void setBreed(String newBreed)
 {
  breed = newBreed;
 }
 public void setSex(String newSex)
 {
  sex = newSex;
 }
 public void sexAge(int newAge)
 {
  age = newAge;
 }
 //toString method creates a stirng representing the attributes of a dog object
 public String toString()
 {
  String dog ="";
  dog += "Name: "+name;
  dog += "\nId: "+id;
  dog += "\nBreed: "+breed;
  dog += "\nSex: "+sex;
  dog += "\nAge: "+age;
  return dog;
 }
 //getter methods
 public int getId()
 {
  return id;
 }
 public String getName()
 {
  return name;
 }
 public String getSex()
 {
  return sex;
 }
 public String getBreed()
 {
  return breed;
 }
 public int getAge()
 {
  return age;
 }
 //equals method- compares 2 objects.
 public boolean equals(dog other)
 {
  return this.id==other.id;
 }
 public static void print()
 {
  System.out.println("Dog Class");
 }
 public static int getCount()
 {
  return count;
 }
}