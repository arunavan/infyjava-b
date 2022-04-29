package com.infosys.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {

	public static void main(String[] args) {  //not orderd(no index) , unique
		Set<Integer> s=new HashSet<Integer>();  //indexed based  add,get,set,remove,indexOf,lastIndexOf
		s.add(10);
		s.add(2);
		s.add(6);
		s.add(13);
		s.add(78);
		s.add(12);
		s.add(13);
		s.add(78);
		s.add(13);
		s.add(78);
		s.add(56);
		//s.lastIndexOf(13);
		//System.out.println(s.get(2));
		//s.set(4,899);
	//	System.out.println(s.contains(78));
	//	System.out.println(s.remove(56));
		System.out.println(s);
	//	System.out.println(s.isEmpty());
	//	Iterator i=s.iterator();
	//	while(i.hasNext()) {
	//		System.out.println(i.next());
	//	}
		Set<Course> courseSet=new TreeSet<Course>();
		Set<Course> courseSet1=new LinkedHashSet<Course>();
		courseSet1.add(new Course(20,"Java"));
		courseSet1.add(new Course(10,"Java"));
		courseSet1.add(new Course(15,"Java"));
		Object a1[]=courseSet1.toArray();
		Arrays.sort(a1);
		for( Object o:a1)
		System.out.println(o);
		courseSet.add(new Course(20,"Java"));
		courseSet.add(new Course(10,"Java"));
		courseSet.add(new Course(10,"Java"));
		courseSet.add(new Course(11,"J2EE"));
		courseSet.add(new Course(11,"J2EE"));
		courseSet.add(new Course(12,"REST"));
		courseSet.add(new Course(12,"REST"));
		courseSet.add(new Course(12,"REST"));
		System.out.println(courseSet);
		
	}
}
