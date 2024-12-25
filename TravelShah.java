/*
name: Dharmang Shah     
date:6 October,2023
program description: This program calculates the cost and the time to travel to your destination via gas and electric cars
self garde: 100%, as I have followed all the metioned rubrics.
*/
import java.util.Scanner;
//You will not be graded if you miss to change the "AssignmentLastName" to another name 
public class TravelShah//<- change the name "AssignmnetLastName" to a proper name, and include your last name also   
{
  /* the complete main method is given do not make any channges*/ 
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      description();
      System.out.print("How many time do you want to use the app: ");
      int count = kb.nextInt();
      for(int j = 1; j <= count; j++)
      {   
         gasTravel(kb);
         for(int i = 1; i <= 50; i++)
            System.out.print("-");
         System.out.println();   
         electricTravel(kb);
         for(int i = 1; i <= 50; i++)
            System.out.print("-");
         System.out.println();
      } 
      System.out.println("GOOD BYE");   
   }
   /*This method calculates the total cost charging the battery, Stops represents the number of the charges*/
   public static double chargeCost(int stops, double pricePerCharge)
   {
      double cost = pricePerCharge*stops;
      return cost;  // <--- must be changed
   }
   /*This method caluclates the total monet spend on the gas to travel */
   public static double gasCost(double distance, double milesPerGallon, double costPerGallon)
   {
      double cost = (distance/milesPerGallon)*costPerGallon;
      return cost;// <----- must be changed
   }
   /*This method caluclates the number of the stops needed to charge the battery.
    milePerCharge represents the number of the miles  driven with a fully charged battery*/ 
   public static int stops(double distance, double milePerCharge)
   {
      double stopsReq = distance/milePerCharge;
      int stopsTaken = (int)stopsReq;
      return stopsTaken; // <-----must be changed
   }
   /*This method caluclate the hours of travel taking your gas car*/
   public static double travelHoursGasCar(double distance , double speed)
   {
      double time = distance/speed;
      return time; // <------ must be changed
   }
   /*
   This method calculates the hours traveling using your electric car
   stops represenst the number of the times the car needs to be charged
   hoursPerStop represents the time it takes to fully charge your car
   distance represents the total distace traveled
   speed represents the speed of the car
   */
   public static double travelHoursWithElectricCar(int stops, double hoursPerStop, double distance, double speed)
   {
      double time = (stops*hoursPerStop)+(distance/speed);
      return time; //<-----must be changed
   }
   /*This method calculates the cost and the time to travel with a gas car*/
   public static void gasTravel(Scanner kb)
   {
      System.out.println("\nTraveling with a gas car\n");
      //prompt the user to enter the number of the miles to travel 
      System.out.print("Enter the total number of the miles you are traveling: ");
      //declare a varibale and read the user's input
      double distance = kb.nextDouble();
      //1. prompt the user to enter the speed
      System.out.print("Enter the speed with which you are traveling: ");
      //2. declare a variable and read the user's input
      double speed = kb.nextDouble();
      //3. prompt the user to enter the miles per gallon
      System.out.print("Enter the miles per gallon the car can travel: ");
      //4. declare a variable and read the user's input
      double milePerGallon = kb.nextDouble();
      //5. prompt the user to enter the cost per gallon
      System.out.print("Enter the cost of one gallon of fuel: ");
      //6. declare a variable and read the user's input
      double costPerGallon = kb.nextDouble();
      //7. call the method travelWithGas and pass the proper parameters  
      //public static double travelHoursGasCar(double distance , double speed)
      double time = travelHoursGasCar(distance,speed);
      //8. call the method getCost and pass the proper parameters
      //public static double gasCost(double distance, double milesPerGallon, double costPerGallon)
      double cost = gasCost(distance,milePerGallon,costPerGallon);
      //display the hours of travle and the cost of the travel 
      System.out.println("\nTraveingl with your gas car: ");
      //display  the result you got at step 7
      System.out.println("Time taken by your gas car: "+time);
      //display the result you got at step 8
      System.out.println("Cost of taking your gas car: "+cost); 
   }
   public static void electricTravel(Scanner kb)
   {
      System.out.println("\nTraveling with an electric car\n");
      System.out.print("Enter the total number of the miles you are traveling: ");
      double distance = kb.nextDouble();
      //prompt the user to enter the speed
      System.out.print("Enter the speed with which you are traveling: ");
      //declare a variable to read the speed
      double speed = kb.nextDouble(); 
      //prompt the user to enter the miles that can be driven with a fully charged battery
      System.out.print("Enter the total number of the miles you can go 1 full charge: ");
      //declare a variable and read the input
      double milesPerCharge = kb.nextDouble();       
      //1.prompt the user to enter the number of the hours it takes to fully chare the car battery
      System.out.print("Enter the time it takes to fully charge the battery: ");
      //2.declare a variable and read the user's input 
      double time = kb.nextDouble();
      //3.propmt the user to enter the cost per battery charge
      System.out.print("Enter the cost per battery charge: ");
      //4.declare a variable and read the user's input
      double costPerStop = kb.nextDouble();
      //5.call the method stops with the proper parameters
      //public static int stops(double distance, double milePerCharge)
      int stopsTaken = stops(distance,milesPerCharge);
      //6.call the method travelHourWithElectric with the proper parameters
      //public static double travelHoursWithElectricCar(int stops, double hoursPerStop, double distance, double speed)
      double hoursElectric = travelHoursWithElectricCar(stopsTaken,time,distance,speed);
      //7.call the method  chargeCost with the proper parameters 
      //public static double chargeCost(int stops, double pricePerCharge)
      double totalCost = chargeCost(stopsTaken,costPerStop);
      System.out.println("\nTraveling with your electric car\n");
      
      //display the results that you got in step 6 
      System.out.println("Time taken by your electric car: "+hoursElectric);
      //display the result from step 7   
      System.out.println("Cost of taking your electric car: "+ totalCost);
   }
/* feel free to change the code in this method*/
   public static void description()
   {
      for(int i = 1; i <= 80; i++)
         System.out.print("-");
      System.out.println();
      System.out.println("This program calculates the cost and the time to travel to your destination ");
      System.out.println("given the needed information for both gas car and the electric car.");
      System.out.println("Just answer some simple questions"); 
      for(int i = 1; i <= 80; i++)
         System.out.print("-");
      System.out.println();
   }
}