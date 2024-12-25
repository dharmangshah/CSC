/*
Name: Dev Gandhi
Description : This program allows users to manage different houses it allows users to add, remove, and search fior houses based on various criteria. 
Date: 03/25/2024
Self grade: 100. Since all the requirements are met
testimony: I have written the code by myself and did not use unauthorized resourse. 
I am aware that If the instructor finds that the submitted code is from previos semester, I will get zero points for it.Name Dev Gandhi
*/

import java.util.Scanner;
public class ZillowGandhi{
   //no code
}

class House implements Comparable<Object>{
 
 //instance varibales
 private int rooms;
 private int baths;
 private double area;
 private String address;
 private double price;
 public String zipcode;
 
 //constructor House
 public House(int rooms, int baths,double area,String address,double price, String zipcode){
  this.rooms = rooms;
  this.baths = baths;
  this.area = area;
  this.address = address;
  this.price = price;
  this.zipcode = zipcode;
 }
 public House(){
 }
 
 //getter methods	
 //gets price 
 public double getPrice(){
  return price;
 }
 //gets area 
 public double getArea(){
  return area;
 }
 //gets no of rooms
 public int getRooms() {
  return rooms;
 }
 //gets no of baths
 public double getBaths(){
  return baths;
 }
 //gets address
 public String getAddress(){
  return address;
 }
 //gets zip code
 public String getZipcode(){
  return zipcode;
 }
 
 //setter methods
 
 //sets no ofrooms 
 public void setRooms(int rooms){
  this.rooms = rooms;
 }
 //sets no of baths
 public void setBaths(int baths){
  this.baths = baths;
 }
 //sets area 
 public void setArea(double area){
  this.area = area;
 }
 //sets price 
 public void setPrice(double price){
  this.price = price;
 }
 
 /*equals method : return true if the two houses have the same address,
    returns false otherwise*/   	
 public boolean equals(House o) {
  if(this.address.equalsIgnoreCase(o.address)){
   return true;
  }
  else{
   return false;
  }
 }
 
 /*
 compareTo method compares the prices of the two houses. This method can be used to list
 the houses based on the proce from low to high
 */
 public int compareTo(Object o){
  if (o instanceof House){
   House h = (House)o;
   if (this.price>h.price){
    return (int)this.price;
   }
   else{
    return (int)h.price;
   }
  }
  else{
   return 0;
  }
 }
 
 /*represents a house information in a specific format. refer to the sample output*/
 // toString method to convert data into string
 public String toString(){
  String s ="";
  s+="\nroom: "+rooms;
  s+="\nbath: "+baths;
  s+="\narea: "+area;
  s+="\naddress: "+address;
  s+="\nprice: "+price;
  s+="\nzipcode: "+zipcode;
  return s;
 }
}

class ListNode{
 private House house;
 private ListNode next;
 public ListNode(House house){
  this.house = house;
 }
 
 //constructor
 public ListNode(House h, ListNode next){
  this.house = h;
  this.next = next;
 }
 public ListNode(){
 }
  //gets house
 public House getHouse(){
  return house;
 }
  //gets next node in linked list
 public ListNode getNext(){
  return next;
 }
 
 //setws next node in linked list
 public void setNext(ListNode next){
  this.next = next;
 }
}
interface List{
 public void add(int rooms, int baths, double price, double area, String address,String zipcode); //listing a house, adds a house to the list
 public void add(int rooms, int baths, double price, double area, String address, String zipcode, int index);//adding  a house to the list at the given index
 public void remove(String address);//removing a house from the list with the given address
 public int size();//returns the number of the houses in the list
 public String toString();//returns  list all the houses
 public String search(int room); //returns the list all the houses with the given number of the rooms 
 public String search(int room, int bath); //returns the  list all the houses with the given number of the rooms and baths 
 public String search(String zipcode);// returns all the houses with the given zipcode
}

//Zillow class
class Zillow implements List{
 private ListNode head;
 public static int size = 0;
 public Zillow() {
  head = null;
 }
 
 //constructor
 public Zillow(House house){
  head = new ListNode(house);
  size++;
 }
 /*adds a house to the end of the end of the listlist */
 //public House(int rooms, int baths,double area,String address,double price, String zipcode)
 public void add(int rooms, int baths, double price, double area, String address,String zipcode){
  House h = new House(rooms, baths,area, address, price, zipcode);
  ListNode newNode = new ListNode(h);
  if (head==null){
   head = newNode;
  }
  else{
   ListNode current = head;
   while (current.getNext() != null) {
    current = current.getNext();
   }
   current.setNext(newNode);
  }
  size++;
 }
 
 /*add a house to the list at the given index*/
 public void add(int rooms, int baths, double price, double area, String address, String zipcode, int index){
  if (index < 0 || index > size) {
   System.out.println("Invalid Index");
  }
  if (index==0){
   House h = new House(rooms, baths,area, address, price, zipcode);
   ListNode newNode = new ListNode(h);
   newNode.setNext(head);
   head = newNode;
  }
  else{
   House h = new House(rooms, baths, area, address, price, zipcode);
   ListNode newNode = new ListNode();
   ListNode current = head;
   for (int i =0; i<index-1;i++){
    current = current.getNext();
   }
   newNode.setNext(current.getNext());
   current.setNext(newNode);
  }
  size++;
 }
 
 /*removes a house from the list with the given address*/
 public void remove(String address){
  if (head.getHouse().getAddress().equals(address)){
   head = head.getNext();
   size--;
  }
  ListNode current = head;
  while (current != null){
   if (current.getHouse().getAddress().equals(address)){
    current.setNext(current.getNext().getNext());
   }
   current = current.getNext();
  }
 }

 /*returns the size of the list*/
 public int size(){
  return size;
 }
 /*returns a string with the list of all the houses*/
 public String toString() {
  String s ="";
  ListNode current = head;
  while(current != null){
   s+= "\n"+current.getHouse().toString();
   current=current.getNext();
  }
  return s;
 }  
 /*this method searches the list to find all the houses with the given number of the rooms
 create a string of all the houses and returns the string*/
 public String search(int rooms) {
  String list = "";
  if(head == null )  {
   return null; 
  }
  else {
   ListNode curr = head; 
   while(curr!= null) {
    if(curr.getHouse().getRooms() == rooms){
     list = list + curr.getHouse().toString();
    }
    curr = curr.getNext();
   }
   return list;
  }
 }
 
 //searches the list to find all all the houses with the specific number of roooms and bath
 public String search(int rooms, int baths) {
  String s ="";
  ListNode curr = head;
  while (curr != null){
   if (curr.getHouse().getRooms() == rooms && curr.getHouse().getBaths() == baths){
    s+= curr.getHouse().toString();
   }
   curr = curr.getNext();
  }
  return s;
 }
 
 /*Searches the list to find all the houses at the given zipcode*/
 public String search(String zipcode){
  String list = "";
  if(head == null )  { 
   return null; 
  }
  else {
   ListNode curr = head; 
   while(curr != null){
    if(curr.getHouse().getZipcode().equals(zipcode)){
     list = list + curr.getHouse().toString();
    }
    curr = curr.getNext();
   }
   return list;
  }
 }
 
 /*Searches the list to find the most expensive house in the market*/
 public House mostExpensiveHouse(){
  House h = new House();
  double max = Integer.MIN_VALUE;
  ListNode curr = head;
  while (curr!= null){
   if (curr.getHouse().getPrice()>max){
    max=curr.getHouse().getPrice();
    h = curr.getHouse();
   }
   curr = curr.getNext();
  }
  return h;
 }
 /*Searches the list to find the least expensive house in the list*/
 public House leastExpensiveHouse(){ 
  House h = new House();
  double min = Integer.MAX_VALUE;
  ListNode curr = head;
  while (curr!= null){
   if (curr.getHouse().getPrice()<min){
    min=curr.getHouse().getPrice();
    h = curr.getHouse();
   }
   curr = curr.getNext();
  }
  return h;    
 } 
}

/*implement your own driver similar to the given one. You must use if/else and not switches.
Codes with switches will get zero points out of 15
the house objects must be created by you and not copying mine
*/
class YourDriver
{
 public static void main (String args[])
 {
  Zillow app = new Zillow();
  Scanner kb = new Scanner(System.in);
  //public void add(int rooms, int baths, double price, double area, String address, String zipcode, int index)
  app.add(2, 2, 300000.0, 1500.0, "7895 A St", "11112");
  app.add(2, 1, 250000.0, 1200.0, "7896 B St", "12234");
  app.add(5, 2, 500000.0, 2400.0, "7822 C St", "22222");
  app.add(5, 4, 650000.0, 2800.0, "1114 D St", "11111");
  app.add(3, 2, 350000.0, 1800.0, "1992 H St", "12345");
  while(true){
   choice();
   if(kb.hasNextInt()){
    int num = kb.nextInt();
    if (num==1){
     System.out.print("Enter the zipcode: ");
     String zipcode = kb.next();
     System.out.println(app.search(zipcode).toString());
    }
    else if(num==2){
     System.out.print("Enter the number of rooms: ");
     int rooms = kb.nextInt();
     System.out.println(app.search(rooms).toString());
    }
    else if(num==3){
     System.out.print("Enter the number of rooms: ");
     int rooms = kb.nextInt();
     System.out.print("Enter the number of baths: ");
     int baths = kb.nextInt();
     System.out.println(app.search(rooms,baths).toString());
    }
    else if(num==4){
     System.out.print("Enter the address of the house: ");
     String address = kb.next();
     kb.nextLine();
     app.remove(address);
    }
    else if(num==5){
     System.out.print("Enter the number of rooms: ");
     int rooms = kb.nextInt();
     System.out.print("Enter the number of baths: ");
     int baths = kb.nextInt();
     System.out.print("Enter the price of the house: ");
     double price = kb.nextDouble();
     System.out.print("Enter the area of the house: ");
     double area = kb.nextDouble();
     System.out.print("Enter the address of the house: ");
     String address = kb.next();
     kb.nextLine();
     System.out.print("Enter the zipcode of the house: ");
     String zipcode = kb.next();
     app.add(rooms,baths,price,area,address,zipcode);
    }
    else if(num==6){
     System.out.println(app.toString());
    }
    else if(num==7){
     System.out.println(app.mostExpensiveHouse());
    }
    else if(num==8){
     System.out.println(app.leastExpensiveHouse());
    }
   }
   else{
    break;
   }
  }
  }
  public static void choice(){
  System.out.println("__________________________________________________________________");
  System.out.println("\nEnter 1 to list the houses based on the zipcode");
  System.out.println("Enter 2 to list the houses based on the number of the rooms");
  System.out.println("Enter 3 to list the houses with the number of rooms and baths");
  System.out.println("Enter 4 to remove a house from the list");
  System.out.println("Enter 5 to add a house to the list");
  System.out.println("Enter 6 to list all the houses");
  System.out.println("Enter 7 to list the most expensive house");
  System.out.println("Enter 8 to list the least expensive house");
  System.out.println("Enter anything except them to end it.");
  System.out.println("__________________________________________________________________");
 }
}

/*Do not delete the Driver class
Your program will be graded based on the running of the given Driver. Make sure that the output of your code matches 
exactly the given output. Otherwise a lot of points will be lost*/
class Driver
{
   public static void main(String[] args)
   {
    Zillow  list = new Zillow();
    // public House(int rooms, int baths,double area,String address,double price, String zipcode){
    //add(int rooms, int baths, double price, double area, String address,String zipcode) {
    list.add(2,3,710000,1200,"Sahnnan Bay Drive", "95677");
    list.add(4,3,1700000,3000,"Miners Cir", "95677");
    list.add(2,2,650000,1400,"Albatroos Way", "95677");
    list.add(2,3,600000,1200,"Halidon Drive", "95630");
    list.add(2,3,750000,12500,"Taylor St", "95630");
    list.add(2,3,700000,1100,"Canyon Drive", "95762");
    list.add(5,4,1650000,2300,"Ridge View Drive", "95762");
    list.add(3,2,722000,2300,"Vila Flor", "95630");
    // System.out.println(list);
    Scanner kb = new Scanner(System.in);
    while(true)
    {
     choice();
     System.out.print("Select an option: ");
     int option = kb.nextInt();
     switch(option)
     {
      case 1: System.out.print("Enter the zipcode: ");
              String zip = kb.next();
              String s = list.search(zip);
              if (s.length() != 0)
               System.out.println(s);
              else
               System.out.println("No house wasfound");   
              break;
      case 2: System.out.print("Enter the number of the rooms: ");
              int rooms = kb.nextInt();
              s = list.search(rooms);
              if (s.length() != 0)
               System.out.println(s);
              else
               System.out.println("No house wasfound");
              break;
      case 3: System.out.print("Enter the number of the rooms and the number of the baths: ");
              rooms = kb.nextInt();
              int baths = kb.nextInt();
              s = list.search(rooms, baths);
              if (s.length() != 0)
               System.out.println(s);
              else
               System.out.println("No house wasfound");
              break;
      case 4:System.out.print("Enter the adress of the house: ");
             kb.nextLine();
             String address  = kb.nextLine();
             list.remove(address);
             //if (s.length() != 0)
             // System.out.println(s);
             // else
             //System.out.println("No house wasfound");
             break;
      case 5:System.out.print("Enter the number of the rooms: ");
             rooms = kb.nextInt();
             System.out.print("Enter the number of the baths: ");
             baths = kb.nextInt();
             System.out.print("Enter the price of the house: ");
             double price = kb.nextDouble();
             System.out.print("Enter the sqaure feet of the house: ");
             double area = kb.nextDouble();
             System.out.print("Enter the zip code: ");
             zip = kb.next();
             kb.nextLine();
             System.out.print("Enter the address: ");
             address = kb.nextLine();
             //int rooms, int baths, double price, double area, String address,String zipcode)
             list.add(rooms, baths,price,area,address,zip);
             break;
      case 6:System.out.println(list);
             break;
      case 7:System.out.println(list.mostExpensiveHouse()); 
             break;
      case 8:System.out.println(list.leastExpensiveHouse()); 
             break;              
     } 
    }  
   }
   public static void choice()
   {
    System.out.println("\n*********************************************************\n");
    System.out.println("Enter 1 to list the houses based on the zipcode");
    System.out.println("Enter 2 to list the houses based on the number of the rooms");
    System.out.println("Enter 3 to list the houses with the number of rooms and baths");
    System.out.println("Enter 4 to remove a house from the list");
    System.out.println("Enter 5 to add a house to the list");
    System.out.println("Enter 6 to list all the houses");
    System.out.println("Enter 7 to list the most expensive house");
    System.out.println("Enter 8 to list the least expensive house");
    System.out.println("***************************************************\n");
   }
}