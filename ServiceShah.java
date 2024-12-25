/*
Name: Dharmang shah     
Description: this code is about a mechanic shop and it helps to calculate the total bill.
self -grade: 100%, as I have entered comments wherever necessary.
I have done all the code by myself and did not get help from unauthorized resources. Name - Dharmang Shah
*/
public class ServiceShah
{
}
//A service quote for a mechanic shop is created using this class. Every part that is repaired by a mechanic has a cost associated with it, as well as a labour charge. Customers can receive a discount by using a coupon.
class ServiceQuote
{
   private String name;
   private String part;
   private double partCharge;
   private double laborCharge;
   private double coupon;
   public ServiceQuote(String n, double pPrice, double LPrice, String p, double c)
   {
      name = n;
      partCharge = pPrice;
      laborCharge = LPrice;
      part = p;
      coupon = c;
   }   
   //This method returns name 
   public String getName()
   {
    return name;
   }
   //This method returns partCharge 
   public double getPartCharge()
   {
    return partCharge;
   }
   //This method returns laborCharge
   public double getLaborCharge()
   {
    return laborCharge;
   }
   //This method returns part
   public String getPart()
   {
    return part;
   }
   //This method returns coupon
   public double getCoupon()
   {
    return coupon;
   }
   //This method determines the overall cost by adding the labour and part charges.
   public double getTotal()
   {
      double total;
      total = partCharge+laborCharge;
      return total;
   }
   //With this method, the total is determined after the coupon is applied.
   public double getTotalAfterDiscount()
   {
      double cost;
      cost = getTotal() - getDiscount();
      return cost;
   }
   //This method uses the coupon to determine how much of a discount there is.
   public double getDiscount()
   {
      double discount;
      discount = getTotal() * coupon / 100;
      return discount;
   }
   //This method changes the coupon value.
   public void setCoupon(double newCoupon)
   {
      coupon = newCoupon;
   }
   //This method changes the name.
   public void setName(String n)
   {
      name = n;
   }
   //This method changes the part charge cost.
   public void setPartCharge(double newCharge)
   {
      partCharge = newCharge;
   }
   //This method changes the labor charge cost.
   public void setLaborCharge(double newLaborCharge)
   {
      laborCharge = newLaborCharge;
   }
   //This method changes the part.
   public void setPart(String newPart)
   {
      part = newPart;
   }
   //generates and returns a String that represents a ServiceQuote object.
   public String toString()
   {
      double discount = getDiscount();
      double cost = getTotal();
      double finalCost = cost-discount;
      String s ="Welcome to " + name + " mechanic shop\n" +  "Summary of charges\n";
      s = s + "Part: " + part+ "\n";
      s = s + "Parts charge: " + partCharge +"\n";
      s = s + "Labor charge: " + laborCharge +"\n";
      s = s + "Discount: " + coupon +"\n";
      s = s + "Discount amount: " + discount+"\n";
      s = s + "Total: " + cost +"\n";
      s = s + "Total after discount: " + finalCost +"\n";
      s = s + "______________________________________________\n";
      return s;
   }
}
class YourDriver
{
   public static void main(String[] args)
   {
      ServiceQuote brake = new ServiceQuote("Honda",400,300, "Brake", 15);
      ServiceQuote transmission = new ServiceQuote("Honda",700,400, "Transmission", 10);
      ServiceQuote lights = new ServiceQuote("Honda",835,577, "lights", 10);
      ServiceQuote clutch= new ServiceQuote("Honda",900,300, "clutch", 15);
      System.out.println(brake);
      System.out.println(transmission);
      System.out.println(lights);
      System.out.println(clutch);
      double finalCost = brake.getTotalAfterDiscount() + transmission.getTotalAfterDiscount()+lights.getTotalAfterDiscount()+clutch.getTotalAfterDiscount();
      System.out.println("Amount to pay: "+ finalCost);
      brake.setCoupon(20);
      transmission.setPartCharge(345);
      lights.setLaborCharge(740);
      clutch.setCoupon(20);
      System.out.println("\n\nAfter making changes:\n***************************************************\n ");
      System.out.println(brake);
      System.out.println(transmission);
      System.out.println(lights);
      System.out.println(clutch);
      finalCost = brake.getTotalAfterDiscount() + transmission.getTotalAfterDiscount()+lights.getTotalAfterDiscount()+clutch.getTotalAfterDiscount();
      System.out.println("Amount to pay: "+ finalCost);
   }
}
class Driver
{
   public static void main(String[] args)
   {
      ServiceQuote brake = new ServiceQuote("Midas",300,500, "Brake", 20);
      ServiceQuote transmission = new ServiceQuote("Midas",199,355, "Transmission", 12);
      ServiceQuote lights = new ServiceQuote("Midas",355,657, "lights", 20);
      ServiceQuote clutch= new ServiceQuote("Midas",700,500, "clutch", 15);
      System.out.println(brake);
      System.out.println(transmission);
      System.out.println(lights);
      System.out.println(clutch);
      double finalCost = brake.getTotalAfterDiscount() + transmission.getTotalAfterDiscount()+lights.getTotalAfterDiscount()+clutch.getTotalAfterDiscount();
      System.out.println("Amount to pay: "+ finalCost);
      brake.setCoupon(40);
      transmission.setPartCharge(155);
      lights.setLaborCharge(450);
      clutch.setCoupon(25);
      System.out.println("\n\nAfter making changes:\n***************************************************\n ");
      System.out.println(brake);
      System.out.println(transmission);
      System.out.println(lights);
      System.out.println(clutch);
      finalCost = brake.getTotalAfterDiscount() + transmission.getTotalAfterDiscount()+lights.getTotalAfterDiscount()+clutch.getTotalAfterDiscount();
      System.out.println("Amount to pay: "+ finalCost);
   }
}
