package com.purvesh.test.equalshashcode;

import java.util.HashMap;
import java.util.Map;

public class HashcodeMain {
	/**
	 * https://javasolutionsguide.blogspot.com/2015/11/how-hashmap-works-internally-in-java.html
	 * Let's see what get method is doing :


- If key is null,value at zeroth index(bucket) is returned.
- If key is not null, then hashCode method of the Key object is called and hashcode is    calculated.
- hash() method is called with calculated hashcode as argument .hash() method returns the  index(bucket).
- equals method of key(Employee class) is called and key is searched by traversing linked list and corresponding value is returned.




************************************
*
*Let's see what put method is doing :

- If key is null,key value pair is stored at the zeroth index of the array named as table(logical bucket),because hashcode for Null is always zero and index will be always zero in this case.
- If key is not null, hashcode method of the Key object(Employee in our case) is called,which returns hashcode for key object - hash(int) method is called with the calculated hashcode as argument.This extra hashing is added by Java library designers to overcome the issue when developers would have written an inefficient hashcode.In general while writing logic for hashcode ,it should be kept in mind that hashcode returned for different objects should be such that it distributes objects across various available buckets.
- On the basis of calculated hashcode in the above step,index is calculated by calling indexFor(hash, table.length) method,which is the index of array table where this key value pair(in the form of Entry object) will be stored.
- If there is no Entry Object already at calculated index,then our new Entry object will be placed at the calculated index.
- If there is already an Entry object at calculated index and new key object also has same hashcode,equals method of Key object is called and 
   - if value of new key object is also equal to the existing Key object's      value,then Value object is replaced with the new  Value.
  - If value of new Key object is not equal to the value of existing Key object value.then Entry object is iterated unless next variable is null.Once next variable with null value is found, next variable of existing Entry object will start pointing to new Entry Object,thus maintaining Linked List structure. so as in our case hashcode returned for following two Employee objects were equal,but there values(Gaurav,Saurav) were different,they landed in same array index(bucket) i.e. 15 maintained in the form of Linked list structure.

Employee emp1 = new Employee("Gaurav","101");
	 * @param args
	 */
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "a");
		Employee e2 = new Employee(1, "a");
		Employee e3 = new Employee(1, "a");
		Map<Employee, String> map =new HashMap<>();
		
		map.put(e1, "This is employee 1");
		map.put(e2, "This is employee 2");
		map.put(e3, "This is employee 3");
		
		if(e1.equals(e2)){
			System.out.println("Objects equals e1==e2");
		}
		
		if(e1.hashCode() == e2.hashCode()){
			System.out.println("Hashcode same");
		}
		
		System.out.println(map.get(e1));
		System.out.println(map.get(e2));
		System.out.println(map.get(e3));
		System.out.println(map.get(new Employee(1, "a")));
	}

}
