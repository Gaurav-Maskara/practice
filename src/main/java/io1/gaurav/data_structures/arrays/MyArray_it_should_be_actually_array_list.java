package io1.gaurav.data_structures.arrays;

import java.util.Arrays;

public class MyArray_it_should_be_actually_array_list {
	
	Object[] data;
	int length;
	int capacity;
	
	public MyArray_it_should_be_actually_array_list() {
		length = 0;
		capacity = 1;
		data = new Object[capacity];
	}
	
	public void push(Object dataToPush) {
		if(length == capacity) {
			capacity = capacity*2;
			data = Arrays.copyOf(data, capacity);
		}
		data[length] = dataToPush;
		length++;
	}
	
	public Object get(int indexAt) {
		return data[indexAt];
	}
	
	public Object pop() {
		Object poppedData = data[length -1 ];
		data[length -1 ] = null;
		length--;
		return poppedData;
	}
	
	public void deleteElementAtIndex(int indexAt) {
		for(int i=indexAt; i<length-1; i++) {
			data[i] = data[i+1];
		}
		length--;
	}
	
	

	public static void main(String[] args) {
		MyArray_it_should_be_actually_array_list m = new MyArray_it_should_be_actually_array_list();
		m.push("Hello");
		m.push("World");
		
		m.deleteElementAtIndex(0);

		for (int i = 0; i < m.length; i++) {
			System.out.println(m.get(i));
		}
	}

}
