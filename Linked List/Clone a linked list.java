 public Node copyRandomList(Node head) {
        Node temp =head;
        Node nnn = new Node(head.val);
        Node newhead = nnn;
        Node p1 = nnn;
        nnn.next = null;
        while(temp.next != null)
        {
            temp = temp.next;
            Node n = new Node(temp.val);
            p1.next = n;
            n.next=null;
            p1=p1.next;
        }
        
        return newhead;