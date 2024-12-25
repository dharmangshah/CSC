/*
Name: Dharmang Shah
Description: this is a mountain climbing game.
self-grade: 100% as i have followed all the rubric and provided coments wherever necessary.
Testimony: I have written the code all by myself|: Dharmang Shah
*/
import java.util.*;
public class ClimbShah
{
}
class RockClimb
{
   public static final int MAX_HEIGHT = 30;
   public static void main(String [] args)
   {
      description();   
      execute();
   }
   public static void execute()
   {
      boolean b = true;
      Scanner kb = new Scanner (System.in);
      while(b)
      {
         climbUp(); 
         String user = yesNoAnswer(kb);
         kb.nextLine();
         if(user.equalsIgnoreCase("no"))
            b = false;
      }     
   }
   //This method asks the user if he/she wants to play the game again or not. 
   public static String yesNoAnswer(Scanner kb)
   {
      String user = "";
      while (!user.equals("yes") && !user.equals("no") ) 
      {
          System.out.println("Do you want to climb another mountain \nPlease enter yes or no: ");
          user =kb.next();
      }
      return user;
   }
  //This methods asks the user the height of the mountain.
  public static int getHeight()
   {
      Scanner kb = new Scanner (System.in);
      int h = 0;         
      do
      {
         System.out.println("Please enter the height of mountain: ");
         while(!kb.hasNextInt())
         {
            kb.nextLine();
            System.out.println("Please enter the height of mountain: "); 
         } 
         h = kb.nextInt();
         kb.nextLine();          
         if (h < 0)
         { 
            System.out.println("The height can not be nagtive!");
         }      
         if (h > MAX_HEIGHT)
         {
            System.out.println("The height can not be more than "+MAX_HEIGHT);
         }   
          
         }while(h < 0 || h > 30);  
         System.out.println("You are about to climb a mountain with the height " + h + ". Get set, ready go!"); 
         return h;
   
   }
   //this method decides how many and where will the person move on the mountain.
   public static void climbUp()
   {
      int distance = 0;
      int slip = 0; 
      int h = getHeight();
      
      int left = h;
      Random rand = new Random();  
      do 
      {
         int r = 0;
         int steps = 0;
         r = rand.nextInt(2);
         if (r == 0)
         {
            steps  = 0;
            steps = rand.nextInt(5) +1;
            if ((h- distance)< steps)
            {
             steps = h - distance; 
            }
            distance += steps;         
            System.out.println("You climbed up " + steps + " steps");
            left = h - distance;
            if (left > 0)
            {
               System.out.println("You are " + left + " steps away to reach the top of the mountain");
               System.out.println();
            }
            else
            {
               System.out.println("*************CONGRATULATIONS****************");
               System.out.println("You reached the top of the mountain!");
               System.out.println("While climbing you sliped " + slip + " times.");
               System.out.println("*********************************************\n");
            }     
            
         } 
         else if (r == 1) 
         { 
            if (distance > 0)
            { 
               
               int down = 0; 
               down = rand.nextInt(5)+1;
               if (down > (h - distance))
               {
                   down = h - distance;
               }
               System.out.println("Sorry you slipped down " + down +" step(s)"); 
               if(distance != 0 && distance > down)
               {        
                  distance = distance - down;
                  slip = slip + down;
               }
               else
               {
                  distance = 0;
               }       
               left = left + down;
               if(left > h)
                  left = h;
               System.out.println("You are " + left + " steps away to reach the top of the mountain"); 
            } 
         } 
         System.out.println("The distance moved up so far : " + distance);
         System.out.println();
      }while(distance < h);
   }
   //This method decribes the program.
   public static void description()
   {
   System.out.println("This is a mountain climbing game, you can either go up aor go down.");
   System.out.println("The computer will randomly decide if you go up or down and also how many steps you move.");
   System.out.println("You only need to enter the height of the mountain.");
   }
}