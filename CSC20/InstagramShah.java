/*
Name: Dharmang Shah
Description: This program is about managing the followerrs of instagram
date: 10/03/2024
self-grade: 100%, as I have followed all the rubrics and given necessary comments.
Testimony: All the code is written by myself and I have not copied the code from any resources. Name: Dharmang Shah
*/
import java.util.*;
public class InstagramShah
{
}
//This class creates a new object whick stores all the instance variables
class User implements Comparable
{
 private String first;
 private String last;
 private String username;
 private boolean followBack;
 private String bio;
 //constructor method
 public User(boolean followBack, String first, String last, String username, String bio)
 {
  this.followBack = followBack;
  this.first = first;
  this.last = last;
  this.username = username;
  this.bio = bio;
 }
 //it returns if youfollow the person or not
 public boolean getFollow()
 {
  return followBack;
 }
 //it unfollows the person
 public void unfollow()
 {
  followBack = false;
 }
 //it follows the person
 public void  follow()
 {
  followBack = true;
 }
 //it return first name
 public String getFirst() 
 {
  return first;
 }
 //it returns last name
 public String getLast() 
 {
  return last;
 }
 //it changes first name
 public void setFirst(String newFirst) 
 {
  first = newFirst;
 }
 //it changes last name
 public void setLast(String newLast) 
 {
  last = newLast;
 }
 //it returns last name
 public String getUsername()
 {
  return username;
 }
 //it compares 2 objects
 public int compareTo(Object o) 
 {
  if (o instanceof User)
  {
   User user1 = (User)o;
   return this.username.compareTo(user1.username);
  }
  else
  {
   return 0;
  }
 }
 //it returns if 2 users are equal
 public boolean equals(User other) 
 {
  return this.username.equalsIgnoreCase(other.username);
 }
 //it returns a string with all elements
 public String toString() 
 {
  String s = "";
  s+="\nName: "+first+" "+last;
  s+="\nUserName: "+username;
  if (followBack == true)
  {
   s+= "\nYou are following this person";
  }
  else
  {
   s+=  "\nYou are not following this person";
  }
  return s;
 }
 //it returns the bio
 public String getBio()
 {
  return bio;
 }
 //it changes the bio
 public void setBio(String newBio)
 {
  bio = newBio;
 }
}
//this class creates an arraylist to store all the users
class Instagram
{
 private ArrayList<User> app;
 //constructor method
 public Instagram()
 {
  app = new ArrayList<User> ();
 }
 //it follows back the person mentioned
 public void followBack(String first, String last)
 {
  String s = first + " " + last;
  for(int i = 0; i<app.size(); i++)
  {
   String s1 = app.get(i).getFirst() + " "+ app.get(i).getLast();
   if(s.equalsIgnoreCase(s1))
   {
    app.get(i).follow();
   }
  }
 }
 //it follows the new person
 public boolean follow(boolean followBack, String first, String last, String username, String bio) 
 {
  User user1 =new User(followBack,first,last,username,bio);
  if (app.isEmpty())
  {
   app.add(user1);
   return true;
  }
  if (!find(first,last))
  {
   for (int i = 0; i<app.size();i++)
   {
    if ((first.compareTo(app.get(i).getFirst())<0))
    {
     app.add(i,user1);
     return true;
    }
    else if ((first.compareTo(app.get(i).getFirst())==0))
    {
     if ((last.compareTo(app.get(i).getLast())<0))
     {
      app.add(i,user1);
      return true;
     }
    }
    else
    {
     app.add(user1);
     return true;
    }
   }
  }
  return false;
 }
 //it removes a follower
 public boolean delete(String first, String last ) 
 {
  for (int i = 0; i<app.size();i++)
  {
   if (first.equalsIgnoreCase(app.get(i).getFirst()) && last.equalsIgnoreCase(app.get(i).getLast()))
   {
    app.remove(i);
    return true;
   }
  }
  return false;
 }
 //it finds a follower
 public boolean find(String first, String last) 
 {
  for (int i = 0; i<app.size();i++)
  {
   if (first == app.get(i).getFirst() && last == app.get(i).getLast())
   {
    return true;
   }
  }
  return false;
 }
 //it returns an arraylist of users
 public ArrayList<User> getList()
 {
  return app;
 }
 //it returns the number of followers
 public int followersNum()
 {
  return app.size();
 }
 //it returns the number of people you are following
 public int followingsNum()
 {
  int num=0;
  for (int i = 0; i<app.size();i++)
  {
   if (app.get(i).getFollow()==true)
   {
    num++;
   }
  }
  return num;     
 } 
 //it returs a String with all the people whom you follow
 public String toString() 
 { 
  String s ="";
  for (int i = 0; i<app.size();i++)
  {
   if (app.get(i)==null)
   {
    s+="\n";
   }
   else
   {
   s+="\n"+app.get(i).toString();
   }
  }
  return s;
 }
}
//driver created by me
class MyDriver
{
 public static void main(String[] args)
 {
  Scanner kb = new Scanner(System.in);
  Instagram jack = new Instagram();
  jack.follow(false,"Matt","Perry","MP","My nick name is Matty");
  jack.follow(true,"John","Mark","JM","My nick name is Jhonny");
  jack.follow(false,"James","Buck","JB","I have no nick name");
  jack.follow(true,"Christopher","Tucker","CT","My nick name is Chris");
  System.out.println("Your followers");
  System.out.println(jack);
  System.out.println("Unfollowing Christopher");
  jack.delete("Christopher","Tucker");
  System.out.println("Your new followers");
  System.out.println(jack);
  System.out.println("searching for matt");
  if (jack.find("Matt","Perry"))
  {
   System.out.println("Matt follows you");
  }
  else
  {
   System.out.println("Matt doesn't follow you");
  }
  System.out.println("You are following " + jack.followersNum() + " people");
  System.out.println("Enter name of person you want to follow back");
  String first = kb.next();
  String last = kb.next();
  jack.followBack(first,last);
  System.out.println("The updated listof followers");
  System.out.println(jack);
 }
}
//below is a sample driver. Do not remove this driver from your code when sub,itting it
class Driver{
   public static void main(String[]args) {
      Instagram myInsta = new Instagram();

    	//Adding followers to your list
      //the boolean field indicates whether you want to follow them back
      myInsta.follow(true, "Matthew", "Philips", "MatPhil","My name is Matt");
      myInsta.follow(false, "Gary", "Kane",  "GKane","My name is G");
      myInsta.follow(true, "Robert", "Kenny",  "RKenny","My name is Robby"); 
      myInsta.follow(true, "Bill", "Fitch", "BillF","My name is Billy");
      myInsta.follow(false, "Trevor", "Schlulz", "TrevorS","My name is Trev");
      //Displaying your followers
      System.out.println("Your followers informations\n");
      System.out.println(myInsta);
      //Unfollowing a user
      System.out.println("Removing Robert Kenny from your followers list");
      myInsta.delete("Robert", "Kenny");
      //Displaying the list
      System.out.println("List of followers after removing Robert Kenny");
      System.out.println(myInsta);
      //adding a new follower
      System.out.println("Adding Elon Musk to your list of followers");
      myInsta.follow(true, "Elon", "Musk", "ElonM","My name is Eli");
      //Dipslying the followers
      System.out.println("List of your followers:");
      System.out.println(myInsta);
      //Searching for a follower
      System.out.println("Searching for Stonewall Jackson(StonW) in your followers list");
      if(myInsta.find("Jackson", "Stonewall") == false) {
         System.out.println("Stonewall Jackson is not in your list of followers");
         System.out.println("\n***************************");   
         System.out.println("You are following " + myInsta.followersNum() + " people");
         System.out.println("You have " + myInsta.followingsNum() + " followers");  
         System.out.println(myInsta);
         Scanner kb = new Scanner(System.in);
         System.out.println("Enter the first name and the last name of  of the person that you want to follow back: ");
         String first =kb.next();
         String last = kb.next();
         myInsta.followBack(first, last);
         System.out.println(myInsta);
      }
   }
}