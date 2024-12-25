/*
 * This program performs a decode/encode algorithm  which is a shift of characters in
 * a message by a gven shift key.  It allows our message to pass along  in the form of a secret message. If there are
   numbers in the message no change will be done to them. Refer to the sample output
  
 * The program serves as an example of Strings and the type char.
  
 Name:Dharmang shah   
 Date: 26 October,2023
 Self grade: 100% as i have followed all the criterion
 testimony: All the code is written by myself and I did not get any help from unauthorized resources Name:  
 */

import java.util.Scanner;
public class EncoderShah
{
  
}

class EncodeDecode 
{
   public static void main(String[] args) 
   {
      
      Scanner console = new Scanner(System.in);
      System.out.print("How many times to you want to use the app: ");
      String m1 = "Enter a message to Decode it: ";
      String m2 = "Enter a message to Encode it: ";
      int count = console.nextInt();
      console.nextLine();
      for(int i = 1; i <= count; i++)
      {
         menu();
         System.out.print("Enter your choice: ");
         String choice = console.next();
         console.nextLine();
         if (choice.equalsIgnoreCase("E"))
         {
            System.out.print(m2);
            String message = console.nextLine();
            String encoded = encode(message);             
            System.out.println("Your encoded message is: "+encoded);
         }
         else if (choice.equalsIgnoreCase("D"))
         {
            System.out.print(m1);
            String message = console.nextLine();
            String decoded = decode(message);
            System.out.println("Your decoded message is: "+decoded);
         } 
         else
            System.out.println("INVALID");    
      }
   }
   //This method provides the menu/options to the user.
   public static void menu()
   {
      System.out.println("To decode a message enter D.");
      System.out.println("To enccode a message enter E\n\n");
   }
   //This method encodes the given string.
   public static String encode(String message ) 
   {
      String encoded = "";
      int key = message.length();
      if (key>26)
         key = key/2;
      message = message.toLowerCase();
      int i;
      for (i=0;i<=(message.length()-1);i++)
      {
         char c = message.charAt(i);
         if (c == ' ')
         {
           c= ':';
         }        
         else if (c >='1' && c<='9')
         {
            c = c; 
         }     
          
         else if (c >='a' && c <='z')
         {
            c = (char) (c + key);
            if (c > 'z')
            {
              c = (char)(c-26); 
            }
            else if (c <'a')
            {
              c += 26;
            }
         }
         encoded += c;               	  	 
      }          
      return encoded;
   }
   //This method decodes the given string.
   public static String decode(String message) 
   {
   
      String decoded = "";
      int key = message.length();
      if (key > 26)
      {
       key = key/2;
      } 
      message = message.toLowerCase();
      int i;
      for (i=0;i<=(message.length()-1);i++)
      {
        char c = message.charAt(i);
         if (c == ':')
         {
           c= ' ';  
         }
         else if (c >='1' && c <= '9')
         {
           c = c;
         }  
         else if (c >='a' && c <= 'z')
         {
           c = (char)(c- key);
           if (c < 'a')
           {
            int diff=  'a' - c;
            c = (char) ('z' - diff + 1);
           }
            else if  (c > 'z')
            {
              int diff = 'z' - c;
              c = (char)('a'+ diff + 1);
            }               
         }
         decoded = decoded + c;
      }
      return decoded;
   }
}