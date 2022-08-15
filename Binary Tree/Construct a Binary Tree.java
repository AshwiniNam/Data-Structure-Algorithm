// construct a binary tree (dummy code)
public class Node {
    int data;
    Node left;
    Node right;
}

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public class Pair {
        Node node;
        int state;
    }

public Pair(Node node,int state){
    this.node = node;
    this.state = state;
}

    Stack<Pair> st = new Stack();
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);st.push(rtp);

    int idx =0;

    while(st.size()>0)
{
    Pair top = st.peek();
    if(top.state == 1)
    {
        idx++;
        if(arr[idx]!=null)
        {
            top.node.left = new Node(arr[idx],null,null);
            Pair p = new Pair(top.node.left,1);
            st.push(p);
        }
        else
        {
            top.node.left = null;
        }
        top.state++;
    }
    else if(top.state == 2)
    {
        idx++;
        if(arr[idx]!=null)
        {
            top.node.right = new Node(arr[idx],null,null);
            Pair p = new Pair(top.node.right,1);
            st.push(p);
        }
        else
        {
            top.node.right = null;
        }
        top.state++;
    }
    else
    {
        st.pop();
    }
    return root;
}
