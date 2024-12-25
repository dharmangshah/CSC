/*
Name- Dharmang Shah
Date- 22 September, 2023
Description- This program converts the chinese currency Yuan to dollars and tells us exactly in the different denominations.
Self grade- 100% as I have followed all the rubric and also given comments wherever neccesary.
*/
public class CoinConverterShah
{
   public static void main(String[] args)
   {
      description();
      convert();
   }
   //The description() method helps us to display the description the program to let the user know what does the program do.
   public static void description()
   {
      System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
      System.out.println("%                         Welcome to the Coin Converter                           %");
      System.out.println("%                      Tell me the number of yuan you have,                       %");
      System.out.println("% I will tell you the number of dollar bill, quarters, dimes, nickels and pennies %");
      System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
      System.out.println("\n\n");
   }
   //The conert() method helps us to do all the calculation and convert Yuan to Dollars.
   public static void convert()
   {
       int yuan = 1234;
       int pennies = (int)(yuan * .14 * 100);
       int originalPennies= pennies, dollarBills, quaters, dimes, nickels;//declaring all the required variable
       dollarBills = pennies/100;//counting number of dollars.
       pennies = pennies%100;//saving leftover pennies
       quaters = pennies/25;//counting number of quaters.
       pennies = pennies%25;//saving leftover pennies
       dimes = pennies/10;//counting number of dimes.
       pennies = pennies%10;//saving leftover pennies
       nickels = pennies/5;//counting number of nickels.
       pennies = pennies%5;//saving leftover pennies
       System.out.println("****************************************************");
       System.out.println("Here is the result:");
       System.out.println(yuan+" Yuan is equivalent to "+originalPennies+" U.S pennies");
       System.out.println(originalPennies + " pennies is equal to :");
       System.out.println(dollarBills +"\tdollars");//Printing number of dollars.
       System.out.println(quaters +"\tquaters");//Printing number of quaters.
       System.out.println(dimes +"\tdimes");//Printing number of dimes.
       System.out.println(nickels +"\tnickels");//Printing number of nickels.
       System.out.println(pennies +"\tpennies");//Printing number of pennies.
   }
}
