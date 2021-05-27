package io3.gaurav.data_structures.linked_lists.singly;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MySinglyLinkedNode {
	
	private int value;
	private MySinglyLinkedNode next;
	
	public MySinglyLinkedNode(int value, MySinglyLinkedNode next) {
		this.value = value;
		this.next = next;
	}
	
	
	

}
