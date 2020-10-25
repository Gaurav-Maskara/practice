package io9.gaurav.data_structures.queues.trees.binary_search_tree;

import com.sun.javafx.geom.CubicApproximator;

public class MyBinarySearchTree {

	public static void main(String[] args) {
	    MyBinarySearchTree tree = new MyBinarySearchTree();
	    tree.insert(9);
	    tree.insert(4);
	    tree.insert(20);
	    tree.insert(1);
	    tree.insert(6);
	    tree.insert(15);
	    tree.insert(170);
	    tree.printTree();
	    tree.remove(20);
	    tree.remove(4);
	    tree.printTree();
	    tree.insert(20);
	    tree.insert(18);
	    tree.insert(10);
	    tree.printTree();
	    tree.remove(170);
	    tree.printTree();
	    System.out.println("Breath first search " + tree.breathFirstSearchIteratively());
	    System.out.println("Depth first search - in order " + tree.depthFirstSearchInOder(SearchType.IN_ORDER));
	    System.out.println("Depth first search - pre order " + tree.depthFirstSearchInOder(SearchType.PRE_ORDER));
	    System.out.println("Depth first search - post order " + tree.depthFirstSearchInOder(SearchType.POST_ORDER));
	  }
	
	
	private MyBinaryNode root;
	
	public MyBinarySearchTree() {
		root = null;
	}
	
	
	public void insert(int value) {
		if(root == null) {
			root = new MyBinaryNode(value, null, null);
			return; 
		}
		MyBinaryNode nodeToInsert = new MyBinaryNode(value, null, null);
		MyBinaryNode pointer = root;
		
		while(true) {
			if(pointer.getValue() < value) {
				
			}
			
			
			
			
		}
		
		
		
		
	}
	
	
}
