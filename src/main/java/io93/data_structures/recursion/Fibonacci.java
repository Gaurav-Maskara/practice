package io93.data_structures.recursion;

import java.util.HashMap;

public class Fibonacci {
	
	static HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	static int fib;

	// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...
	public static void main(String[] args) {

		System.out.println("Fibonacci Iteratively --->" + fibonacciIteratively(1000));
		System.out.println("Fibonacci Memoization ---->"+fibonacciRecursionMemoization(1000));
		System.out.println("Fibonacci Recursively ---->" + fibonacciRecursively(50));

	}
	
	
	

   public static int fibonacciIteratively(int n) {
	   int f1 = 0 ; 
	   int f2 = 1;
	   
	   int fibo = 0;
	   for(int i = 2; i<=n ; i++) {
		   fibo = f1+f2;
		   f1 = f2;
		   f2 = fibo;
	   }
	   return fibo;
   }
   
   
   public static int fibonacciRecursively(int n) {
	   if(n==0)
		   return 0;
	   if(n==1)
		   return 1;
	   return fibonacciRecursively(n-1)+fibonacciRecursively(n-2);
   }
   
   public static int fibonacciRecursionMemoization(int n) {
	   if(n==0)
		   return 0;
	   if(n==1)
		   return 1;
	  if(hm.get(n)!=null)
		  return hm.get(n);
	 
	   fib = fibonacciRecursionMemoization(n-1)+fibonacciRecursionMemoization(n-2);
	   hm.put(n, fib);
	   return fib;
   }
   
   
   
	

}
