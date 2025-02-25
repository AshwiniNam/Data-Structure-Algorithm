//Without using parameterized constructor for class pair

import java.io.*;
import java.util.*;

public class Main {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }
    }

    public static Node construct(int[] arr) {
        Node root = null;

        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }

                st.push(t);
            }
        }

        return root;
    }

    public static class Pair {
        Node no;
        int state;
    }

    public static void IterativePreandPostOrder(Node node) {
        String preorder = "";
        String postorder = "";
        Stack<Pair> st = new Stack<>();
        if (st.size() == 0) {
            Pair p = new Pair();
            p.no = node;
            p.state = -1;
            st.push(p);
        }
        while (st.size() > 0) {
            Pair top = st.peek();
            if (top.state == -1) {
                preorder = preorder + top.no.data + " ";
                top.state += 1;
            } else if (top.state == top.no.children.size()) {
                Pair rem = st.pop();
                postorder = postorder + rem.no.data + " ";
            } else {
                Pair p1 = new Pair();
                p1.no = top.no.children.get(top.state);
                p1.state = -1;
                st.push(p1);
                top.state = top.state + 1;
            }
        }

        System.out.println(preorder);
        System.out.println(postorder);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        Node root = construct(arr);
        IterativePreandPostOrder(root);
    }

}