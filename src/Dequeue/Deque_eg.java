package Dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//creating deque using the arraydeque class
		Deque<Integer>numbers=new ArrayDeque<>();
		//add elements to the deque
		numbers.offer(1);
		numbers.offerLast(2);
		numbers.offerFirst(3);
		System.out.println("Deque:"+numbers);
		//access elements to the deque
		int firstElement = numbers.peekFirst();
		System.out.println("First element:"+firstElement);
	int LastElement = numbers.peekLast();
	System.out.println("Last element:"+LastElement);
//remove elements from the deque
	int removedNumber1=numbers.pollFirst();
	System.out.println("removed first element:"+removedNumber1);
	int removedNumber2=numbers.pollLast();
	System.out.println("removed Last element:"+removedNumber2);
	System.out.println("Updated deque:"+numbers);
	}
}