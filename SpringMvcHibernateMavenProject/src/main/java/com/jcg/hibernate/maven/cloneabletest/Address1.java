package com.jcg.hibernate.maven.cloneabletest;

public class Address1 implements Cloneable {//implemented Cloneable for Deep Copy only
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	private String street;
    private String city;
    private String country;
	public Address1(String street, String city, String country) {
		super();
		this.street = street;
		this.city = city;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address1 [street=" + street + ", city=" + city + ", country=" + country + "]";
	}
	
	//deep copy :copy constructor 
    public Address1(Address1 that) {
    	this(that.getStreet(), that.getCity(), that.getCountry());
    }
    
    //deep copy : CLoeneable interface
	@Override
	public Object clone() {
		
		try{
			return (Address1)super.clone();
		} catch(CloneNotSupportedException e) {
			return new Address1(this.street, this.city, this.country);
		}
	}
    
    

}
