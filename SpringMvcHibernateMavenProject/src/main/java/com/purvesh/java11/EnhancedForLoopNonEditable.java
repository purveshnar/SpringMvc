package com.purvesh.java11;

public class EnhancedForLoopNonEditable {
	
	public static void main(String[] args) {
		int nums[]={1,2,3,4,5,6,7,8,9,10};		
		System.out.println(nums);
		
		for (int i : nums) {
			i = i*10;// THis value change doesn't have any effect on the actual array
		}
		
		for (int i : nums) {
			System.out.println(i);
		}
		
		System.out.println(nums);

	}
	
	
}
