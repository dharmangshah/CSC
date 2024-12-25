public class Person
{
 private String name;
 public Person(String name)
 {
  this.name = name;
 }
 public String toString()
 {
  return name;
 }
}
class Student extends Person
{
 private int id;
 public Student(int id, String name)
 {
  super(name);
  this.id = id;
 }
 public String toString()
 {
  return super.toString()+" "+id;
 }
}
interface List
{
 public void add();
 public void remove();
 public void print();
}
class Course implements List
{
 //has a relationship
 //course has a list of studnts
 private Student[] list;
 private int num;
 private static int index= 0;
 public Course(int num)
 { 
  list = new Student[3];
  this.num = num;
 }
 public void add(int id, String name)
 {
  if (index==list.length)
  {
   System.out.println("Class is full");
  }
  if (index<list.length)
  {
   list[index] = new Student(id,name);
   index++;
  }
 }
 public void remove(int id)
 {
  System.out.println("");
 }
 public void print()
 {
  for (int i =0;i<list.length;i++)
  {
   System.out.println(list[i]);
  }
 }
}
class driver
{
 public static void main(String[] args)
 {
  Course c= new Course(45678);
  c.add(123,"Jose");
  c.add(789,"Mary");
  c.remove(789);
  c.print();
  
 }
}