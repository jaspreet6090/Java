
import java.util.LinkedList;
import java.util.*;

class InterLeave {
	static void interLeaveQueue(Queue<Integer> q)
	{
	
	// To check the even number of elements
	if (q.size() % 2 != 0)
		System.out.println("Input even number of integers.");

	// Initialize an empty queue of int type
	Queue<Integer> temp=new LinkedList<>();
	int halfSize = q.size() / 2;

	// Push first half elements into the stack
	// queue:16 17 18 19 20, queue: 11 12 13 14 15
	for (int i = 0; i < halfSize; i++) {
		temp.add(q.peek());
		q.remove();
	}
	
	// enqueue back the queue elements alternatively
	// queue: 11 16 12 17 13 18 14 19 15 20
	while (!temp.isEmpty()) {
		q.add(temp.peek());
		q.add(q.peek());
		q.remove();
		temp.remove();
	}
	
	}
	
	
	public static void main (String[] args) {
	Queue<Integer> q=new LinkedList<>();
	q.add(1);
	q.add(2);
	q.add(3);
	q.add(4);
	q.add(5);
	q.add(6);
	q.add(7);
	q.add(8);
	q.add(9);
	q.add(10);
	interLeaveQueue(q);
	int length = q.size();
	for (int i = 0; i < length; i++)
	{
		System.out.print(q.peek() + " ");
		q.remove();
	}
	}
}


