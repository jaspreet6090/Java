
public class LinkedList2 {
    static public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
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
    // check cycle or not
    public static boolean isCycle() { //Floyd's algorithm
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                return true; // cycle exists
            }
        }
        return false; // cycle not exists
    }

    //Remove cycle
    public static void removeCycle() { 
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while ( fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next; 
            if(fast == slow) {
                cycle = true;
                break;
            }
        }
        if(cycle == false) {
            return;  // cycle not exists
        }
        //find meeting Point
        slow = head;
        Node prev = null; // last node
        while (slow!=fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //remove cycle  -> last.next = null
        prev.next = null;
    }

    //Merge Sort
    private  Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid node
    }
    
    private  Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null){
            if(head1.data == head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;

            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
             head1 = head1.next;
             temp = temp.next;

        } 
        while (head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }
    public  Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }

        //find mid 
        Node mid = getMid(head);
        //left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge 
        return merge(newLeft , newRight);

    }
    public static void main(String[] args) {
        LinkedList2 ll = new LinkedList2();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        //5->4->3->2->1->null
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());
        ll.printLL();
       ll.head = ll.mergeSort(ll.head);
       ll.printLL();
       
        
    }
}
