package Dequeue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Array_Deque_01_Remove_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayDeque<String>animals=new ArrayDeque<>();
animals.add("Dog");
animals.add("Cat");
animals.add("Cow");
animals.add("Horse");
animals.add("Hen");
animals.add("Tiger");
animals.add("Lion");
/*System.out.println("Array deque:"+animals);
//using remove
String element=animals.remove();
System.out.println("removed element:"+element);
System.out.println("New array deque:"+animals);
//uusing remove(element)
 	animals.remove("Cow");
	System.out.println("New array deque:"+animals);
	//using remoiveFIrst()
	String firstElement=animals.removeFirst();
	System.out.println("Removed first element:"+firstElement);
	//using remove last()
	String lastElement=animals.removeLast();
	System.out.println("Removed first element:"+lastElement);
	
	System.out.println("NEw array deque:"+animals);
	animals.clear();
	System.out.println("NEw array deque:"+animals);*/
    System.out.println("\nArrayDeque :");
    Iterator<String>iterate=animals.iterator();
    while(iterate.hasNext()) {
    	System.out.print(iterate.next());
    	System.out.print(", ");
    }
    System.out.println("\nArrayDeque in reverse order :");
    Iterator<String>desiterate=animals.descendingIterator();
    while(desiterate.hasNext()) {
    	System.out.print(desiterate.next());
    	System.out.print(", ");
    }
 
	}	}