package com.purvesh.interviewexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class ModifyCollection {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		
		/*for (Integer integer : list) {
			list.remove(0);
		}*/
		
		list.removeIf(i -> i==2);
		System.out.println(list);
		
		list.stream().filter(j -> j!=1).filter(p -> p !=2).forEach(p -> System.out.println(p));
		System.out.println(list);
	}

}
