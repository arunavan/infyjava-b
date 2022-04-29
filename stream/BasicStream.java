package com.infosys.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
class Employee23{
	private String name;
	private Double salary;
	public Employee23(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee23 [name=" + name + ", salary=" + salary + "]";
	}	
	
}
public class BasicStream {

	public static void main(String[] args) {
		
		Stream<Employee23> empStream = Stream.of( new Employee23("Tom",5699.5),
				new Employee23("Jack",7629.2),new Employee23("Jane",5289.8));
		empStream.forEach(System.out::println);
		
		List<String> castList = List.of("Sam","Dean","Castiel","Crowley");
		castList.stream().filter(x->x.length()<=4).forEach(System.out::println);
		//castList.stream().map(x->x.length()).forEach(System.out::println);
		Stream<String> supernatural = castList.stream();
		//supernatural.forEach(x->System.out.println(x));
		//stream can be created with static data
		Stream<String> stream = Stream.of("I","G","I","G","A","T","E","\n");
		//stream.map(x->x.toLowerCase()).sorted().limit(2).forEach(System.out::println);
		
		stream.distinct().forEach(x->System.out.println(x));
		//stream can be acquired from array or collections
		List<String> locations = Arrays.asList(new String[]{"Pune","Mumbai","Chennai","Banglore","Noida"});
		stream = locations.stream();
		stream.forEach(System.out::println);
		
	}
}
