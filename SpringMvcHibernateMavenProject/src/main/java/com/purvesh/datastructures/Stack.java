package com.purvesh.datastructures;

public class Stack {

	int stck[] = new int[10];
	int tos;
	
	Stack(){
		tos=-1;
	}
	
	void push(int num) {
		if(tos==9) {
			System.out.println("Stack full");
		}
		stck[tos++] = num;
	}
	
	int pop(){
		if(tos<0){
			System.out.println("Stack Empty");
		}
		return stck[tos--];
		
	}
}
