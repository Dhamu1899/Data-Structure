package Queue;

import java.util.LinkedList;
import java.util.Queue;

class Queue_eg{
	public static void main(String[] args) {
//creating queue using linkedlist class
		Queue<Integer>numbers=new LinkedList<>();
		//offer elements to the queue
		numbers.offer(1);
		numbers.offer(2);
		numbers.offer(3);
	System.out.println("Queue:"+numbers);
	//acccess elements of the queue
	int accessedNumber=numbers.peek();
	System.out.println("Accessed element:"+accessedNumber);
	//remove elements from the queue
	int removedNumber=numbers.poll();
	System.out.println("Removed element:"+removedNumber);
	System.out.println("Updated Queue:"+numbers);
	}
}
