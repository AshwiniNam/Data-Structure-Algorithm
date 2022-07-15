import java.io.*;
import java.util.*;

public class Main
{
   public static void main(String[] args) throws Exception 
   {
      Scanner scn = new Scanner(System.in);
      String str = scn.nextLine();
      System.out.println(balancedbrackets(str));
   }
   public static boolean balancedbrackets(String str)
   {
      Stack<Character> st = new Stack<>();
      for(int i=0;i<str.length();i++)
      {
         if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{' )
         {
            st.push(str.charAt(i));
         }
         else if(str.charAt(i)==')' || str.charAt(i)==']' || str.charAt(i)=='}')
         {
            if(str.charAt(i)==')' && st.size()>0 && st.peek()=='(')
            {
               st.pop();
            }
            else if(str.charAt(i)==']' && st.size()>0 && st.peek()=='[' )
            {
               st.pop();
            }
            else if(str.charAt(i)=='}'&& st.size()>0 && st.peek()=='{')
            {
               st.pop();
            }
            else
            {
               return false;
            }
         }
      }
      if(st.size()!=0)
         return false;
      else
         return true;
   }
}