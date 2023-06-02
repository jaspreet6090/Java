import java.util.*;
import java.util.LinkedList;
public class DequeImplement{
    static class Stack{
        Deque <Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addLast(data);
        }

        public int pop() {
            return deque.removeLast();
        }

        public int peek() {
            return deque.getLast();
        }
    }

    static class Queue{
        Deque <Integer> deque = new LinkedList<>();

        public void add(int data) {
            deque.addLast(data);
        }

        public int remove() {
            return deque.removeFirst();
        }

        public int peek() {
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        System.out.println(s.peek());
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        System.out.println(q.peek());

    }
}