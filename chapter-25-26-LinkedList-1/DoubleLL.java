public class DoubleLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //add first in doubly linked list
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //add last in doubly linked list
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    //remove first
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
        head.prev = null;
       
        size--;
        return val;
    }

    //remove last 
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
         
         Node temp = head;
         Node temp2;
         while(temp.next != null){
            temp = temp.next;
         }
         temp2 = temp.prev;
         int val = temp.data; //tail data
         temp2.next = null;
         temp.prev = null;
         temp2 = tail;
        
          size--;
         return val;
    }

    //print dll
    public void printDll(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"<->");
         temp = temp.next;
        }
        System.out.println("null");
    }

    //reverse
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();

        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.addLast(4);
        dll.addLast(5);

      // dll.removeFirst();
       // dll.removeLast();
        dll.printDll();

       // dll.reverse();

        //dll.printDll();
        
    }
}
