package com.jcg.hibernate.maven.cloneabletest;

public class User1 implements Cloneable {// implemented CLoneable for deep copy only{

	private String firstName;
    private String lastName;
    private Address1 address;
    
	public User1(String firstName, String lastName, Address1 address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address1 getAddress() {
		return address;
	}
	public void setAddress(Address1 address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User1 [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}
    
    //DeepCopy : copy constructor
	public User1(User1 that) {
		this(that.getFirstName(), that.getLastName(), that.getAddress());
	}
	
	//Deep COpy : Cloneable interface
	@Override
	protected Object clone() {
		User1 user = null;
		try {
			user = (User1) super.clone();
		} catch (CloneNotSupportedException e) {
			user = new User1(this.getFirstName(), this.getLastName(), (Address1)this.getAddress().clone());
		}
		return user;
	}
}
