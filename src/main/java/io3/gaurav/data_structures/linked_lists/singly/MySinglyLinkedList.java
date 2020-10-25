package io3.gaurav.data_structures.linked_lists.singly;

public class MySinglyLinkedList {

	public static void main(String[] args) {
		MySinglyLinkedList mySinglyLinkedList = new MySinglyLinkedList(5);
		mySinglyLinkedList.append(8);
		mySinglyLinkedList.append(4);
		mySinglyLinkedList.printList();
		mySinglyLinkedList.prepend(10);
		mySinglyLinkedList.printList();
		mySinglyLinkedList.insert(1, 15);
		mySinglyLinkedList.printList();
	     // mySinglyLinkedList.remove(4);
		mySinglyLinkedList.remove(2);
		mySinglyLinkedList.printList();
	    mySinglyLinkedList.reverse();
		mySinglyLinkedList.printList();
		
	}

	private int length;
	private MySinglyLinkedNode head;
	private MySinglyLinkedNode tail;

	public MySinglyLinkedList(int value) {
		length++;
		head = new MySinglyLinkedNode(value, null);
		tail = head;
	}

	public void append(int value) {
		MySinglyLinkedNode nodeToInsert = new MySinglyLinkedNode(value, null);
	    MySinglyLinkedNode temp = tail;
	    temp.setNext(nodeToInsert);
	    tail = nodeToInsert;
	    
	    length++;
	}

	public void printList() {
		MySinglyLinkedNode pointer = head;
		while (pointer != null) {
			
			if(pointer.getNext() != null) {
				System.out.print(pointer.getValue() + "-->");
			}else {
				System.out.print(pointer.getValue());
			}
			
			pointer = pointer.getNext();
		}
		System.out.println();
	}

	public void prepend(int value) {
		MySinglyLinkedNode valueToPrepend = new MySinglyLinkedNode(value, null);
		valueToPrepend.setNext(head);
		head = valueToPrepend;
		length++;
	}

	public void insert(int locationToInsertAt, int value) {
		MySinglyLinkedNode valueToInsert = new MySinglyLinkedNode(value, null);
		int counter = 0;
		MySinglyLinkedNode pointer = head;

		while (counter < locationToInsertAt) {
			counter++;
			pointer = pointer.getNext();
		}

		valueToInsert.setNext(pointer.getNext());
		pointer.setNext(valueToInsert);
		length++;
	}

	public void remove(int valueToRemove) {

		if (head != null && head.getValue() == valueToRemove) {
			head = head.getNext();
			return;
		}

		MySinglyLinkedNode pointer = head;
		MySinglyLinkedNode slowPointer = pointer;

		while (pointer != null && pointer.getValue() != valueToRemove) {
			slowPointer = pointer;
			pointer = pointer.getNext();
		}

		if (pointer != null && pointer.getValue() == valueToRemove) {
			slowPointer.setNext(pointer.getNext());
			length--;
		}
	}

	public void reverse() {
		MySinglyLinkedNode first = head;
		MySinglyLinkedNode second = head.getNext();
		MySinglyLinkedNode temp = head.getNext().getNext();
		
		first.setNext(null);
		
		while (temp != null) {
			second.setNext(first);
			first = second;
			second = temp;
			
			temp = temp.getNext();
		}
		
		second.setNext(first);
		first = second;
		head = second; 
	}

	
	
}
