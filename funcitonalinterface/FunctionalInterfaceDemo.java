package com.infosys.funcitonalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		Function<Integer, Integer> f = (v) -> v * 10;
		System.out.println(f.apply(6));
		
		Function<String,String> f1=(s)->s.toUpperCase();
		System.out.println(f1.apply("infyuser"));
		
		Predicate<Integer> p=(s)->s>18;
		System.out.println(p.test(27));
		
		Supplier<Double> generateRandom = ()-> Math.random() * 100;
		System.out.println(generateRandom.get());
		
		Supplier<String> m1 = ()-> "Welcome to Builtin Functional Interface";
		System.out.println(m1.get());
		
		//Consumer<String> m2=(s)->System.out.println(s.toLowerCase());
		
		Consumer<String> m2=(s)->System.out.println(s.toLowerCase());
		
		m2.accept("INFYuser");
		
		List l=Arrays.asList("Ram","Sri","Raj","Kiran");
		
		//l.forEach(n->System.out.println(n));
		l.forEach(System.out::println); //method ref
		
/*
		Consumer<Integer> consumer= x -> System.out.println(x);
		consumer.accept(99);
		
		Supplier<String> b=()-> " Welcome to Supplier Lambda";
		System.out.println(b.get()); 
		
		Predicate<Integer> p=   n->n%5==0; 
		
		System.out.println(p.test(40));
		
		Function<Long,Long> add=new Add();
		Long result=add.apply(50l);
		System.out.println(result);
		*/
	}
}
class Add implements Function<Long,Long> {
	public Long apply(Long a) {
		return a+999;
	}
}