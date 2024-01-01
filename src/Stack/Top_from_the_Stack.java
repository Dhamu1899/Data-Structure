package Stack;

import java.util.Stack;

public class Top_from_the_Stack {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<String>stk=new Stack<>();
	//pushing elements into  stack
stk.push("Apple");
		stk.push("Grape");
				stk.push("Mango");
						stk.push("Orange");
System.out.println("stack"+stk);
//access elements from the top of the stack
String fruits=stk.peek();
//prints stack
System.out.println("Element at top:"+fruits);

	}

}