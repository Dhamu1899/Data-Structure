package Stack;

import java.util.Stack;

public class Stack_Splitting {
	static void reversePrint(Stack<Integer>s) {
		if(s.isEmpty())
			return;
		int x=s.peek();
		s.pop();
		System.out.print(x+" ");
		reversePrint(s);
		s.push(x);

	}

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<Integer>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println("Stack element in forward");
		System.out.println(st);
		System.out.println("Stack element in reverse");
		reversePrint(st);
		System.out.println();
		System.out.println(st);
		
	}

}
