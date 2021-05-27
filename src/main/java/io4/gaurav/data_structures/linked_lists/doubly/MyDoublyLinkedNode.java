package io4.gaurav.data_structures.linked_lists.doubly;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyDoublyLinkedNode {
	
	private int value;
	private MyDoublyLinkedNode next;
	private MyDoublyLinkedNode previous;
	
	public MyDoublyLinkedNode (int value, MyDoublyLinkedNode next, MyDoublyLinkedNode previous) {
		this.value = value;
		this.next = next;
		this.previous = previous;
	}

}
