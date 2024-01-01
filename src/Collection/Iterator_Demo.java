package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator_Demo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList s1 = new ArrayList();
s1.add("A");
s1.add("B");
s1.add("C");
s1.add("D");
s1.add("E");
System.out.println("original contents of s1:");
Iterator itr = s1.iterator();
while(itr.hasNext()) {
Object element = itr.next();
System.out.print(element + " ");
}
System.out.println();

	ListIterator litr = s1.listIterator();
	while(litr.hasNext()) {
		Object element = litr.next();
		litr.set(element + "+");
	}
	System.out.print("modified contents of s1: ");
	itr=s1.iterator();
	while(itr.hasNext()) {
		Object element = itr.next();
		System.out.print(element + " ");
	}
	System.out.println();
	System.out.print("modified list backwards: ");
	while(litr.hasPrevious()) {
		Object element = litr.previous();
		System.out.print(element + " ");
	}
	System.out.println();
			
	}

}