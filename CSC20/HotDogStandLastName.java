/*
Name:
Description
date
self-grade
Testimony: All the code is written by myself and I have not copied the code from any resources. Name:______________*/

/* THe description for each method is given. You need to implement them based on the given requirments.
Sample output of MyDriver give below. Must run your code with the given MyDriver to get this output to verify the correctness of your code
Then implement YourDriver with the required code in it

ID#: 9123144
Owner: Jose
Address: Folsom
Hot dog sold: 100
Income: 200.0
_______________________________________________
ID#: 96973045
Owner: Jose
Address: Rocklin
Hot dog sold: 150
Income: 300.0
_______________________________________________
ID#: 81285007
Owner: Jose
Address: Folsom
Hot dog sold: 175
Income: 350.0
________________________________________________
Total hotdogs sold at all the stations: 425
________________________________________________
Total income: 850.0




*/


import java.util.*;

public class HotDogStandShah  // must change the class name to include your last name
{
}
class hotDog
{
  /*declare all the instance variables*/ 
  private int id;
  private String owner;
  private String address;
  private int itemSold;
  private int price;
  private int soldPrice;
  private int income;
  /*create the constructor. refer to the UML diagram given in the document*/
  public hotDog(int id,String owner,String address)
  {
   this.id = id;
   this.owner = owner;
   this.address = address;
  }
  /*create all the required getter methods.refer to the UML diagram*/
  public int getId()
  {
   return id;
  }
  public String getOwner()
  {
   return owner;
  }
  public int getItemsSold()
  {
   return itemSold;
  }
  /*declare all the setter methods. Refer to the UML diagram*/
  public void setOwner(String newOwner)
  {
   owner= newOwner;
  }
  public void setAddress(String newAddress)
  {
   address = newAddress;
  }
  /* create the order method. This method increased the countSold by the paramter count*/
  public static void order(int count)
  {
   itemSold += count; 
  }
   /*
   Creat the income method. This method calculates the income for the give station. The income can be calculate by
   the difference of soldPrice - price multiplyied by the countSold
   */
  public double income()
  {
   income = (soldPrice-price)*itemSold; 
   return  income;
  } 
  /*Create the toString method
  This method creates a String representing the the HotDogStand.
  Here is a sample of Stirng that this method needs to create. you need to use proper variables in this method for example
  s = s +"";
  s = s + "Station#: + standNum  //should be the first two lines of this method 
  Station#: 661
  Owner:  Jose
  Address: Rocklin
  Hot dog sold: 330
  Income: 660.0
  */
  public String toString()
  {
   String s;
   s += "";
   s += "Station#: "+id;
   s += "Owner: "+owner;
   s += "Address: "+address;
   s += "Hot dog sold: "+itemSold;
   s += "Income: "+income;
   return s;
  }
}
/*
Must complete this Driver for your code to be graded. submissions without the completed YourDriver will get zero points
in this driver you are to create three hot dog stations for yourself. The stand ID# must be generated randomly.
Once the station ID is createed, create three objects of the HotDogStand class. The number of the hotdogs sold at each stand must
be generated randomly. Follow the given commnets to implement the code.

In this driver you will have three Hotdogs stand.The amount of the hotdogs sold per stand will be generated randomly
Please go through the given Driver before implemnting yourDriver to help you with coding


*/
 class YourDriver
{
   public static void main(String[] args)
   {
       Random rand = new Random();
       // generate three random numbers for the statnd ID number between 9999999 and 99999
       int n1, n2, n3; // each variable holds a random number between   9999999 and 99999
       
       //generate the first randon number and assign it to n1. must call the getRandNum that is given in this code
       n1 = getRandNum(rand,99999,9999999); 
       //generate the second randon number and assign it to n2
       n2 = getRandNum(rand,99999,9999999);
       //generate the third randon number and assign it to n3
       n3 = getRandNum(rand,99999,9999999);
       //n1, n2 n3 must be unique. a while loop is needed to check if they are unique or not
       //as long as any of the two ids are the same
       while(n1==n2 || n2==n3 || n1==n3)
       {
        //generate three random numbers, assign them to n1, n2, n3. must call the gerRandNum 3 times
        n1 = getRandNum(rand,99999,9999999); 
        //generate the second randon number and assign it to n2
        n2 = getRandNum(rand,99999,9999999);
        //generate the third randon number and assign it to n3
        n3 = getRandNum(rand,99999,9999999);
       }
       //declare and instantiate three HotDogStand objects. with the choice of your locations. The owner will be you. 
       //public hotDog(int id,String owner,String address)
       //object 1
       hotDog stand1 = new hotDog(n1,"Dharmang","Rocklane");
       //object 2
       hotDog stand2 = new hotDog(n2,"Alex","Folsom");
       //object 3
       hotDog stand3 = new hotDog(n3,"Rick","Rancho");
       //generate three random numbers for the hotdogs sold at each stand between 200 - 500 and store them in c1, c2, c3. Must call the getRandNum method
       int c1,c2,c3;
       c1 = getRandNum(rand,200,500);
       c2 = getRandNum(rand,200,500);
       c3 = getRandNum(rand,200,500);
       //call the order method on each HotDogStand object you created and pass c1, c2, c3 random numbers you created for the hotdogs sold
       stand1.order(c1);
       stand2.order(c2);
       stand3.order(c3);
       //getting the total number of the hotdogs orderd at all of your stands. must call the getCoundSold on all the three stands objects you created
       int t1,t2,t3;
       //call the getCountSold on the each of your stands and store the result in t1,t2,t3.
       t1 = stand1.getItemSold();
       t2 = stand2.getItemSold();
       t3 = stand3.getItemSold(); 
       //find the total count sold by adding t1,t2,t3 and store them in a variable
       int total = t1+t2+t3;
       double income1,incmoe2, income3;
       //call the method income on each of your stand and store each reslut in income1, income2, income3
       income1 = stand1.income();
       income2 = stand2.income();
       income3 = stand3.income();       
       //find the total income by adding income1, income2, income3
       int totalIncome = income1 + income2 +income3;
       //displaying the info
       
       //call the tostring method on stand 1 you created
       System.out.println("_______________________________________________");
       System.out.println(stand1.toString());
       //call the tostring method on stand 2 you created
       System.out.println("_______________________________________________");
       System.out.println(stand2.toString());
       //call the tostring method on the stand 3 you created
       System.out.println("________________________________________________");
       System.out.println(stand3.toString());
       System.out.println("________________________________________________");
       //display total hotdogs sold thjat you calculated
       System.out.println("Total hot dogs sold: "+total);
       //display total income you calculated 
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
/*
class MyDriver
{
    public static void main(String[] args)
    {
    Random rand = new Random();
    //creating three objects
       HotDogStand stand1 = new HotDogStand(rand.nextInt(9999999)+99999, "Jose", "Folsom");
       HotDogStand stand2 = new HotDogStand(rand.nextInt(99999999)+99999, "Jose", "Rocklin");
       HotDogStand stand3 = new HotDogStand(rand.nextInt(99999999)+99999, "Jose", "Folsom");
      //ordering hot dogs at different stand
       stand1.order(100);
       stand2.order(150);
       stand3.order(175);
       //claculating the income form the stations
       double stand1Income = stand1.income();
       double stand2Income = stand2.income();
       double stand3Income = stand3.income();
       //getting the total number of the hotdogs orderd at all the stations
       int total = stand1.getCountSold() + stand2.getCountSold()+ stand3.getCountSold() ;
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
*/