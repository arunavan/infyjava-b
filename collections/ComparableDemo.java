package com.infosys.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Emp implements Comparable<Emp> {
	Integer employeeId;
	String name;
	Double salary;
	Emp(Integer employeeId, String name, Double salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}
	public int compareTo(Emp e1)
	{	return (this.name).compareTo(e1.name);
		/* id comparision
		 *  return this.employeeId-e1.employeeId;  */
		/*salary 
		 * if( this.salary>e1.salary)  //5-10
			return 1;
		    else if(this.salary<e1.salary) 
			  return -1;
		    else
			  return 0;
		*/
	}
	@Override
	public String toString() {
		return "Emp [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
	}
}
public class ComparableDemo {
public static void main(String[] args) {
		List<Emp> elist=new ArrayList<Emp>();
		elist.add(new Emp(20,"Ram",8989.90));  //this
		elist.add(new Emp(10,"Aman",4989.90));  //e1 //this
		elist.add(new Emp(30,"Teja",2989.90));   //e1 //this
		elist.add(new Emp(15,"Teja",2989.90));  //e1
		System.out.println(elist);
		Collections.sort(elist);
		System.out.println(elist);
	}
}
