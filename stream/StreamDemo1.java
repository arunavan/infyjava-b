package com.infosys.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Emp9{
	Integer id;
	String name;
	Double salary;
	public Emp9(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp9 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
public class StreamDemo1 {

	public static void main(String[] args) {
		List<String> castList = List.of("Sam","Samy","Dean","Castiel","Sam","Crowley");
		
		castList.parallelStream().forEach(System.out::println);
		
		//intermediate- filter,map, limit,distrinct,sorted... , terminal - count , forEach, collect
	//	castList.stream().sorted((y1,y2)->y2.compareTo((y1))).forEach(System.out::println);
		
		Stream<Integer> ss=Stream.of(4,7,9,2,3,4,1,2,1,4);
		
		Set<Integer> newList=ss.filter(val->val<5).distinct().collect(Collectors.toSet());
		
		
		
	//	List<Integer> newList=ss.filter(x->x<5).collect(Collectors.toList());
		System.out.println(newList);
		/*Stream<Integer> ss2=Stream.of(4,7,9,2,3,4,1);
		
		ss2.forEach(System.out::println);
		
		newList.forEach(System.out::println);
		
		*/
		
		//ss.sorted((x1,x2)->x2-x1).forEach(System.out::println);
		
		//castList.stream().map(x->x.toUpperCase()).filter(y->y.length()==4).forEach(System.out::println);
		
		//castList.stream().limit(3).distinct().forEach(x->System.out.println(x));
		
	/*	System.out.println("array values using stream...");
		
		Integer[] array = {672,3,4,5,5,6, 340, 999};
		
		Stream<Integer> stream = Arrays.stream(array);
		stream.forEach(x->System.out.println(x));
		
		System.out.println(" Direct stream data");
		Stream<Integer> s2 = Stream.of(672, 340, 999);
		s2.forEach(System.out::println);
		
		Emp9 e1=new Emp9(10,"Jack",7629.2);
		Emp9 e2=new Emp9(8,"smith",7629.2);
		Emp9 e3=new Emp9(15,"amith",7629.2);
		
		Stream<Emp9> empStream = Stream.of(e1 ,e2,e3);
		
		*/
	//	empStream.forEach(e->System.out.println(e.id+"  "+e.name+"  "+e.salary));
	//	empStream.forEach(e->System.out.println(e));
		
		
	//	Stream<String> y = castList.stream();
	//	y.forEach(System.out::println);
		
	/*	castList.forEach(x->System.out.println(x));
		
		Stream<String> supernatural1 = castList.stream();
		System.out.println("using stream....s");
		castList.stream().limit(3).forEach(System.out::println);
		supernatural.limit(2).forEach(x->System.out.println(x));
		supernatural1.distinct().forEach(x->System.out.println(x));
		
		*/
	}

}
