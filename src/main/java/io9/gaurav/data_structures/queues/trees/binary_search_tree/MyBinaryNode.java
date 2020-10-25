package io9.gaurav.data_structures.queues.trees.binary_search_tree;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MyBinaryNode {
	
	private int value;
	private MyBinaryNode left;
	private MyBinaryNode right;
	
	
	public MyBinaryNode(int value, MyBinaryNode left, MyBinaryNode right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

}
