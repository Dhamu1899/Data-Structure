package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating queue using PriotityQueue class
				Queue<Integer>numbers=new PriorityQueue<>();
				//offer elements to the queue
				numbers.offer(5);
				numbers.offer(1);
				numbers.offer(2);
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