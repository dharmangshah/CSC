/*
Name: Dharmang Shah     
Description: this program helps us to tabulize all the entrees of the hot dog stand owners.
date: 14 February, 2024
self-grade: 100%, as I have followed all the rubrics and given necessary comments.
Testimony: All the code is written by myself and I have not copied the code from any resources. Name:Dharmang Shah
*/
import java.util.*;
public class HotDogStandShah
{
}
class hotDog
{
  //initializing all the instance variables.
  private int id;
  private String owner;
  private String address;
  private int itemSold;
  private int price;
  private int soldPrice;
  private int income;
  //this method constructs the required variable.
  public hotDog(int id,String owner,String address)
  {
   this.id = id;
   this.owner = owner;
   this.address = address;
   price = 10;
   soldPrice = 20;
  }
  //this method returns the ID of the owner.
  public int getId()
  {
   return id;
  }
  //this method return the owner's name.
  public String getOwner()
  {
   return owner;
  }
  //this method return the number of hot dogs sold.
  public int getItemSold()
  {
   return itemSold;
  }
  //this method changes the owner's name.
  public void setOwner(String newOwner)
  {
   owner= newOwner;
  }
  //this method changes the address of the owner.
  public void setAddress(String newAddress)
  {
   address = newAddress;
  }
  //this method increases the number of hot dogs sold by the given number.
  public void order(int count)
  {
   itemSold += count; 
  }
  //this method returns the income.
  public double income()
  {
   income = (soldPrice-price)*itemSold; 
   return  income;
  }
  //this method returns a string in the required format.
  public String toString()
  {
   String s="";
   s += "";
   s += "Station#: "+id+"\n";
   s += "Owner: "+owner+"\n";
   s += "Address: "+address+"\n";
   s += "Hot dog sold: "+itemSold+"\n";
   s += "Income: "+income;
   return s;
  }
}
//this is my driver for checking the code.
class YourDriver
{
   public static void main(String[] args)
   {
       Random rand = new Random();
       int n1, n2, n3;
       n1 = getRandNum(rand,99999,9999999); 
       n2 = getRandNum(rand,99999,9999999);
       n3 = getRandNum(rand,99999,9999999);
       while(n1==n2 || n2==n3 || n1==n3)
       {
        n1 = getRandNum(rand,99999,9999999); 
        n2 = getRandNum(rand,99999,9999999);
        n3 = getRandNum(rand,99999,9999999);
       }
       hotDog stand1 = new hotDog(n1,"Dharmang","Rocklane");
       hotDog stand2 = new hotDog(n2,"Alex","Folsom");
       hotDog stand3 = new hotDog(n3,"Rick","Rancho");
       int c1,c2,c3;
       c1 = getRandNum(rand,200,500);
       c2 = getRandNum(rand,200,500);
       c3 = getRandNum(rand,200,500);
       stand1.order(c1);
       stand2.order(c2);
       stand3.order(c3);
       int t1,t2,t3;
       t1 = stand1.getItemSold();
       t2 = stand2.getItemSold();
       t3 = stand3.getItemSold(); 
       int total = t1+t2+t3;
       double income1,income2, income3;
       income1 = stand1.income();
       income2 = stand2.income();
       income3 = stand3.income();       
       double totalIncome = income1 + income2 +income3;
       System.out.println("_______________________________________________");
       System.out.println(stand1.toString());
       System.out.println("_______________________________________________");
       System.out.println(stand2.toString());
       System.out.println("________________________________________________");
       System.out.println(stand3.toString());
       System.out.println("________________________________________________");
       System.out.println("Total hot dogs sold: "+total);
       System.out.println("_______________________________________________");
       System.out.println("Total income: "+totalIncome);
   }
   public static int getRandNum(Random rand, int min, int max)
   {
       return rand.nextInt(max - min + 1) + + min;
   }
}
/*This driver helps you on how to call the non-static methods from the HotDogStand class
Once you have implemented your HotDogStand class, uncommnet MyDriver class and run your code. Your output must match the given output*/

//DO NOT DELETE THIS CLASS hust uncommnet the class to test your code 

class MyDriver
{
    public static void main(String[] args)
    {
    Random rand = new Random();
    //creating three objects
       hotDog stand1 = new hotDog(rand.nextInt(9999999)+99999, "Jose", "Folsom");
       hotDog stand2 = new hotDog(rand.nextInt(99999999)+99999, "Jose", "Rocklin");
       hotDog stand3 = new hotDog(rand.nextInt(99999999)+99999, "Jose", "Folsom");
      //ordering hot dogs at different stand
       stand1.order(100);
       stand2.order(150);
       stand3.order(175);
       //claculating the income form the stations
       double stand1Income = stand1.income();
       double stand2Income = stand2.income();
       double stand3Income = stand3.income();
       //getting the total number of the hotdogs orderd at all the stations
       int total = stand1.getItemSold() + stand2.getItemSold()+ stand3.getItemSold() ;
       double totalIncome = stand1.income() + stand2.income() + stand3.income();
       //displaying the info
       System.out.println(stand1);
       System.out.println("_______________________________________________");
       System.out.println(stand2);
       System.out.println("_______________________________________________");
       System.out.println(stand3);
       System.out.println("________________________________________________");
       System.out.println("Total hotdogs sold at all the stations: " + total);
       System.out.println("________________________________________________");
       System.out.println("Total income: " + totalIncome);
    }
}