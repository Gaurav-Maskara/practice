package io1.a.points.to.ponder;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.IntStream;

// Class name should be "Source",
// otherwise solution won't be accepted
public class Source {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
			
			Scanner sc = new Scanner(System.in);
			Scanner scanner = new Scanner(System.in);
			int value = sc.nextInt();
			
			String myText = scanner.nextLine();
			String[] split = myText.split(" ");
			int[] mySplits = new int[split.length];
			
			for(int i = 0; i < split.length; i++) {
				mySplits[i] = Integer.parseInt(split[i]);
			}
			
			int sum =0; 
			for(int i : mySplits) {
				sum = sum+mySplits[i];
			}
			

			if (sum / 2 == value - 1) {
				System.out.println("Yes");
			}

			else {
				System.out.println("No");
			}
			
	}
}