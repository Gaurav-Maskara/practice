package io2.gaurav.data_structures.hash_tables;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyNode {
	
	private String key;
	private int value;
	
	public MyNode(String key, int value) {
		this.key = key;
		this.value = value; 
	}
	
}
