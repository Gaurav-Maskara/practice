package io2.gaurav.data_structures.hash_tables;

import java.util.ArrayList;
import java.util.List;

public class MyHashTable {

	public static void main(String[] args) {
		MyHashTable table = new MyHashTable(50);
		table.set("ta", 1000);
		table.set("tu", 589);
		table.set("e", 10);
		System.out.println(table.keys().size());
		System.out.println(table.get("ta"));
		System.out.println(table.get("tu"));
		System.out.println(table.get("e"));
	}

	public static class MyNodes extends ArrayList<MyNode> {
	}

	int length;
	MyNodes[] buckets;

	public MyHashTable(int length) {
		this.length = length;
		buckets = new MyNodes[length];
	}
	
	
	public void set(String key, int value) {
	  int hash = hash(key);
	  if(buckets[hash] == null) {
		  buckets[hash] = new MyNodes();
	  }
	  buckets[hash].add(new MyNode(key, value));
	}
	
	
	public int get(String key) {
		int hash = hash(key);
		MyNodes bucket = buckets[hash];
		for(MyNode node : bucket) {
			
			if(key.equals(node.getKey())) {
				return node.getValue();
			}
		}
		return 0;
	}
	

	private int hash(String key) {
		int hash = 0;
		for (int i = 0; i < key.length(); i++) {
			hash = (hash + key.charAt(i) * i) % length;
		}
		return hash;
	}
	
	
	
	public List<String> keys() {
		List<String> keys = new ArrayList<String>();
        for(MyNodes bucket : buckets) {
           if(bucket != null) {
        	   for(MyNode node : bucket) {
          		 keys.add(node.getKey());
          	 }
           }	 
        }
		return keys;
	}

}
