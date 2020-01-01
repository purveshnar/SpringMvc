package com.jcg.hibernate.maven.inheritance;

public class InheritanceMain {
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.method1();
		Child c = new Child();
		p=c;
		p.method1();
		
		
		Parent p1 = new Child();
		Parent p2 = new Grandchild();
		
		//Child c1 = (Child) new Parent(); // java.lang.ClassCastException
		//c1.method1();
		
		Grandchild gc1 = (Grandchild) new Child();
		gc1.method1();
	}

}
