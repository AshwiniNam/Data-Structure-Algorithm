import java.util.*;
import java.io.*;
public class Main{
//create a Node class
public class Node{
    int data;
    ArrayList<Node> children = new ArrayList<>();
}
//create a function to construct a generic tree which returns root
public static Node construct(int[] arr){
    Node root = null;
    Stack<Node> st = new Stack<>();
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i] == -1)
        {
            st.pop();
        }
        else
        {
            Node t = new Node();
            t.data = arr[i];
            if(st.size()>0)
            {
                st.peek().children.add(t); //add new node t to the arraylist of parent(st.peek())
            }
            else
            {
                root = t;
            }
            st.push(t);
        }
    }
    return root;
}

public static void display(Node root){
    System.out.print(root+"->");
    for(int i=0;i<root.children.size();i++)
    {
        System.out.print(root.children.get(i).data+",");
    }
    System.out.println(".");
    for(int i=0;i<root.children.size();i++)
    {
        Node child = root.children.get(i);
        display(child);
    }
}

public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    display(root);
}
}
//here input arr whould be [1,2,5,-1,6,-1,-1,3,7,-1,-1,-1]
