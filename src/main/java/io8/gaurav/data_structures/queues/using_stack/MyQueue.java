package io8.gaurav.data_structures.queues.using_stack;

import java.util.Stack;

public class MyQueue {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.enqueue(10);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.printQueue();
		queue.dequeue();
		queue.printQueue();
		queue.dequeue();
		queue.printQueue();
	}
	
	private Stack<Integer> stack = new Stack<>();
	private Stack<Integer> auxiliaryStack = new Stack<>();
	
	
	public void enqueue(int value) {
		stack.push(value);
	}
	
	public void printQueue() {
		fillAuxiliaryStackWithStack();
		
		Object[] values = auxiliaryStack.toArray();
		for(Object value : values) {
			System.out.print("-->" + value);
		}
		System.out.println();
		fillStackWithAuxiliaryStack();
	}
	
	
	public void dequeue() {
		fillAuxiliaryStackWithStack();
		System.out.println("Dequeue -->" + auxiliaryStack.pop());
		fillStackWithAuxiliaryStack();
	}
	
	private void fillAuxiliaryStackWithStack() {
		while(!stack.isEmpty()) {
			auxiliaryStack.push(stack.pop());
		}
	}
	
	 private void fillStackWithAuxiliaryStack() {
		 while(!auxiliaryStack.isEmpty()) {
			stack.push(auxiliaryStack.pop());
		 }
	 }
	

}
