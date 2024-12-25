import java.util.*;
public class InfixPostfix
{
   public static void main(String[] args)
   {
       String infix = "2 * 3 + 4 / 3 * 2 ?";
       String post = getPostfix(infix);
       System.out.println(post);
   }
   public static String getPostfix(String infix)
   {
     String post = "";
     Stack<String> stack = new Stack<>();
     Scanner token = new Scanner(infix);
     while(token.hasNext())
     {
        //read the first token
        String t = token.next();
        char c = t.charAt(0);
        //if the c is an operation(* + / -)
        if(c == '+' || c == '*' || c == '/' || c == '-')
        {
            //if c is * /
            if(c == '*' || c == '/')
            {
              //while the top of the stack is * or /
              while(!stack.empty() && (stack.peek().charAt(0) == '*' || stack.peek().charAt(0) == '/'))
              {
                 //pop the stack
                 String top = stack.pop();
                 //add it ot the postfix
                 post = post + " " + top;
                 
              }
              //push the t
              stack.push(t);
           }  
          // if token  is + or -
          else
          {
            //while the top of the stack is * / + - 
            while(!stack.empty() && (stack.peek().charAt(0) == '*' ||stack.peek().charAt(0) == '+'  ||stack.peek().charAt(0) == '/' || stack.peek().charAt(0) == '-'))
            {
               //pop the stack
               String top = stack.pop();
               //add it to th postfix
               post = post + " " + top;
            }
            //push the token to the stack
            stack.push(t);
          }
        }
        else
          //add it to the postfix: if the token is a number 
          post = post + " " + t;
     }
     //while tokens in the stack
     while(!stack.empty())
     {
      // pop the token
      String top = stack.pop();
      // add it to the postfix
      post = post + " " + top;
      }
     
     return post;
   }
}