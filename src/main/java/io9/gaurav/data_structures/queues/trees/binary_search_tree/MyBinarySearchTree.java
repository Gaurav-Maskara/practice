package io9.gaurav.data_structures.queues.trees.binary_search_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import lombok.Getter;
import lombok.Setter;



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
		   // tree.printTree();
     	    // tree.remove(20);
		    //tree.remove(4);
		    tree.printTree();
		   // tree.insert(20);
		    tree.insert(18);
		    tree.insert(10);
		  //  tree.printTree();
		  //  tree.remove(170);
		    tree.printTree();
		    
		   System.out.println( tree.searchElement(99, tree.root));
		    
		//System.out.println("My Breath first search " + tree.breathFirstSearchIteratively());
		//System.out.println("My Breath first search Recursively" + tree.breathFirstSearchRecursively());

	    //System.out.println("My Depth first search - in order " + tree.depthFirstSearchInOrder());
        //System.out.println("My Depth first search - pre order " + tree.depthFirstSearchPreOrder());
        //System.out.println("My Depth first search - post order " + tree.depthFirstSearchPostOrder());
	}

	private MyBinaryNode root;

	public MyBinarySearchTree() {
		root = null;
	}

	public void insert(int value) {
		MyBinaryNode valueToInsert = new MyBinaryNode(value, null, null);

		if (root == null) {
			root = valueToInsert;
			return;
		}

		MyBinaryNode pointer = root;
		while (true) {
			if (valueToInsert.getValue() < pointer.getValue()) {
				if (pointer.getLeft() == null) {
					pointer.setLeft(valueToInsert);
					return;
				}
				pointer = pointer.getLeft();
			} else {
				if (valueToInsert.getValue() > pointer.getValue()) {
					if (pointer.getRight() == null) {
						pointer.setRight(valueToInsert);
						return;
					}
					pointer = pointer.getRight();
				}
			}
		}
	}

	int count = 0;

	public void printTree() {
		count = 0;
		System.out.print("Going to print the tree -->");
		printTree(root);
		System.out.println();
	}

	public void printTree(MyBinaryNode nodeToPrint) {
		System.out.print(nodeToPrint.getValue() +" ");

		if (nodeToPrint.getLeft() != null) {
			printTree(nodeToPrint.getLeft());
		}

		if (nodeToPrint.getRight() != null) {
			printTree(nodeToPrint.getRight());
		}

	}


	public List<Integer> breathFirstSearchIteratively() {
		List<Integer> bfs = new ArrayList<Integer>();

		MyBinaryNode pointer = root;
		if (pointer == null) {
			return null;
		}

		Queue<MyBinaryNode> queue = new LinkedList<MyBinaryNode>();

		queue.add(pointer);
		while (!queue.isEmpty()) {
			MyBinaryNode currentPointer = queue.remove();
			if (currentPointer.getLeft() != null) {
				queue.add(currentPointer.getLeft());
			}
			if (currentPointer.getRight() != null) {
				queue.add(currentPointer.getRight());
			}
			bfs.add(currentPointer.getValue());
		}
		return bfs;
	}

	public List<Integer> breathFirstSearchRecursively() {
		Queue<MyBinaryNode> queue = new LinkedList<>();
		queue.add(root);
		return breathFirstSearchRecursively(queue, new ArrayList<>());
	}
	

	public List<Integer> breathFirstSearchRecursively(Queue<MyBinaryNode> queue, List<Integer> bfs) {
		if (queue.isEmpty()) {
			return bfs;
		}

		MyBinaryNode currentPointer = queue.remove();
		bfs.add(currentPointer.getValue());

		if (currentPointer.getLeft() != null) {
			queue.add(currentPointer.getLeft());
		}

		if (currentPointer.getRight() != null) {
			queue.add(currentPointer.getRight());
		}

		return breathFirstSearchRecursively(queue, bfs);
	}

	public List<Integer> depthFirstSearchInOrder(){
		MyBinaryNode currentNode = root;
		List<Integer> dfs = new ArrayList<Integer>();
		//return depthFirstSearchInOrder(currentNode, dfs, level);
		
	    Level level =new Level();
	    level.level = 0;
		depthFirstSearchInOrder(currentNode, dfs, level);
		System.out.println("Printing depthFirstSearchInOrde -------> "+ dfs);
		return null;
	}
	
	
	public List<Integer> depthFirstSearchPostOrder(){
		MyBinaryNode currentNode = root;
		List<Integer> dfs = new ArrayList<Integer>();
		return depthFirstSearchPostOrder(currentNode, dfs);
	}
	
	
	public List<Integer> depthFirstSearchPreOrder(){
		MyBinaryNode currentNode = root;
		List<Integer> dfs = new ArrayList<Integer>();
		return depthFirstSearchPreOrder(currentNode, dfs);
	}
	
	
	
//	public List<Integer> depthFirstSearchInOrder(MyBinaryNode currentNode, List<Integer> dfs){
//		
//		if(currentNode.getLeft() != null) {
//			depthFirstSearchInOrder(currentNode.getLeft(), dfs);
//		}
//		
//		dfs.add(currentNode.getValue());
//		
//		if(currentNode.getRight() != null) {
//			depthFirstSearchInOrder(currentNode.getRight(), dfs);
//		}
//		
//		return dfs;
//	}
	
	@Getter
	@Setter
	class Level {
		public int level;
		
		
	}
	
	
	public Integer depthFirstSearchInOrder(MyBinaryNode currentNode, List<Integer> dfs, Level level){
		
		if(currentNode.getLeft() != null) {
			System.out.println("level is -->" + level.level);
			level.level = 	level.level+1;
			depthFirstSearchInOrder(currentNode.getLeft(), dfs, level);
		}
		
		dfs.add(currentNode.getValue());
		
		
		if(currentNode.getRight() != null) {
			System.out.println("level is -->" + level.level);
			level.level = 	level.level+1;
			depthFirstSearchInOrder(currentNode.getRight(), dfs, level);
		}
		
		return --level.level;
	}
	
	
	
	
	public List<Integer> depthFirstSearchPostOrder(MyBinaryNode currentNode, List<Integer> dfs){
		if(currentNode.getLeft() != null) {
			depthFirstSearchPostOrder(currentNode.getLeft(), dfs);
		}
		
		if(currentNode.getRight() != null) {
			depthFirstSearchPostOrder(currentNode.getRight(), dfs);
		}
		
		dfs.add(currentNode.getValue());
		
		return dfs;
	}
	
	
	public List<Integer> depthFirstSearchPreOrder(MyBinaryNode currentNode, List<Integer> dfs){
		dfs.add(currentNode.getValue());
		
		if(currentNode.getLeft() != null) {
			depthFirstSearchPreOrder(currentNode.getLeft(), dfs);
		}
		
		if(currentNode.getRight() != null) {
			depthFirstSearchPreOrder(currentNode.getRight(), dfs);
		}
		
		return dfs;
	}
	
	
// --------------------------------------------------------------------------------------------------------------------------------------------
// Algorithm to delete a node in a BST	
//	
//   To delete a node in BST there are 3 possible cases :
//	   1. Its a leaf , then delete the same , without any issue
//	   2. The node to be deleted has only child (either left or right), its also simple , just find the child and place it at the parent's place
//	   3. If the node to be deleted has both the left and right child, then find the lowest value(find minimum) in the right subtree and place it at 
//	      parent's node (node to be deleted) place.
// --------------------------------------------------------------------------------------------------------------------------------------------
    
	
// --------------------------------------------------------------------------------------------------------------------------------------------
//	1> The node to delete has no children. That's easy: just release its resources and you're done
//	2> The node has a single child node. Release the node and replace it with its child, so the child holds the removed node's place in the tree
//	3> The node has two children. Find the right-most child of node's left subtree. Assign its value  to root, and delete this child.
// --------------------------------------------------------------------------------------------------------------------------------------------

	
	public void remove(int valueToRemove) {
		MyBinaryNode currentNode = root;
		MyBinaryNode parentOfCurrent = null;
		remove(currentNode, valueToRemove, parentOfCurrent);
	}
	
	
	public void remove(MyBinaryNode currentNode, int valueToRemove, MyBinaryNode parentOfCurrent) {
		if(currentNode == null) {
			return;
		}
		
		if(valueToRemove > currentNode.getValue()) {
			parentOfCurrent = currentNode;
			remove(currentNode.getRight(), valueToRemove, parentOfCurrent);
		}
		
		else if(valueToRemove < currentNode.getValue()) {
			parentOfCurrent = currentNode;
			remove(currentNode.getLeft(), valueToRemove, parentOfCurrent);
		}
		
		else {
			// Case 1
			if(currentNode.getLeft() == null && currentNode.getRight() == null) {
				if(parentOfCurrent.getLeft() == currentNode) {
                    parentOfCurrent.setLeft(null);
				}
				else {
					parentOfCurrent.setRight(null);
				}
			}
			// Case 2
			else if ((currentNode.getLeft() != null && currentNode.getRight() == null)
					|| (currentNode.getLeft() == null && currentNode.getRight() != null)) {

				if(parentOfCurrent.getLeft() == currentNode) {
					if(currentNode.getLeft() != null) {
						parentOfCurrent.setLeft(currentNode.getLeft());
					}else {
						parentOfCurrent.setLeft(currentNode.getRight());
					}
				}else {
					if(currentNode.getLeft() != null) {
						parentOfCurrent.setRight(currentNode.getLeft());
					}else {
						parentOfCurrent.setRight(currentNode.getRight());
					}
				}
			}
			//Case 3
			else {
				MyBinaryNode minimumInRightSubtree = findMinimumInRightSubtree(currentNode.getRight(), null);
				if(parentOfCurrent.getLeft() == currentNode) {
					parentOfCurrent.getLeft().setValue(minimumInRightSubtree.getValue());
					parentOfCurrent = currentNode;
					remove(currentNode.getRight(), minimumInRightSubtree.getValue(), parentOfCurrent);
					
				}else {
					parentOfCurrent.getRight().setValue(minimumInRightSubtree.getValue());
					parentOfCurrent = currentNode;
					remove(currentNode.getRight(), minimumInRightSubtree.getValue(), parentOfCurrent);
				}
			}
		}
	}
	
	
	
	public MyBinaryNode findMinimumInRightSubtree(MyBinaryNode currentNode, MyBinaryNode minimumInRightSubtreeParent) {
		while(currentNode.getLeft() != null) {
			//minimumInRightSubtreeParent = currentNode;
			currentNode = currentNode.getLeft();
		}
		//minimumInRightSubtreeParent.setLeft(null);
		return currentNode;
	}
	
	
	
	public boolean searchElement(int valueToSearch, MyBinaryNode root) {
		if(root!=null && root.getValue()==valueToSearch) {
			return true;
		}else if(valueToSearch<root.getValue() && root.getLeft()!=null) {
			return searchElement(valueToSearch, root.getLeft());
		}else if(valueToSearch>root.getValue() && root.getRight()!=null) {
			return searchElement(valueToSearch, root.getRight());
		}
		return false;
	}
	
	
	
	
	
}
