package com.jcg.hibernate.maven.cloneabletest;

public class CloneTestMain {
	
	public static void main(String[] args) {
		
		Address1 a1 = new Address1("MiraRoad", "Thane","India");
		User1 u1 =new User1("Purvesh", "Nar", a1);
		
		User1 u2 = u1;
		u2.setLastName("Narrrr");
		
		System.out.println("u2 :" + u2);
		System.out.println("u1 :" + u1);
		
		
		//Shallow Copy : We only copy values of fields from one object to another
		u1 =new User1("Purvesh", "Nar", a1);
		User1 shallowCopy = new User1(u1.getFirstName(), u1.getLastName(),u1.getAddress());
		
		System.out.println("u1 : " + u1);
		System.out.println("shallowCopy: " +shallowCopy);
		
		System.out.println("*****Deep Copy *****");
		//Deep Copy : Using Copy Constructor
		u1 =new User1("Purvesh", "Nar", a1);
		User1 deepCopy1 = new User1(u1);
		
		System.out.println("u1: " + u1);
		System.out.println("deepcopy1: " + deepCopy1);
		
		//Deep Copy : Using Clone method
		
	}

}
