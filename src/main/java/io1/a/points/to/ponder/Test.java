package io1.a.points.to.ponder;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
public class Test {
	
	public static void main(String args[]) {
		
		
	}
	
	
	
	
	public static void arrayListElementsRemovalTest() {

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("test1");
		arrayList.add("test2");
		arrayList.add("test3");
		arrayList.add("test4");
		arrayList.add("test5");
		
		
		
		
	}
	
	
	
	
	
	public static boolean binarySearch(int[] numbers, int numberToFind) {
		if(numbers == null || numbers.length == 0) {
			return false;
		}
		
		int start = 0;
		int end = numbers.length-1;
		
		while(start<=end) {
			
			int mid = (start + end)/2;
			if(numbers[mid] == numberToFind) {
				return true;
			}else if(numberToFind < numbers[mid]) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	class Person implements Comparable<Person> {
		
	//	private String name;
		private int age;
   //	private int employeeId;
   //	private double salary;
	
		@Override
		public int compareTo(Person o) {
			return this.getAge()-o.getAge();
		}
		
	}
	
	@AllArgsConstructor
	class PersonAgeInReverse implements Comparator<Person>{

		@Override
		public int compare(Person o1, Person o2) {
			return o2.getAge()-o1.getAge();
		}
		
	}
	
	
	public void fibonacciSequenceIteratively(int n) {
		int num1 = 0;
		int num2 = 1;
		int addition = 0;
		System.out.print(num1 +" ");
		System.out.print(num2 +" ");
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		float t1 = System.currentTimeMillis();
		for(int i = 1; i<=n; i++) {
			 addition = num1+num2;
			 
			 //System.out.print(addition +" ");
			 ar.add(addition);
			 
			 num1 = num2;
			 num2 = addition;
		}
		
		float t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
	}
	
	
	public int fibonacciRecursively(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		return fibonacciRecursively(n-1)+fibonacciRecursively(n-2);
	}
	
	

	public int fibonacciDynamicProgramming(int n , HashMap<Integer, Integer> hm) {
		if(n == 0) {
			return 0;
		}
		
		if(n == 1) {
			return 1;
		}
		
		if(hm.get(n)!=null) {
			return hm.get(n);
		}
		
		int val = fibonacciDynamicProgramming(n-1, hm)+fibonacciDynamicProgramming(n-2, hm);
		hm.put(n, val);
		return val;
	}
	
	
	public long factorial(int n) {
		long fact = 1;
		
		for(int i =1; i<=n; i++) {
			fact = fact *i;
		}
		return fact;
	}
	
	static void isAnagram(String str1, String str2) {
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		boolean status = true;
		if (s1.length() != s2.length()) {
			status = false;
		} else {
			char[] ArrayS1 = s1.toLowerCase().toCharArray();
			char[] ArrayS2 = s2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status = Arrays.equals(ArrayS1, ArrayS2);
		}
		if (status) {
			System.out.println(s1 + " and " + s2 + " are anagrams");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}
	}
	  
	
	public void reverseTheString(String str) {
		StringBuilder sb = new StringBuilder(str.length());
		for(int i = str.length()-1; i>=0 ; i--) {
			sb.append(str.charAt(i));
		}
		
		System.out.println(sb.toString());
	}
	    

}
