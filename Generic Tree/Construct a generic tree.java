//Dummy code - Contruct a generic tree (with class and construct function)
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
            if(st.size>0)
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
}

//here input arr whould be [1,2,5,-1,6,-1,-1,3,7,-1,-1,-1]