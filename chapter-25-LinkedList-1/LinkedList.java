public class LinkedList {
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
    public static int size;

    public void addFirst (int data) {
        //step 1 - create a new node
        Node newNode = new Node(data);
        size++;
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
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        } 
        tail.next = newNode;
        tail = newNode;  
    }
    public void printLL(){ //O(n)
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
        temp = temp.next;
        }
        System.out.println("null");
    }

    public void addAtIndex(int data,int index){
        if(index == 0){
            addFirst(data);
            return;  
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;
        while(i < index-1 ){
            temp = temp.next;
            i++;
        } 
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1 ){
            int val = head.data;
            head =  tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1 ){
            int val = head.data;
            head =  tail = null;
            size = 0;
            return val;
        }
        //pev = i = size-2
        int i =0;
        Node temp = head;
        while(i < size-2){
           temp = temp.next;
           i++;
        }
        int val = temp.next.data; //tail data
        temp.next = null;
        tail = temp;
         size--;
        return val;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        ll.printLL();
        ll.addAtIndex(20, 2);
        ll.printLL();
        System.out.println(size);

    }
}