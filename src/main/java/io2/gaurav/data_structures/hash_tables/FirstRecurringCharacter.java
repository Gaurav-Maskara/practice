package io2.gaurav.data_structures.hash_tables;

import java.util.HashSet;
import java.util.Set;

public class FirstRecurringCharacter {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 8, 5, 1, 8, 8, 7, 4, 4, 10 };

		// int[] arr = {1, 2, 3, 4};

		System.out.println(getFirstRecurringObject(arr));
		System.out.println(getFirstRecurringObjectBetter(arr));
		System.out.println(getFirstRecurringObjectBetter2(arr));
	}

	public static int getFirstRecurringObject(int[] arr) {
		int valueThatRepeated = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					valueThatRepeated = arr[i];
					return valueThatRepeated;
				}
			}
		}
		return valueThatRepeated;
	}

	public static int getFirstRecurringObjectBetter(int[] arr) {
		Set<Integer> repeatDetector = new HashSet<Integer>();
		boolean isAvailable;
		int valueThatRepeated = 0;
		for (int i = 0; i < arr.length; i++) {
			isAvailable = repeatDetector.add(arr[i]);

			if (!isAvailable) {
				valueThatRepeated = arr[i];
				break;
			}
		}
		return valueThatRepeated;
	}

	
	public static int getFirstRecurringObjectBetter2(int[] arr) {
		Set<Integer> hashSet = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			hashSet.add(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			if (hashSet.contains(arr[i])) {
				return arr[i];
			}
		}
		return 0;
	}

	
}
