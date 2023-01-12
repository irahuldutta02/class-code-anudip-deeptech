package StackExPackage;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stk = new Stack<>();
		stk.push(20);
		stk.push(50);
		stk.push(54);
		
		System.out.println(stk);
		System.out.println("Pop : "+stk.pop());
		System.out.println(stk);
		System.out.println(stk.search(90));// returns -1 when the element is not there
		System.out.println("Top element (peek) : "+ stk.peek());
		System.out.println(stk);

	}

}
