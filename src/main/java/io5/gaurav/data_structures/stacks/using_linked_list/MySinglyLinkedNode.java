package io5.gaurav.data_structures.stacks.using_linked_list;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MySinglyLinkedNode {
	
	private int value;
	private MySinglyLinkedNode next;
	
	public MySinglyLinkedNode(int value, MySinglyLinkedNode next) {
		this.value = value;
		this.next = next;
	}

}
