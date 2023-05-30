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

    // public void addFirst(int data) {
    //     // step 1 - create a new node
    //     Node newNode = new Node(data);
    //     size++;
    //     if (head == null) {
    //         head = tail = newNode;
    //         return;
    //     }
    //     // step2 = newNode next = head
    //     newNode.next = head; // link

    //     // step3 = head = newNode
    //     head = newNode;
    // }

    // public void printLL() { // O(n)
    //     if (head == null) {
    //         System.out.println("LL is empty");
    //         return;
    //     }
    //     Node temp = head;
    //     while (temp != null) {
    //         System.out.print(temp.data + "->");
    //         temp = temp.next;
    //     }
    //     System.out.println("null");
    // }

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

    public static void main(String[] args) {
        
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(4);
        head.next.next.next = temp;
        //1->2->3->1
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
