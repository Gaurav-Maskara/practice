package io1.a.points.to.ponder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

// Some important tips :
//	 1. to find the next element in circular list : next ---> (mid+1) % N ; modulus operator does that
//   2. prev ---> (mid+N-1) % N

public class BasicOperations {

	public static void main(String args[]) {


		String testString = "testString";

		int[] intArray = new int[10];
		int[] intArray2 = new int[10];
		

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		HashSet<Integer> hashSet = new HashSet<Integer>();
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();

		Stack<Integer> stack = new Stack<Integer>();
		Queue<Integer> queue = new LinkedList<Integer>();
		Deque<Integer> dequeue = new LinkedList<Integer>();
		
		PriorityQueue<Integer> pqueue = new PriorityQueue<Integer>();
		

		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>();

		// System.out.println(Integer.parseInt("123")+1);
		// System.out.println(String.valueOf(123)+1);
		
		
		
		//---------------------------------------------------------------------------------------------------------------
		//stack.isEmpty(); stack.peek(); stack.pop(); stack.push();
		//---------------------------------------------------------------------------------------------------------------
  
		
		//---------------------------------------------------------------------------------------------------------------
		//Enqueue
		//queue.add(5); //this will throw an exception if queue is already full but 
		//queue.offer(5) does the same but doesnt throw an exception
		
		//Peek
		//queue.element(); //returns the element , but throws and exception is queue is empty
		//queue.peek(); same thing as above but returns null if empty
		
		//Dequeue
		//queue.remove(); //removes in FIFO if empty throws exception
		//queue.poll(); same as above but without throwing an exception and returns null if empty
		
		
		//To find the length of String
		//"abc".length();
		
		//---------------------------------------------------------------------------------------------------------------

		
		//---------------------------------------------------------------------------------------------------------------
           //deque.removeFirst();
		   //deque.removeLast();
		   //dequeue.addLast(elemt);
		   //dequeue.addFirst(element);
		   // dequeue.isEmpty()
		//---------------------------------------------------------------------------------------------------------------

		
		
		//hash map
		//hashMap.containsKey("key");
		
		
		//String str = String.valueOf(arr);   //here arr is the character array
		
		
		//---------------------------------------------------------------------------------------------------------------

		   HashMap<String, String> hm = new HashMap<>();
		   
		   Set<String> keySet = hm.keySet();
		   Collection<String> values = hm.values();
		   
		   values.contains(values);
		
		
		//---------------------------------------------------------------------------------------------------------------
		
		

	}

}
