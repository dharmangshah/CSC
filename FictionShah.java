/*
Name: Dharmang shah
Date:16/10/23
Program description: This program helps us to write a story by answering some simple questions.
Self grade: 100%, as i have followed all the criterion and the rubrics.
Testimonial: I have written the code and did not get help from unauthorized
resources: Dharmang Shah
*/
import java.util.Scanner;
public class FictionShah
{

   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      System.out.print("How many times do you want to run the code: ");
      int count = s.nextInt();
      s.nextLine();
      //This for loop helps us to run the program as many times as the user wants
      for(int i = 1; i <= count ; i++)
      {
         String yourStory = CreateStory(s);
         System.out.println(yourStory);
         System.out.println("\n");
         System.out.println("Your story in the reverse order is:");
         System.out.println(reverseStory(yourStory));  
         System.out.println("\n");      
      }
   }
   //the following method creates the story and returns it
   public static String CreateStory(Scanner s)
   {
      System.out.println("We are going to make a story together by asking some questions");
      
      System.out.println("Please enter any number between 10-100 :");
      int distance = s.nextInt();
      
      System.out.println("Please enter the name of any state:");
      String city1 = s.next();
      
      System.out.println("Please enter any name of a male character:");
      String name1 = s.next();
      
      System.out.println("Please enter the name of a side character:");
      String name2 = s.next();
      
      System.out.println("Please enter any time of the day in 24hr format:");
      double time1 = s.nextDouble();
      
      System.out.println("Please enter the name of any school:");
      String school = s.next();
      
      System.out.println("Please enter a name of any social media:");
      String media = s.next();
      
      System.out.println("Please enter any amount:");
      double amount = s.nextDouble();
      
      System.out.println("Please enter a new and different state: ");
      String city2 = s.next();
      
      System.out.println("Please enter any number in words:");
      String police = s.next();
      String pol = police.toUpperCase(); 
      
      System.out.println("Please enter any random number less than 10:");
      double random = s.nextDouble();
      double speed = Math.pow(random,3);
      
      String story = "Once upon a time in " + city1 + ", there lived a boy named " + name1 + " and his best friend " + name2 + ". \nThey both were classmates and were 18 years old.\nThey went to the same school named " + school + " and always hanged out together.\nOne day " + name2 + " got a message from his sibling on " + media + " that " + name1 + "'s younger brother was getting bullied by some seniors at the school.\n" + name2 + " informed all of this to " + name1 + ".\nAfter " + name1 + " came to know about this, he got aggravated and bought a pistol just to scare the seniors, he never intended to use it.\nHe bought it for $" + amount + ".\nThen onwards he went to his younger brother's school and saw the seniors who bullied him.\nHe tried talking with them calmly, but they won't listen ot him, so he removed his pistol to scare them and they were roughy " + distance + "m away from him.\nThey got into a fight and accidentally bullet got fired at the speed of " + speed + "mph and one of the seniors got shot and got injured permanently.\n" + name1 + " decided to run to a different city and went to " + city2 + ".\nUnfortunately the police came to know that he ran off to " + city2 + " and once he reached to that city even " + pol + " police officers were unable to catch him and he is living a life of a fled criminal since then.";

      return story;
   }
   //the following method reverses the story given to it in the paramerters
   public static String reverseStory(String story)
   {
        String reversedString = "";
        for (int i = story.length() - 1; i >= 0; i--) 
        {
            reversedString += story.charAt(i);
        }
      return reversedString;
    }
}
   
