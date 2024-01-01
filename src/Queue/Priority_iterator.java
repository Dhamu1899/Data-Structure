package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating queue using PriotityQueue class
				Queue<Integer>numbers=new PriorityQueue<>();
				//offer elements to the queue
				numbers.offer(4);
				numbers.offer(2);
				numbers.offer(1);
			System.out.print("Printing Queue using iterator():");
			//using the iterator method
Iterator<Integer>iterate=numbers.iterator();
while(iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(",");
			}
	}
		}