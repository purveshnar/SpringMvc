package com.purvesh.test.swap;

import java.util.HashSet;
import java.util.Set;

/**
 * excellent explanation here : 
 * https://www.javaworld.com/article/2077424/learn-java/learn-java-does-java-pass-by-reference-or-pass-by-value.html
 * @author purveshnar
 *
 */
public class SwapWorking {
	
	public static void main(String[] args) {
		
		
		//object swap
		Point p1= new Point(0, 0);
		Point p2= new Point(0, 0);
		System.out.println("p1.x = " + p1.x + "p1.y = " + p1.y);
		System.out.println("p2.x = " + p2.x + "p2.y = " + p2.y);
		tricky(p1,p2);
		System.out.println("p1.x = " + p1.x + "p1.y = " + p1.y);
		System.out.println("p2.x = " + p2.x + "p2.y = " + p2.y);
		
		/*
		 * Java copies and passes the reference by value, not the object. 
		 * Thus, method manipulation will alter the objects, since the references point to the original objects. 
		 * But since the references are copies, swaps will fail. As Figure 2 illustrates, 
		 * the method references swap, but not the original references. 
		 * Unfortunately, after a method call, you are left with only the unswapped original references. 
		 * For a swap to succeed outside of the method call, we need to swap the original references, not the copies.
		 * 
		 * excellent explanation here : 
		 * https://www.javaworld.com/article/2077424/learn-java/learn-java-does-java-pass-by-reference-or-pass-by-value.html
		 */
	}
	
	
	//one ugly trick
	public static int getItself(int itself, int dummy)
	{
	    return itself;
	}

	public static void tricky(Point arg1, Point arg2)
	{
	  arg1.x = 100;
	  arg1.y = 100;
	  Point temp = arg1;
	  arg1 = arg2;
	  arg2 = temp;
	  
	  //ugly way of swap
	  int a = 10;
	  int b = 20;

	  System.out.println("Before Ugly way of swap:" + a);
	  System.out.println("Before Ugly way of swap:" + b);
	  a = getItself(b, b = a);
	  System.out.println("Ugly way of swap a:" + a);
	  System.out.println("Ugly way of swap b:" + b);
	  
	  
	}

}
