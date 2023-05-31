import java.util.*;
public class Stack{
    //stack using ArrayList
    static class StackA {
       static ArrayList<Integer> list = new ArrayList<>();

       public static boolean isEmpty(){
        return list.size() == 0;
       }

       //push
       public void push(int data){
            list.add(data);
       }

       //pop
       public static int pop(){
        if(isEmpty()){
            return -1;
        }

        int top = list.get(list.size() - 1);
        list.remove(list.size()-1);
        return top;
       }

       //peek
       public int peek(){
        if(isEmpty()){
            return -1;
        }

        return list.get(list.size() - 1);
       }
    }

    //Stack using Linked List
    // static class stackL {

    //     static class Node {
    //         int data;
    //         Node next;

    //         Node (int data){
    //             this.data = data;
    //             this.next = null;
    //         }
    //     }

    //     static class stack {
    //         static Node head = null;

    //         public static boolean isEmpty(){
    //             return head == null;
    //         }

    //         //push
    //         public static void push(int data){
    //             Node newNode = new Node(data);
    //             if(isEmpty()){
    //                 head = newNode;
    //                 return;
    //             }
    //             newNode.next = head;
    //             head = newNode;

    //         }

    //         //pop
    //         public static int pop(){
    //             if(isEmpty()){
    //                 return -1;

    //             }
    //             int top = head.data;
    //             head = head.next;
    //             return top;
    //         }

    //         //peek
    //         public static int peek(){
    //             if(isEmpty()){
    //                 return -1;

    //             }
    //             return head.data;
    //         }

    //     }
    // }

    public static void main(String[] args) {
        StackA s = new StackA();
        s.push(1);
        System.out.println(s.peek());
    }
}