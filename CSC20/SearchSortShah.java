/*
Name: Dharmang shah
Description: This program is about managing doctors in a  hospital.
date: 4/3/2024
self-grade: 100%, as I have followed all the rubrics and given necessary comments.
Testimony: All the code is written by myself and I have not copied the code from any resources. Name: Dharmang Shah
*/
import java.util.*;
public class SearchSortShah
{
}
class Doctor implements Comparable
{
 private String first;
 private String last;
 private String phone;
 private String speciality;
 private int rating;
 public Doctor(String first, String last, String phone, String speciality, int rating)
 {
  this.first = first;
  this.last = last;
  this.phone = phone;
  this.speciality = speciality;
  this.rating = rating;  
 }
 //getter methods
 public String getLast()
 {
  return last;
 }
 public String getFirst()
 {
  return first;
 }
 public String getSpeciality()
 {
  return speciality;
 }
 public String getPhone()
 {
  return phone;
 }
 public int getRating()
 {
  return rating;
 }
 //setter methods
 public void setFirst(String newFirst)
 {
  first = newFirst;
 }
 public void setLast(String newLast)
 {
  last = newLast;
 }
 public void setPhone(String newPhone)
 {
  phone = newPhone;
 }
 public void setSpeciality(String newSpeciality)
 {
  speciality = newSpeciality;
 }
 public void setRating(int newRating)
 {
  rating = newRating;
 }
 /*compares object of type doctors based on the last name,
 if the last name is the same then compare based on the first name
 this method is used in the bubble sort*/
 public int compareTo(Object o)
 {
  Doctor d = (Doctor)o;
  int i = this.last.compareTo(d.last);
  if(i == 0)
  {
   return d.first.compareTo(first);
  }
  else
  {
   return i;   
  }     
 }
 /*
 compares objects of type Doctor based on the speciality
 if two doctors have the same speciality then compare them based on the last name
 this method is called in the insertion sort
 this method is similar to the given compareTo method*/
 public int comparesTo(Doctor d)
 {
  int i = this.speciality.compareTo(d.speciality);
  if(i == 0)
  {
   return d.last.compareTo(last);
  }
  else
  {
   return i;   
  }          
 }
 //compares objects based on the rating of the doctors
 public int compareRating(Doctor d)
 {
  return  this.rating - d.rating;
 }
 //This method create a string representing all the attributes of the Doctor object
 public String toString()
 {
  String s ="";
  s+= "\nFirst name: "+first;
  s+= "\nLast name: "+last;
  s+= "\nPhone: "+phone;
  s+= "\nSpeciality: "+speciality;
  s+= "\nRating: "+rating;
  return s;
 }
 //this method is used to see if two objects of type doctor are the same. 
 public boolean equals(Doctor p)
 {
  if (this.first == p.first && this.last == p.last)
  {
   return true;
  }
  else
  {
   return false;
  }
 }
}
//this class creates a list of all the contacts 
class Hospital
{
 ArrayList<Doctor> doctors;
 //Constructor
 public Hospital( )
 {
  doctors  = new ArrayList<Doctor>();
 }
 //getter method
 public ArrayList<Doctor> getList()
 {
  return doctors;
 }
 //Sorts the objects based on the last name
 public void bubbleSort()
 {
  for (int i =0;i<doctors.size();i++)
  {
   for (int j =0;j<doctors.size()-i-1;j++)
   {
    if(doctors.get(j+1).compareTo(doctors.get(j))<0)
    {
     Doctor temp = doctors.get(j) ;
     doctors.set(j,doctors.get(j+1));
     doctors.set(j+1,temp);
    }
   }
  }
 }
 //add a doctor to the list of the doctors
 public void addDoctor(String first, String last, String phone, String speciality, int rating)
 {
  int i = 0;
  while (i < doctors.size() &&  last.compareTo(doctors.get(i).getLast()) > 0)
  {
   i++;
  }
  doctors.add(i, new Doctor(first,last,phone, speciality, rating));
 }
 //deletes a doctor from the list
 public boolean deleteDoctor(String last)
 {
  for(int i = 0; i < doctors.size(); i++)
  {
   if(doctors.get(i).getLast().equals(last))
   {
    doctors.remove(i);
    return true;
   }  
  }
  return false;
 }
 //adds a doctor to the end of the list
 public void add(String first, String last, String phone, String spec, int rating)
 {
  Doctor p = new Doctor(first, last,phone, spec, rating);
  doctors.add(p);
 }
 public  String toString()
 {
  String s = "";
  for(int i = 0; i < doctors.size(); i++)
  {
   s = s+ "\n" + doctors.get(i).toString();
  } 
  return s;     
 }
 //Selection sort
 public void selectionSort()
 {
  for(int i = 0; i <doctors.size(); i++)
  {
   int index = 0;
   boolean swap = false;
   Doctor min =doctors.get(i);
   for(int j = i+1; j < doctors.size(); j++)
   {
    if(doctors.get(j).compareRating(min) < 0)
    {
     index = j;
     min = doctors.get(j);
     swap = true;
    }
   }
   if(swap)
   {
    Doctor temp = doctors.get(i);
    doctors.set(i,doctors.get(index));
    doctors.set(index ,temp);
   }   
  }
 }
 //this method uses the binary search to find a doctor in the list. 
 public int binarySearch(Doctor d)
 {
  int first = 0;
  int last = doctors.size() -1;
  int mid = (first + last)/2;
  while (first <= last)
  {
   if(doctors.get(mid).compareTo(d)==0)
    return mid;
   if(d.compareTo(doctors.get(mid)) > 0)
    first = mid + 1;
   else
    last = mid -1;
   mid =(first + last)/2;            
  }
  return -1;
 }
 //this method sorts the list of the doctors based on their speciality
 public  void insertionSort( )
 {
  for(int i = 0; i < doctors.size() -1; i++)
  {
   int j = i+1;
   Doctor temp = doctors.get(j);
   String n = doctors.get(j).getSpeciality();
   while(j > 0 && n.compareTo(doctors.get(j-1).getSpeciality()) < 0) 
   {
    doctors.set(j,doctors.get(j-1)); 
    j--;
   }
   doctors.set(j,temp); 
  }
 }
}
class YourDriver
{
 public static void main(String[] args)
 {
  Hospital sutter = new Hospital();
  sutter.add("John","Lowrey","757-347-4626","Pediatrition",4);
  sutter.add("Mark","Watson","246-462-6834","Phsyciatric",3);
  sutter.add("Mike","Ross","346-626-7424","Dermatalogist",5);
  sutter.add("Chris","Tucker","743-734-6536","Cardialogist",2);
  sutter.add("Harry","Singh","263-734-2647","Ocuplastic surgeon",5);
  System.out.println("-------------------------------------------");
  System.out.println("Testing the bubble sort sort based on the last name");
  sutter.bubbleSort();
  System.out.println("Here is the sorted list based on the last name");
  System.out.println(sutter);
  System.out.println("-------------------------------------------");
  System.out.println("Testing the binary search looking for Harry Singh");
  int i = sutter.binarySearch(new Doctor( "Harry","Singh","263-734-2647","Ocuplastic surgeon",5));
  System.out.println("The index for Harry Singh is : " + i+ "\n");
  System.out.println("-------------------------------------------");
  System.out.println("adding 2 more doctors  to the list"); 
  sutter.add("Paul","Walker","435-325-7643","Cardialogist",4);
  sutter.add("Jake","Smith","257-643-1664","Dermatalogist",3);
  System.out.println("-------------------------------------------");
  System.out.println("New list of doctors");
  System.out.println(sutter);
  System.out.println("-------------------------------------------");
  System.out.println("Testing the insertion sort based on the speciality");
  sutter.insertionSort();
  System.out.println(sutter);
  System.out.println("-------------------------------------------");
  System.out.println("Testing the selection sort based on the rating of the doctors ratings");
  sutter.selectionSort();
  System.out.println("New list of doctors");
  System.out.println(sutter);
  System.out.println("-------------------------------------------");
  int index = sutter.binarySearch(new Doctor("Jake","Smith","257-643-1664","Dermatalogist",3));
  System.out.println("Jake is at index : "+ index+"\n");
 }
}   
class Driver
{
 public static void main(String[] args)
 {
  Hospital mercy = new Hospital();
  mercy.add ( "Ana","Baily","568-345-9999" , "Dermatalogist", 4);
  mercy.add ( "Mary","Busta","111-222-3333","Cardialogist", 5 );
  mercy.add ( "Richard","Smith","123-123-4567","Pediatrition", 3 );
  mercy.add ( "Alex","Rodrigues","987-567-3333" , "Punmnalogist", 4);
  mercy.add ( "Sarah","Schulz","555-666-7777" , "Pain medicine", 3);
  mercy.add("Roy","Trump","333-555-6666", "Phsyciatric", 4);
  mercy.add("Zack", "Lambard","345-777-8989", "Radialogist", 5);
  mercy.add("Alex","Cook","111-222-3333", "Ocuplastic surgen", 4);
  System.out.println("******************************************");
  System.out.println("Testing the bubble sort sort based on the last name");
  mercy.bubbleSort();
  System.out.println("Here is the sorted list based on the last name");
  System.out.println(mercy);
  System.out.println("******************************************\n\n");
  System.out.println("Testing the binary search looking for Richard Smith");
  int i = mercy.binarySearch(new Doctor( "Richard","Smith","123-123-4567","Pediatrition", 3 ));
  System.out.println("The index for Richard Smith is : " + i+ "\n\n");
  System.out.println("*****************************************");
  System.out.println("adding 3 more doctors  to the list"); 
  System.out.println("******************************************");
  mercy.add("Zack", "Lambard","345-777-8989", "Plastic surgern", 5);
  mercy.add("Alex","Cook","111-222-3333", "Ocuplastic surgen", 4);
  mercy.add("Roy","Trump","333-555-6666", "Phsyciatric", 4);
  System.out.println("**************************************\n"); 
  System.out.println("New list of doctors");
  System.out.println(mercy);
  System.out.println("*********************************************");
  System.out.println("Testing the insertion sort based on the speciality");
  mercy.insertionSort();
  System.out.println(mercy);
  System.out.println("***************************************************");
  System.out.println("Adding more to the mercy");
  mercy.add("Sarah", "Lee","888-999-9008", "Cardialogist", 5);
  mercy.add("AShly", "Lu","123-444-0780","Internal medicine", 4);
  mercy.add("Jose","Brwon","111-999-6556", "Eye surgen",3);
  System.out.println("***********************************************");
  System.out.println("Testing the selection sort based on the rating of the doctors ratings");
  mercy.selectionSort();
  System.out.println("Here is the sorted list based on the rating ");
  System.out.println(mercy);
  System.out.println("************************************************\n");
  mercy.bubbleSort();
  System.out.println("*************************************************");
  System.out.println("Sorted list based on the last name:");
  System.out.println(mercy);
  System.out.println("*************************************************");
  int index = mercy.binarySearch(new Doctor("Sarah", "Lee","888-999-9008", "Cardialogist", 5));
  System.out.println("Sarah is at index : "+ index);
 } 
}