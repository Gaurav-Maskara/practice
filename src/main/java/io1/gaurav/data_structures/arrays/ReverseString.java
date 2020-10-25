package io1.gaurav.data_structures.arrays;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(ReverseString("123456"));
		System.out.println(ReverseStringWithReelJava("123456"));
	}
	
	
   public static String ReverseString(String stringToReverse) {
	  String reversedString = "";
      for(int i = stringToReverse.length()-1 ; i>=0; i--) {
    	  reversedString = reversedString + stringToReverse.charAt(i);
      }	   
      return reversedString;
   }
   
   public static String ReverseStringWithReelJava(String stringToReverse) {
	  return new StringBuilder(stringToReverse).reverse().toString();	   
   }

}
