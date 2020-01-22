package com.purvesh.interviewexamples;

public class OddEven {
	
	public static void main(String[] args) {
		
		printOddOrEven(0);
	}

	private static void printOddOrEven(int i) {
		if(i%2==0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

}
