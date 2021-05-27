package io93.data_structures.recursion;

public class ReverseString {
	
	static String finalReversedString = "";

	public static void main(String[] args) {
		System.out.println(reverseStringRecursively("123456"));
		System.out.println(reverseStringIteratively("123456"));
	}
	
	public static String reverseStringIteratively(String str) {
		String reversedString = "";
		for(int i = str.length()-1; i>=0; i--) {
			reversedString = reversedString+str.charAt(i);
		}
		return reversedString;
	}
	
	public static String reverseStringRecursively(String str) {
		if(str.length()==0) {
			return "";
		}
		
		finalReversedString = finalReversedString + reverseStringIteratively(str.substring(1))+ str.charAt(0);
		return finalReversedString;
	}
	
}
