import java.io.*;
import java.util.*;

public class Main {

  public static class MinStack {
    Stack<Integer> data;
    int min;

    public MinStack() {
      data = new Stack<>();
    }

    int size() {
      return data.size();
    }

    void push(int val) {
      if(data.size()==0){
        min=val;
        data.push(val);
      }
      else if(data.size()>0 && min>val)
      {
        int x = val +(val - min);
        min =  val;
        data.push(x);
      }
      else{
        data.push(val);
      }   
    }

    int pop() {
      int ans =0;
      if(data.peek()<min)
      {
        ans = min;
        min =2*min -data.peek();
        data.pop();
      }
      else{
      ans = data.pop();
      }
      return ans;
    }

    int top() {
      int k =0;
      if(data.peek()<min)
      {
        return min;
      }
      return data.peek();
    }

    int min() {
      return min;
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    MinStack st = new MinStack();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("push")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if (str.startsWith("pop")) {
        int val = st.pop();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("top")) {
        int val = st.top();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(st.size());
      } else if (str.startsWith("min")) {
        int val = st.min();
        if (val != -1) {
          System.out.println(val);
        }
      }
      str = br.readLine();
    }
  }
}