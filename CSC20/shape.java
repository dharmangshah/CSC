public abstract class shape
{
 private int x,y;
 public shape(int x,int y)
 {
  this.x=x;
  this.y=y;
 }
 public String toString()
 {
  return "("+x+","+y+")";
 }
 public abstract double area();
}
class circle extends shape
{
 private double radius;
 public circle(int x,int y, double radius)
 {
  super(x,y);
  this.radius=radius;
 }
 public double area()
 {
  return Math.PI*radius*radius;
 }
 public String toString()
 {
  return super.toString()+","+radius;
 }
}
class rectangle extends shape
{
 private double width,height;
 public rectangle(int x, int y, double height, double width)
 {
  super(x,y);
  this.height= height;
  this.width= width;
 }
 public double area()
 {
  return height*width;
 }
}
class driver
{
 public static void main(String[] args)
 {
  shape[] s =new shape[3];
  s[0] = new circle(2,3,5.6);
  System.out.println(s[0].toString());
  s[1] = new rectangle(3,4,5,6);
  for (int i=0;i<=1;i++)
  {
   System.out.println(s[i].area());
  }
  shape s1 = new circle(3,34,5.6);
  circle c = new circle(12,43,54.6);
  System.out.println(c.area());
  Object o =new circle(3,4,5);
  if (o instanceof circle)
  {
   circle d = (circle)o;
  }
  Object[] o1 =new Object[3];
  o1[0] = new circle(1,2,3);
  o1[1] = new circle(2,3,4);
  o1[2] = new rectangle(1,2,3,4);
  for (int i=0;i<=2;i++)
  {
   if (o1[i] instanceof circle)
   {
    circle c1 = (circle)o1[i];
    double area = c1.area();
   }
   if (o1[i] instanceof rectangle)
   {
    rectangle c2 = (rectangle)o1[i];
    double area = c2.area();
   }
  }
 }
}