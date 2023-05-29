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

    //Iterative Search 
    public int itrSearch(int key){ //O(n)
        Node temp = head;
        if(size == 0){
            System.out.println("LL is empty");
            return -1;
        } else if(size == 1){ //head=tail
            return 0;
        }
        int i = 0;
        while(temp != null){
           if( temp.data == key){
                return i;
           }
           temp = temp.next;
            i++;

        }
        return -1;
    }

    //Search by recursion
    public int helper(Node head, int key){
        //base
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }

    //RESERSE LL
    //iterative
    public void reverse() { //O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    // Find and delte from Nth node
    public void deleteNthfromEnd(int n){
        //calculate size
        int sz = 0;
        Node temp =  head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if(n == sz) {
            head = head.next; //removeFirstNode
            return; 
        }

        //sz - n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next ;
        return;
    }


    //Palindrome
    public Node  findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while ( fast != null && fast.next != null ) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; //slow my middle 
    }

    public boolean checkPalindrome() {
        if(head == null || head.next == null){
            return true; 

        }
        //step1 - findmid
        Node middle = findMid(head);

        //step 2 - reverse 2nd half
        Node prev = null;
        Node curr = middle;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        Node right = prev; // right half heaqd
        Node left = head;

        //step3 - check left half and right half
        while (right != null) {
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args) { 
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);

        ll.printLL();
        // ll.addAtIndex(20, 2);
        // ll.printLL();
        // System.out.println(size);

        // int Index = ll.itrSearch(3);
        // int Index = ll.recSearch(3);
        // System.out.println(Index);

        // ll.reverse();

        // ll.deleteNthfromEnd(2);
        System.out.println(ll.checkPalindrome());
        

    }
}