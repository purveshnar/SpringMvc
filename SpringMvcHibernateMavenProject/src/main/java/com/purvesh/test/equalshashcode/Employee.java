package com.purvesh.test.equalshashcode;

public class Employee {
	
	int empid;
	String empName;
	
	public Employee(int empid, String name) {
		this.empid = empid;
		this.empName = name;
	}

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + empid;
		return result;
	}*/

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empid != other.empid)
			return false;
		return true;
	}
	
	/*@Override
	public boolean equals(Object e) {
		if ((this.empid == ((Employee)e).empid) && this.empName.equals(((Employee)e).empName)) {
			return true;
		} else {
			return false;
		}
	}*/
	
	

}
