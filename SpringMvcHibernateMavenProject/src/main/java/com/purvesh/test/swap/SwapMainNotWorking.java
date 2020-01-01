package com.purvesh.test.swap;

public class SwapMainNotWorking {
	
	public static void swap(int a, int b) {
		int t = a;
		a=b;
		b=t;
	}
	
	public static void swap(Num d1, Num d2) {
		Num temp = new Num(1);
		temp = d1;
		d1 = d2;
		d2 = temp;
		//temp.x=11;
	}
	
	public static void main(String[] args) {
		int a =5;
		int b =10;
		
		swap(a,b);
		//System.out.println(a);
		//System.out.println(b);
		
		Num d1 = new Num(5);
		Num d2 = new Num(10);
		
		swap(d1, d2);
		System.out.println("d1.x : " + d1.x);
		System.out.println("d2.x: " + d2.x);
	}

}


class Num {
	int x;
	
	public Num(int x) {
		this.x = x;
	}
}
