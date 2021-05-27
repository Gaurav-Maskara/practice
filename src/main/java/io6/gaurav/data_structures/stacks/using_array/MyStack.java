package io6.gaurav.data_structures.stacks.using_array;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(5);
		stack.printStack();
		stack.push(3);
		stack.printStack();
		stack.pop();
		stack.printStack();
	}
	
	 private List<Integer> array = new ArrayList<>();
	
	 public void push(int value) {
		 array.add(value);
	 }
	 
	 public void printStack() {
       for(int i = 0 ; i < array.size(); i++) {
    	   if(i < array.size()-1) {
    		   System.out.print(array.get(i) + "-->");
    	   }else {
    		   System.out.print(array.get(i));
    	   }
       }
       System.out.println();
	 }
	 
	 public void pop() {
		 array.remove(array.size()-1);
	 }
	 
	
}
