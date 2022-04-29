package com.infosys.funcitonalinterface;



import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Employee implements Comparable{
	Integer id;
	String name;
	Double salary;
	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public Employee() {}
	
	Double getSalary() {
		return 99999.99;
	}
	@Override
	public int compareTo(Object o) {
		Employee e=(Employee)o;
		
		       // this.id-e.id;  // (this.name).compareTo(e.name);
		
		if(this.salary>e.salary)
			return -1;
		else if(this.salary<e.salary)
			 return 1;
		else
			return 0;
			
		
	}
	
}

@FunctionalInterface
interface MyCustomFI {
	Integer getProduct(Integer a,Integer b);
	
}

public class CustomDemo1 {

	public static void main(String[] args) {
		
		Supplier<Integer> x=()-> 20*30;
		System.out.println(x.get());
		MyCustomFI my=(a,b)->a*b;
		System.out.println(my.getProduct(5, 6));
   	List<String> nameList = Arrays.asList("Rachael","Ram","Se","Ross","Monica","Chandler","Joey","Phoebe");
			System.out.println("before sorting...");
		System.out.println(nameList);
			//Collections.sort(nameList);
		System.out.println("after  sorting...");
		//Comparator<String> cc=(c1,c2)->c2.compareTo(c1);  //0, 1 ,-1
		Comparator<String> cc=(c1,c2)->c1.charAt(0)-c2.charAt(0); 
		//Comparator<String> cc=(c1,c2)->c2.length()-c1.length();
		nameList.sort(cc);	
		System.out.println(nameList);
			List<Integer> ilist=Arrays.asList(34,23,23,15,76,56,98,78,11);//Collections.sort
		Comparator<Integer> comp=(c1,c2)->c2-c1;
		ilist.sort(comp);
		System.out.println(ilist);
		
		List<Employee> empList =
				
				
				Arrays.asList(new Employee(23,"Arnold",50000.00),
				new Employee(45,"Zarvis",35000.00),new Employee(10,"Mathew",65000.00),
				new Employee(22,"Santana",40000.00));
		empList.forEach(e->System.out.println(e.id  +"  "+e.name+"  "+e.salary));
		empList.sort(  (w1,w2)->w1.compareTo(w2));
		System.out.println();
		empList.forEach(e->System.out.println(e.id  +"  "+e.name+"  "+e.salary));
		for(Employee e : empList) {
			Predicate<Employee> checkName = (emp)-> emp.name.equals("Santana");
			System.out.println(e.name +"  Name checking:"+checkName.test(e));
		}
    for(Employee e : empList) {
			//Increment Salary of only for Santana
			Function<Employee,Double> salaryIncrease = emp -> e.name.equals("Santana")?e.salary+5000.00:e.salary;
			e.salary=salaryIncrease.apply(e);
			
			}
      empList.forEach(e->System.out.println(e.id  +"  "+e.name+"  "+e.salary));
		
      
      // Consumer  --- will accept input   --accept()
      
      Consumer<String> c1=(s)->System.out.println(s.length());
      c1.accept("Infosys");
      
      // Supplier -- will give the -- get()
      Employee e=new Employee();
      Supplier<Double> s1=()->  9999.99;  //(e.getSalary());
      
      System.out.println(s1.get());
      
      Predicate<Integer> evenOddcheck=(u)->u%2==0;
      
      System.out.println(evenOddcheck.test(5));
      System.out.println(evenOddcheck.test(8));
      
      Function<Integer,Integer> cube =(k)->k*k*k;
      System.out.println(cube.apply(5));
      
      
	}
}
