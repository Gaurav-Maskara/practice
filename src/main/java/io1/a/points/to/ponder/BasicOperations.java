package io1.a.points.to.ponder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
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

		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>();

		// System.out.println(Integer.parseInt("123")+1);
		// System.out.println(String.valueOf(123)+1);
		
		

	}

}
