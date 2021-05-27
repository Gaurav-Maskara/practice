package io1.gaurav.data_structures.arrays;

import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {

	
		String name = "Gaurav Maskara";
		String email = "test123@gmail.com";
		String mobileNo = "8574020068";
		
		
		
		System.out.println(Pattern.matches("^[a-zA-Z\\s]+", name));
		System.out.println(Pattern.matches("^\\*w|\\s|\\w*", "gaurav maskara"));
		
		
		
		
		
	}

}
