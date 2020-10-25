
package io1.gaurav.data_structures.arrays;

import java.util.Arrays;

public class MergeSortedArray {

	public static int[] MargeTwoSortedArray(int[] arr1, int[] arr2) {
		
		int[] mergerdArray = new int[arr1.length + arr2.length];
		int j = 0, k = 0;
		
		for(int i = 0; i < mergerdArray.length; i++) {
			if(j<=arr1.length-1 && (k == arr2.length || arr1[j] < arr2[k])) {
				mergerdArray[i] = arr1[j];
				j++;
			}else if(k<= arr2.length-1 && (j == arr1.length || arr2[k] <= arr1[j])) {
				mergerdArray[i] = arr2[k];
				k++;
			}
		}
		return mergerdArray;
	}

	
	
	public static void main(String[] args) {
		 int[] arr = MargeTwoSortedArray(new int[]{1,1,8,9,10}, new int[]{1,2,8,9,11,15,16});
		//Arrays.stream(arr).forEach(System.out::println);
		
		Arrays.stream(arr).forEach(System.out::println);
	}

}
