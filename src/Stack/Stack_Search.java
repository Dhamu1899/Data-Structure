package Stack;

import java.util.ListIterator;
import java.util.Stack;



public class Stack_Search {

	public static void main(String[] args) {
		Stack<String> stk=new Stack<>();
		System.out.println(stk.isEmpty());
		stk.push("mac Book");
		stk.push("Hp");
		stk.push("Dell");
		stk.push("Asus");
		System.out.println("Stack:"+stk);
		
		int location=stk.search("Hp");
		System.out.println("Location of Dell: "+location);
		System.out.println("Size of the stack:"+stk.size());
		java.util.Iterator<String> iterator=stk.iterator();
		while(iterator.hasNext())
		{
			Object values=iterator.next();
			System.out.println(values);
		}
		System.out.println("\nFor Each:");
		stk.forEach(n->System.out.println(n));//java 8
		
		ListIterator<String>ListIterator=stk.listIterator(stk.size());
		System.out.println("\nIterator over the stack from top to"+"bottom");
		while(ListIterator.hasPrevious())
		{
			String avg=ListIterator.previous();
			System.out.println(avg);
		}
		}
	}


