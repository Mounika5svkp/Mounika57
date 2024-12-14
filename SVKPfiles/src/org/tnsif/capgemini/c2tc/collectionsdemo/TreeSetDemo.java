package org.tnsif.capgemini.c2tc.collectionsdemo;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<String> set=new TreeSet<>();
		set.add("red");
		set.add("pink");
		set.add("blue");
		
		set.add("cherry");
		
		System.out.println("Treeset " +set);
	}

}