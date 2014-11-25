package com.as.Client;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistClass {
	public static void main(String[] args) {
		ArrayList stateList = new ArrayList();
		//add
		stateList.add("CA");
		stateList.add("NJ");
		stateList.add("AZ");
		stateList.add(0,"TX");
		//get
		System.out.println();
		System.out.println("Testing the get methods");
		System.out.println("First element:  "+ stateList.get(0));
		int lastElementIndex = stateList.size()-1;
		System.out.println("Last Element: " + stateList.get(lastElementIndex));
		System.out.println("All Elements: " + stateList);
		System.out.println();
		
		//for
		System.out.println();
		System.out.println(" === using for each loop+++");
		for (Object object : stateList) {
			System.out.println((String)object);
			
			
		}
		System.out.println();
		//iterating
		System.out.println("Using Iterator");
		Iterator iter = stateList.iterator();
		while (iter.hasNext()){
			System.out.println(iter.next());
			
		}
		//remove
		stateList.remove("CA");
		System.out.println("using iterator after removing");
		iter = stateList.iterator();
		while (iter.hasNext()){
			System.out.println(iter.next());
		}
	}
}
