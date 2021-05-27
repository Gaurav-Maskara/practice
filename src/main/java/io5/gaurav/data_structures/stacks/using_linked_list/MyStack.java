package io5.gaurav.data_structures.stacks.using_linked_list;

public class MyStack {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(5);
		stack.printStack();
		stack.push(3);
		stack.push(4);
		stack.printStack();
		stack.peak();
		stack.pop();
		stack.pop();
		stack.printStack();
	}

	private MySinglyLinkedNode top;
	private MySinglyLinkedNode bottom;
	int length;

	public MyStack() {
		this.top = null;
		this.bottom = null;
		this.length = 0;
	}

	public void push(int value) {
		MySinglyLinkedNode valueToInsert = new MySinglyLinkedNode(value, null);

		valueToInsert.setNext(top);
		top = valueToInsert;
	}

	public void printStack() {
		MySinglyLinkedNode pointer = top;
		while (pointer != null) {
			if (pointer.getNext() != null) {
				System.out.print(pointer.getValue() + "-->");
			} else {
				System.out.print(pointer.getValue());
			}
			pointer = pointer.getNext();
		}
		System.out.println();
	}

	public void pop() {
		MySinglyLinkedNode pointer = top;
		System.out.println("Popping top value ---> " + pointer.getValue());
		top = pointer.getNext();
	}
	
	public void peak() {
		MySinglyLinkedNode pointer = top;
		System.out.println("Peek top value ---> " + pointer.getValue());
	}
	
	

}
