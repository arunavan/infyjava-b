package com.infosys.funcitonalinterface;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;

/**
 * Comparable<T> interface is implemented by the class to Override
 * the compareTo() method. Overriding this methods helps in customizing
 * sorting of objects according to user's need.
 * (In this case, we need to sort Employee objects of names of Employees)
 */
class Employee133 implements Comparable<Employee133> {

	private String empId;
	private String empName;
	private Integer salary;
	private String empRole;
	
	public Employee133(String empId, String empName, Integer salary, String empRole) {
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		this.empRole=empRole;
	}
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	
	@Override
	public int compareTo(Employee133 object) {
		/**
		 * compareTo() compares two string values lexicographically
		 * and returns either 1, 0 or -1. 
		 * 0 if both the strings are same.
		 * 1 if str1>str2 (in str1.compareTo(str2))
		 * -1 if str1<str2 (in str1.compareTo(str2))
		 */
		
		return this.empName.compareTo(object.empName);
	}
	
}

class EmployeeDemo {
	
	public static void main(String args[]) {
        
		List<Employee133> empList = Arrays.asList(
				new Employee133("T1002","Zarvis",35000,"Consultant"),new Employee133("T1003","Mathew",65000,"Manager"),
				new Employee133("T1004","Santana",40000,"Associate"),new Employee133("T1001","Arnold",50000,"Manager"));
		
		/**
		 * 		1. Adding 5000 to the salary of employees, who are "Manager":
		 */
		for(Employee133 e : empList) {
			
			//Displaying Salary of all Employees before Increment using "Consumer":
			Consumer<Employee133> beforeInc = emp -> System.out.println(e.getEmpName()+" ("+e.getEmpRole()+") "+" had salary before Increment: "+e.getSalary());
			beforeInc.accept(e);
			
			//Increment Salary of only Managers using "Function":
			Function<Employee133,Integer> salaryIncrease = emp -> e.getEmpRole().equals("Manager")?e.getSalary()+5000:e.getSalary();
			e.setSalary(salaryIncrease.apply(e));
			
			//Displaying Salary of all Employees after Increment using "Consumer":
			Consumer<Employee133> afterInc = emp -> System.out.println(e.getEmpName()+" ("+e.getEmpRole()+") "+" has salary after Increment: "+e.getSalary());
            afterInc.accept(e);		
		}
		
		
		/**
		 * 		2. Sorting the List of Employee Objects on the basis of Employee Name:
		 */
		//Displaying List before Sorting
		System.out.println("Employee List before Sorting:");
		for(Employee133 e : empList) {
			System.out.println(e.getEmpId()+"--"+e.getEmpName()+"--"+e.getEmpRole());
		}
		System.out.println();
		
		//Sorting List using list.sort() and Lambda Expression
		//list.sort uses Comparator Interface (Comparable<T>) for sorting
		empList.sort((empObj1,empObj2) -> empObj1.compareTo(empObj2));
		
		//Displaying List after Sorting
		System.out.println("Employee List after Sorting:");
		for(Employee133 e : empList) {
			System.out.println(e.getEmpId()+"--"+e.getEmpName()+"--"+e.getEmpRole());
		}
		System.out.println();
		
		
		/**
		 * 		3. Verifying Employees who are "Consultant": 
		 */
		for(Employee133 e : empList) {
			Predicate<Employee133> checkConsultant = (emp)-> emp.getEmpRole().equals("Consultant");
			System.out.println("Is "+e.getEmpName()+" a Consultant? :"+checkConsultant.test(e));
		}
		
	} 

} 
