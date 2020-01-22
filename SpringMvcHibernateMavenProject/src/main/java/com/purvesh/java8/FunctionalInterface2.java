package com.purvesh.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionalInterface2 {

	/*
	 * Give a Try with Functional Interface # 2 Tim has his own Sandwich corner
	 * where he sells different types of sandwich which includes
	 * 
	 * Cheese Sandwich Corn sandwich Mix Veg sandwich
	 * 
	 * Write a program to add the above to a collection using Consumer interface
	 * and print all using Supplier interface. Use only lambda functions.
	 */

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Cheese Sandwich", "Corn Sandwich", "Mix Veg Sandwich");
		List<String> newList = new ArrayList<>();
		Consumer<String> consumer = s -> newList.add(s);
		consumer.accept(list.get(0));
		consumer.accept(list.get(1));
		consumer.accept(list.get(2));
		System.out.println("newList" + newList);

		Supplier<String> supplier = () -> {
			return newList.get(0);
		};
		String string = supplier.get();
		System.out.println(string); //TODO: Better this supplier code
	}
}

class Sandwich {
	String name;

}
