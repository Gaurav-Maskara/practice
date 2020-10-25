package io7.gaurav.data_structures.queues.using_linked_list;

public class MyQueue {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.printQueue();
		queue.dequeue();
		queue.printQueue();
		queue.dequeue();
		queue.dequeue();
		queue.printQueue();
	}
	
	MySingleLinkedNode first;
	MySingleLinkedNode last;
	int length;
	
	public MyQueue() {
		this.first = null;
		this.last = null;
		this.length = 0;
	}
	
	public void enqueue(int value) {
		MySingleLinkedNode valueToAdd = new MySingleLinkedNode(value, null);
		MySingleLinkedNode temp = last;
		
		if(length == 0 ) {
			first = valueToAdd;
			first.setNext(last);
			last = valueToAdd;
		}else {
			temp.setNext(valueToAdd);
			last = valueToAdd;
		}
		length++;
	}
	
	
	public void printQueue() {
		MySingleLinkedNode pointer = first;
		while(pointer != null) {
			
			if(pointer.getNext() != null) {
				System.out.print(pointer.getValue() +"-->");
			}else {
				System.out.print(pointer.getValue());
			}
			pointer = pointer.getNext();
		}
		System.out.println();
	}
	
	public void dequeue() {
		System.out.println("Deque--->" + first.getValue());
		first = first.getNext();
		length--;
	}
	
}
