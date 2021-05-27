package io93.data_structures.recursion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<>();
		
		al.set(0, 1);
		al.set(1, 3);
		
		Iterator<Integer> itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
