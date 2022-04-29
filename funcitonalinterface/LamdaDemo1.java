package com.infosys.funcitonalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// Supplier , Consume  , Predicate, Function

@FunctionalInterface  // with 1 single abstract method
interface Arith123<T>{
   T operation(T x,T y);
   // void disp();
}
@FunctionalInterface
interface I1{
   String msg(String s);
}

@FunctionalInterface
interface MultiI1{
   double cube(double x,double y,double z);
}


public class LamdaDemo1 {
	public static void main(String[] args) {
		Arith123<Integer> ai=(Integer x, Integer y)->     x+y;   
		System.out.println(ai.operation(5, 6));
		Arith123<Double> ai1= ( x, y)->  x*y;
		System.out.println(ai1.operation(5.23, 6.32));
		
		Arith123<Double> ai2= ( x, y)->  x/y;
		System.out.println(ai2.operation(100.00,10.00));
		
		//I1 i1=()->System.out.println("Welcome to Lamda");
		//i1.msg();
		I1 i1=(s)->s.toUpperCase();
		System.out.println(i1.msg("Infosys USer"));

		MultiI1 i2=(a,b,c)->a*a+b*b+c*c;
		System.out.println(i2.cube(2,3,4));
		
		//apply
		Function<Long, Long> addNum = (x) -> x + 10;
		System.out.println(addNum.apply(50l));            //Function, apply()
		
		Function<Integer, Double> a = (x) -> x*x*45.56;
		System.out.println(a.apply(5));  
		
		//test
		Predicate<Integer> checkAge = (age) -> age > 18; //true, false
		System.out.println(checkAge.test(25));
		System.out.println(checkAge.test(5));
		
		Predicate<String> validate=(str)->str.equalsIgnoreCase("infosys");
		System.out.println(validate.test("infosys"));
		
		//get
		Supplier<Integer> x = ()->  new Integer((int) (Math.random() * 1000));
		System.out.println(x.get());
		
		
		//accept
		Consumer<String> y = String::toUpperCase;  //(name)-> System.out.println(name.toUpperCase());
		y.accept("Ram");
		
		
		
		List<String> strArr = List.of("Tyson", "Kai", "Max", "Ray", "Daichi");
		
		//strArr.forEach(xx->System.out.println(xx));
		System.out.println("Method reference...");
		strArr.forEach(System.out::println);
		
	//	Integer ar[]= {3,4,2,5,6,7};
		System.out.println("with stream Method reference...");
		
		strArr.stream().forEach(System.out::println);
	
		BiPredicate<Integer,String> checkExpRole = (exp,role) -> exp>4 && role=="Manager";
		System.out.println(checkExpRole.test(5, "Manager"));
		System.out.println(checkExpRole.test(2, "Analyst"));
	
	}

}
