package io4.gaurav.data_structures.linked_lists.doubly;


public class MyDoublyLinkedList {

	public static void main(String[] args) {
		MyDoublyLinkedList myDoublyLinkedList = new MyDoublyLinkedList(5);
		myDoublyLinkedList.append(7);
		myDoublyLinkedList.append(4);
		myDoublyLinkedList.printList();
		myDoublyLinkedList.prepend(10);
		myDoublyLinkedList.printList();
		myDoublyLinkedList.insert(2, 15);
		myDoublyLinkedList.printList();
		myDoublyLinkedList.remove(2);
		myDoublyLinkedList.printList();
	}

	private int length;
	private MyDoublyLinkedNode head;
	private MyDoublyLinkedNode tail;

	public MyDoublyLinkedList(int value) {
		head = new MyDoublyLinkedNode(value, null, null);
        tail = head;
		this.length++;
	}

	public void append(int value) {
		MyDoublyLinkedNode nodeToInsert = new MyDoublyLinkedNode(value, null, null);
		
		MyDoublyLinkedNode temp = tail;
		temp.setNext(nodeToInsert);
		nodeToInsert.setPrevious(temp);
		
		tail = nodeToInsert;
	}

	public void printList() {
		MyDoublyLinkedNode pointer = head;
		while (pointer != null) {

			if (pointer.getNext() != null) {
				System.out.print(pointer.getValue() + "-->");
			} else {
				System.out.print(pointer.getValue());
			}

			pointer = pointer.getNext();
		}
		System.out.println();
	}

	public void prepend(int value) {
		MyDoublyLinkedNode valueToPrepend = new MyDoublyLinkedNode(value, null, null);
		MyDoublyLinkedNode temp = head;
		
		valueToPrepend.setNext(temp);
		valueToPrepend.setPrevious(null);
		temp.setPrevious(valueToPrepend);
		
		head = valueToPrepend;
	}

	public void insert(int position, int value) {
		MyDoublyLinkedNode valueToInsert = new MyDoublyLinkedNode(value, null, null);
		MyDoublyLinkedNode pointer = head;

		int counter = 0;
		
		while(counter < position) {
			if(pointer.getNext() != null) {
				pointer = pointer.getNext();
				counter++;
			}else {
				break;
			}
		}
		
		MyDoublyLinkedNode before = pointer.getPrevious();
		
		valueToInsert.setPrevious(before);
		valueToInsert.setNext(pointer);
		
		pointer.setPrevious(valueToInsert);
		before.setNext(valueToInsert);
	}

	
	public void remove(int positionToRemove) {
		MyDoublyLinkedNode pointer = head;
		int counter = 0;

		while (counter < positionToRemove) {
			if (pointer.getNext() != null) {
				pointer = pointer.getNext();
				counter++;
			}
		}
		
		MyDoublyLinkedNode before = pointer.getPrevious();
		MyDoublyLinkedNode after = pointer.getNext();
		
		before.setNext(after);
		after.setPrevious(before);
	}

}
