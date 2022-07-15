import java.util.*;  
public class Main
{ 
   public static void main(String[] args) 
   {
      Scanner scn = new Scanner(System.in);
      String str = scn.nextLine();
      System.out.println(duplicateBrackets(str));
   }

   public static boolean duplicateBrackets(String str)
   {
      boolean flag = false;
      Stack<Character> stbr= new Stack<>();
      //System.out.println(str);
      for(int i=0;i<str.length();i++)
      {
         if(str.charAt(i)!=')')
            stbr.push(str.charAt(i));
         else
         {
            if(stbr.peek()=='(')
               return true;
            else
            {
               while(stbr.peek()!='(')
               {
                  stbr.pop();
               }
               stbr.pop();
            }
         }
      }
      return flag;
   }
}