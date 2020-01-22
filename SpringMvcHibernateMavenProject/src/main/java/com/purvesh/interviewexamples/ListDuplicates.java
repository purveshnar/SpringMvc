package com.purvesh.interviewexamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListDuplicates {
	
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		System.out.println("list1:" + list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(1);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		
		System.out.println("list2:" + list2);
		System.out.println("Compare:" + list1.equals(list2));
		list1.retainAll(list2);
		System.out.println("list1:" + list1);
		
		Set<Integer> set1 =new HashSet<>(list1);
		System.out.println("set1:"+ set1);
		
		Set<Integer> set2 =new HashSet<>(list2);
		System.out.println("set2:"+ set2);
		boolean contains = set1.contains(set2);
		System.out.println(contains);
		
	}

}
