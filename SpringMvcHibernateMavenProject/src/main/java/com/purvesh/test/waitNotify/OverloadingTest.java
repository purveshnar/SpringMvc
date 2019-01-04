package com.purvesh.test.waitNotify;

public class OverloadingTest {
	
	
	public static void display(Object obj) {
		System.out.println("Object");
	}
	
	public static void display(String str) {
		System.out.println("String.display()");
	}

	public static void display(Integer str) {
		System.out.println("Integer.display()");
	}
	
	
	public static void main(String[] args) {
		display(null);
	}
}
