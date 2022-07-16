import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    Stack<Integer> st = new Stack<>();
    int[] rs = new int[n];
    for(int)




    int[] ls = new int[n];
    




    int max = Math.MIN_VALUE;
    for(int i=0;i<n;i++)
    {
      int height = a[i];
      int width = ls+rs-1;
      max = Math.max(max,height*width);
    }
    System.out.println(max);
    }
 }
}