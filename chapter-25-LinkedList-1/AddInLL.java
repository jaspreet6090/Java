public class AddInLL {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node  tail;

    public void addFirst (int data) {
        //step 1 - create a new node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        } 
       // step2 = newNode next = head
       newNode.next = head; //link

       //step3 = head = newNode
       head = newNode;
    }

    public void addLast (int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        } 
        tail.next = newNode;
        tail = newNode;  
    }
    
    public static void main(String[] args) {
        AddInLL ll = new AddInLL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
    }
}