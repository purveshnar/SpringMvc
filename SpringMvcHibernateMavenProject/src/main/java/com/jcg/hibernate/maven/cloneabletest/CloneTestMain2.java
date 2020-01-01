package com.jcg.hibernate.maven.cloneabletest;

public class CloneTestMain2 {
	public static void main(String[] args) {
		
		Address1 a1 = new Address1("Miraroad", "Mumbai", "India");
		User1 u1 = new User1("Purvesh", "Nar", a1);
		
		User1 u2 = new User1(u1.getFirstName(), u1.getLastName(), u1.getAddress());
		
		a1.setCountry("Germany");
		
		if(u1.getAddress()==u2.getAddress()){
			System.out.println("CloneTestMain2.main()");
		}
		
		User1 u3 = u1;
		u3.getAddress().setCountry("NL");
		
		if(u1 == u3) {
			System.out.println("u3 = u1");
		}
		
		System.out.println(u1.getAddress());
		System.out.println(u2.getAddress());
		System.out.println(u3.getAddress());
		
		
		//Deep Copy 
		User1 u4 = new User1(u1);
		u4 = (User1) u1.clone();
		//Address1 a2 = new Address1(a1);
		
		if(u1.getAddress()==u4.getAddress()){
			System.out.println("u1.getAddress()==u4.getAddress()");
		}
	}

}
