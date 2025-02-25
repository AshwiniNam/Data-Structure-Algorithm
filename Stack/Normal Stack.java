import java.io.*;
import java.util.*;

public class Main {

  public static class CustomStack {
    int[] arr;
    int tos;

    public CustomStack(int cap) {
      arr = new int[cap];
      tos = -1;
    }
    int size() {
      return tos+1;
    }

    void display() {
      for(int i=tos;i>=0;i--)
      {
        System.out.print(arr[i]+" ");
      }
      System.out.println();
    }

    void push(int val) {
      if(size()<=arr.length-1)
      {
        tos=tos+1;
        arr[tos]=val;
      }
      else
      {
        System.out.println("Stack overflow");
      }
    }

    int pop() {
      if(size()>0)
      {
        tos=tos-1;
        return(arr[tos+1]);
      }
      else
      {
        System.out.println("Stack underflow");
        return -1;
      }
    }

    int top() 
    {
      if(size()>0)
      {
        return(arr[tos]);
      }
      else
      {
        System.out.println("Stack underflow");
        return -1;
      }
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    CustomStack st = new CustomStack(n);

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("push")){
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if(str.startsWith("pop")){
        int val = st.pop();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("top")){
        int val = st.top();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("size")){
        System.out.println(st.size());
      } else if(str.startsWith("display")){
        st.display();
      }
      str = br.readLine();
    }
  }
}