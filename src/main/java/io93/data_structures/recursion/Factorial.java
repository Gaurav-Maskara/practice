package io93.data_structures.recursion;

public class Factorial {

	
	public static void main(String args[]) {
		System.out.println("Iteratively --->"+calculateFactorialIeratively(4));
		System.out.println("Recursively --->"+calculateFactorialByRecursion(4));
	}
	
	
	public static int calculateFactorialIeratively(int n) {
		int fact = 1;
		for(int i = 1; i <= n ; i++) {
			fact = fact*i;
		}
		return fact;
	}
	
	
	public static int calculateFactorialByRecursion(int n) {
		if(n ==1) {
			return n;
		}
         return n * calculateFactorialByRecursion(n-1);		
	}
	
	
}
