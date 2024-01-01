package Stack;


import java.util.Stack;

public class Stack_Empty_Method_Example {

	public static void main(String[] args) {
		// craeting an instance of Stack class
		
		Stack<Integer> stk = new Stack<>();
		
		boolean result = stk.empty();
		System.out.println("Is the stack empty? " + result);
		
		//push elements
		stk.push(78);
		stk.push(113);
		stk.push(90);
		stk.push(120);
		System.out.println("Elements in stack " + stk);
		 result = stk.empty();
		 
		System.out.println("Is the stack empty? " + result);

	}

}