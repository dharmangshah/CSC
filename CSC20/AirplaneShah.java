/*
Name: Dharmang Shah
Description: This program is about managing the data of the passengers on an airplane
date: 03/03/2024
self-grade: 100%, as I have followed all the rubrics and given necessary comments.
Testimony: All the code is written by myself and I have not copied the code from any resources. Name: Dharmang Shah
*/

import java.util.*;
public class AirplaneShah 
{
}
//this class holds all the attributes of a person(the super class)
class Person 
{
 private String name;
 private String lastName;
 private String phone;
 //constructor method
 public Person(String name, String lastName, String phone)
 {
  this.name = name;
  this.lastName = lastName;
  this.phone = phone;
 }
 //it changes the first name of the passenger
 public void setFirst(String newName)
 {
  name = newName;
 }
 //it changes the last name of the passenger
 public void setLastName(String newLast)
 {
  lastName = newLast;
 }
 //it changes the phone number of the passenger
 public void setNewPhone(String newPhone)
 {
  phone = newPhone;
 }
 //it gets the first name of the passenger
 public String getName()
 {
  return name;
 }
 //it gets the last name of the passenger
 public String getLastName()
 {
  return lastName;
 }
 //it gets the phone number of the passenger
 public String getPhone()
 {
  return phone;
 }
 //it returns the passenger's details
 public String toString()
 {
  String s = "";
  s+= "\nName: "+name;
  s+= "\nLast Name: "+lastName;
  s+= "\nPhone: "+phone;
  return s;
 }
 //it checks the name of the passenger's and returns if it is true or false
 public boolean equals(Person other)
 {
  if(this.name==other.name && this.lastName == other.lastName)
  {
   return true;
  }
  else
  {
   return false;
  }
 }
}
//this class holds all the passenger's unique attributes
class Passenger extends Person
{
 private int seatNumber;
 private String classType;
 private String ticketId;
 //contructor method
 public Passenger(String name, String lastName, String phone, int seatNumber, String classType, String ticketId)
 {
  super(name,lastName,phone);
  this.seatNumber = seatNumber;
  this.classType = classType;
  this.ticketId = ticketId;
 }
 //it changes the seat number of the passenger
 public void setSeatNumber(int newSeatNumber)
 {
  seatNumber = newSeatNumber;
 }
 //it changes the class type of the passenger
 public void setClassType(String newClassType)
 {
  classType = newClassType;
 }
 //it changes the ticket number of the passenger
 public void setTicketId(String newTicketId)
 {
  ticketId = newTicketId;
 }
 //it gets the seat number of the passenger
 public int getSeatNumber()
 {
  return seatNumber;
 }
 //it gets the class type of the passenger
 public String getClassType()
 {
  return classType;
 }
 //it gets the ticket ID of the passenger
 public String getTicketId()
 {
  return ticketId;
 }
 //it returns the passenger's details
 public String toString()
 {
  String s =super.toString();
  s+="\nSeat Number: "+seatNumber;
  s+="\nClass Type: "+classType;
  s+="\nTicket ID: "+ticketId;
  return s;
 }
}
//it is the list interface
interface list 
{   
   public boolean add(Object o);
   public Object search(Object o);
   public boolean delete(Object o);
   public void printLast();
   public void takeOff();
}
//it holds the list of all the passengers and the details of the airplane
class Airplane implements list 
{
 public static int count = 0;
 private Passenger[] plane;
 private boolean takenOff;
 private int planeNum;
 //constructor
 public Airplane(int planeNum) 
 {
  this.planeNum = planeNum;
  plane = new Passenger[10];
 }
 //this method returns the number of passengers
 public int getCount()
 {
  return count;
 }
 //this method adds the passenger to the list
 public boolean add(Object o)
 {
  if(o instanceof Passenger)
  {
   if (!takenOff)
   {
    Passenger p1 = (Passenger)o;
    plane[count] = p1;
    count++;
    return true;
   }
  }
  return false;
 }
 //this method searches for the given passengers
 public Object search(Object o)
 {
  boolean b = o instanceof String;
  if(!b)
  {
   return null;
  }
  String name = (String)o;
  for(int i = 0; i < plane.length; i++)
  {
   if(plane[i]!= null && plane[i].getLastName().equalsIgnoreCase(name))
   { 
    return plane[i];
   }
  }
  return null;
 }
 //this method deletes the passenger
 public boolean delete(Object o) 
 {
  if (o instanceof String) 
  {
   String name = (String) o;
   for (int i = 0; i < plane.length; i++) 
   {
    if (plane[i] != null && plane[i].getLastName().equalsIgnoreCase(name)) 
    {
     plane[i] = null;
     count--;
     return true;
    }
   }
  }   
  return false;
 }
 //this method prints the last name of all the passengers
 public void printLast()
 {
  for (int i = 0; i < plane.length; i++)
  {
   if (plane[i] != null)
   {
    System.out.println((i + 1) + "." + plane[i].getLastName());
   }
  }
 }
 //this method shows if the airplane has taken off or not
 public void takeOff()
 {
  takenOff = true;
 }
 //this method prints all the details of all the passengers
 public String print()
 {
  String s ="";
  for (int i=0; i<plane.length; i++)
  {
   if (plane[i] != null)
   {
    s+= plane[i]+"\n";
   }
  }
  return s;
 }
}
//driver method
class Driver {
   public static void main(String[]args) {
      Scanner in = new Scanner(System.in);
   	
      Scanner kb = new Scanner(System.in);
      Airplane plane = new Airplane(817345);
      Passenger p1 = new Passenger("Bobbys", "Smith", "123456789", 1, "First class", "916-222-3333");
      Passenger p2 = new Passenger("Johnny", "Apples", "987654321", 8, "Business class", "818-000-1234");
      Passenger p3 = new Passenger("Tommy", "Jerrys", "567123489", 32, "Economy class","202-222-3333");
      Passenger p4 = new Passenger("Candy", "Cruze", "982134567", 15, "Premium Economy class","707-444-5555");
      
      //this passenger will be added after take off
      Passenger p5 = new Passenger("Kalotiii", "Aaronn", "762134589", 5, "Economy plus","817-222-6666");
      
      plane.add(p1);
      plane.add(p2);
      plane.add(p3);
      plane.add(p4);
      System.out.println("The palne is about to take off");
      plane.takeOff();
      System.out.println("adding a passenger after take off");
      plane.add(p5);
      String repeat = "";
      while(plane.getCount() > 0) 
      {
      
         System.out.println("Here is the list of the passengers in this plane");
         System.out.println("There are " + plane.getCount() + " Passengers on this plane"); 
         System.out.println(plane + "\n");
      
         System.out.println("Testing the printLast method to display the last names");
         plane.printLast();  
         System.out.println();
         
         System.out.println("Testing the static method getCount");
         System.out.println("This train has " + plane.getCount() + " Passengers\n");
         
         System.out.print("Enter the last name of the passenger to search for: ");
         String lastName = in.nextLine();
         System.out.println(plane.search(lastName));
         System.out.println();
         
         System.out.println("Testing the delete method");
         System.out.print("Enter the last name of the passenger to be deleted: ");
         String last = in.nextLine();
         plane.delete(last);
         System.out.println("Passenger " + last + " has been removed from the list\n");
         
         System.out.println("Here is the updated list");
         System.out.println(plane);
         System.out.println("*********************");
         System.out.print("Press any key to continue : ");
         repeat = kb.nextLine();
      }
      System.out.println("No passenger left on this airplane");
   	
   }
}
//driver created by me.
class yourDriver
{
 public static void main (String[] args)
 {
  Airplane united = new Airplane(123456);
  Scanner kb = new Scanner(System.in);
  Passenger p1 = new Passenger("Harnoor", "Kaur", "2469145", 1, "First class", "916-222-3333");
  Passenger p2 = new Passenger("Aarsh", "Ganatra","3718519", 2, "Economy class", "916-352-7868");
  Passenger p3 = new Passenger("Dev", "Gandhi", "1274521", 3, "Business class", "916-075-6432");
  Passenger p4 = new Passenger("Harsh", "Thakkar", "8546852", 4, "First class", "916-231-6859");
  Passenger p5 = new Passenger("Harry", "Singh", "2478453", 5, "Economy class", "916-897-6587");
  united.add(p1);
  united.add(p2);
  united.add(p3);
  united.add(p4);
  united.add(p5);
  System.out.println("The plane is about to take off");
  united.takeOff();
  System.out.println("The plane has taken off");
  System.out.println("\nHere is the list of the passengers in this plane");
  System.out.println("There are " + united.getCount() + " Passengers on this plane");
  System.out.println(united.print());
  System.out.println("\nHere is the list of the last name of the passengers in this plane");
  united.printLast();
  System.out.println();
  System.out.print("Enter the last name of the passenger to search for: ");
  String lastName = kb.nextLine();
  System.out.println(united.search(lastName));
  System.out.println();
  System.out.print("Enter the last name of the passenger to be deleted: ");
  String name = kb.nextLine();
  united.delete(name);
  System.out.println("Passenger " + name + " has been removed from the list\n");
  System.out.println("Here is the updated list");
  System.out.println(united.print());
 }
}