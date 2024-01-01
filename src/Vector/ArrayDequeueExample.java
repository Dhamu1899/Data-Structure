package Vector;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Deque<String>dq=new ArrayDeque<String>();
	dq.add("glenn");
	dq.add("Negan");
	dq.addLast("maggie");
	dq.addFirst("rick");
	dq.add("daryl");
	System.out.println("Elements in deque:"+dq);
	
	
	System.out.println("Remove element:"+dq.removeLast());
	
	System.out.println("Head:"+dq.element());
	
	System.out.println("poll():"+dq.pollLast());
	
	System.out.println("peek():"+dq.peek());
	
	System.out.println("Elements in Deque:"+dq);
	
	
	}
}