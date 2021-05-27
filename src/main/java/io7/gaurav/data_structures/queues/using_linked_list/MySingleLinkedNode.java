package io7.gaurav.data_structures.queues.using_linked_list;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
class MySingleLinkedNode {

	private int value;
	private MySingleLinkedNode next;
	
	public MySingleLinkedNode(int value, MySingleLinkedNode node) {
		this.value = value;
		this.next = node;
	}
	
}
