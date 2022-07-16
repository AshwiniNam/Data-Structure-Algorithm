import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] span = solve(a);
    display(span);
 }

 public static int[] solve(int[] arr){
   int n = arr.length;
   int[] ans = new int[n];
   Stack<Integer> st = new Stack<>();
   
   for(int i=0;i<n;i++)
   {
     //int count =0;
    //  if(st.size()==0)
    //  {
    //   ans[i] = i+1;
    //  }
    //  else if(arr[i]>st.peek())
    //  {
       
        while(st.size()>0 && arr[i]>arr[st.peek()])
        {
          st.pop();
          //count+=1;
        }
        if(st.size()==0)
        {
          ans[i] = i+1;
        }
        else
        {
          //ans[i]=count+1;
          ans[i]=i-st.peek();
        }
    //  }
    //  else
    //   {
    //     ans[i]=1;
    //   }
      st.push(i);
   }
   return ans;
 }
}