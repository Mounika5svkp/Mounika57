package org.tnsif.capgemini.c2tc.collectionsdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetDemo {

	public static void main(String[] args) {
		Set<String> set=new LinkedHashSet<>();
		set.add("blue");
		set.add("red");
		set.add("orange");
		set.add(null);
		System.out.println("LinkedhashSet "+set);
	}

}