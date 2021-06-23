package Assignment_Stack;

import java.util.Stack;

public class Stack_Assignment {
	
	static void stack_push (Stack<Integer> stack) {
		System.out.println("Push Operation:");
		for (int i = 0; i < 7; i++) {
			stack.push(i);
		}
		System.out.println(stack);
	}
	
	static void stack_pop (Stack<Integer> stack, int element) {
		System.out.println("Pop Operation:");
		for (int i = 0; i < 7; i++) {
			Integer y = (Integer) stack.pop();
			if (y.equals(element)) {
				System.out.println(y);
			}
		}
	}
	
	static void stack_peek (Stack<Integer> stack) {
		Integer element = (Integer) stack.peek();
		System.out.println("Element on stack top: " + element);
	}
	
	static void stack_search (Stack<Integer> stack, int element) {
		System.out.println(stack);
		int pos = (Integer) stack.search(element);
		if (pos == -1) {
			System.out.println("Element not found");
		}
		System.out.println("Element is found at position: " + pos);
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack_push(stack);
		stack_pop(stack, 3);
		stack_push(stack);
		stack_peek(stack);
		stack_search(stack, 2);
	}

}
