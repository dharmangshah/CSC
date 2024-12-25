public class exam
{
 public static void main(String[] args)  
 {
 boolean a1 = true,a2=false,a3=true;
 if(a1 && !a2 || a3)
         System.out.println("Path 2");
 if(a1 && a3 )
         System.out.println("path 3");
 if(!a1 && !a2 && !a3 || true)
         System.out.println("path 1"); 
}
}