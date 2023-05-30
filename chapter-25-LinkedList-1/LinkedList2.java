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

    public static void main(String[] args) {
        
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        //1->2->3->1
        System.out.println(isCycle());
    }
}
