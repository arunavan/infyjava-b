package com.infosys.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

class Scholar{
	
	Integer id;
	String name;
	String course;
	Scholar() {}
	@Override
	public String toString() {
		return "Scholar [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Scholar(Integer id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	
	
}

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		Vector<Integer> l=new Vector<Integer>(); //synchronized
		l.add(34);
		l.add(56);
		l.add(null);
		l.add(null);
		l.add(65);
		l.set(4, 888);
		l.add(78);
		l.add(44);
		l.add(65);
		l.add(78);
		l.add(44);
		l.add(88);
		System.out.println(l);
		System.out.println(l.get(2));
		System.out.println(l.size());
		System.out.println(l.contains("java"));
		System.out.println(l.isEmpty());
		//l.clear();
		System.out.println(l.indexOf(44));
		System.out.println(l.lastIndexOf(44));
		System.out.println(l.remove(new Integer(88)));
		System.out.println(" after remove");
		System.out.println(l);
		List<Integer> l1=Arrays.asList(20,30,40,60);
		l.addAll(l1); //bulk addition
		System.out.println(l);
		//l.removeAll(l1);
		//l.retainAll(l1);
		l.remove(new Integer(60));
		System.out.println(l.containsAll(l1));
		System.out.println(l);	
		
		System.out.println("using iterator=====");
		
		Iterator i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		//Object ar[]=l.toArray();
		
		//String ls=l.toString();
		
	//	System.out.println(ls);
		
		
		List<Scholar>  slist=new ArrayList<Scholar>();
		
		slist.add(new Scholar(10,"Ram","java"));
		slist.add(new Scholar(11,"Kiran","java"));
		slist.add(new Scholar(12,"Smith","java"));
		slist.add(new Scholar(13,"John","java"));
		/*
		 * System.out.println(slist); slist.remove(new Scholar(12,"Smith","java"));
		 * 
		 * for(int x=0;x<slist.size();x++) System.out.println(slist.get(x));
		 * 
		 * for(Scholar s: slist) System.out.println(s);
		 */
	
		ListIterator it=slist.listIterator();
		while(it.hasNext()) { //checking with availability
			System.out.println(it.next());//current object
		}
		while(it.hasPrevious()) { //checking with availability
			System.out.println(it.previous());//current object
		}
		
		Stack s=new Stack();
		s.push(23);
		s.push(78);
		s.push(67);
		s.push(34);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
		s.empty();
		
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		
		
		
	   
		// slist.stream().forEach(System.out::println);
		
		
		
		
		/*
		int a[]= {2,3,4,5,6,7};
		int b[]=new int[10];  //sttaic, homogeneous elements
		Integer i[]= {2,3,4,5,6};
		Scholar scholars[]=new Scholar[10];
		scholars[0]=new Scholar(10,"ram1","java");
		scholars[1]=new Scholar(11,"ram2","java");
		scholars[2]=new Scholar(12,"ram3","java");
		for(int i1=0;i1<scholars.length;i1++)
		System.out.println(scholars[i1]);
		Object objects[]=new Object[5];
		objects[0]=new Scholar(10,"ram1","java");
		objects[1]="java";
		objects[2]=43543.5676;
		for(Object o : objects)
			System.out.println(o);
		*/
	 //Integer x=new Integer(10);
		// System.out.println(x.getClass());
		 //System.out.println(x instanceof Integer);
		 
		 ArrayList<String> nameList = new ArrayList<String>();//Line1
			nameList.add("Harrison");
			nameList.add("Sirius");
			nameList.add("James");
			nameList.add("Lily");
			nameList.add("Chosfsfasfasfasfsa");
			nameList.add("Hermione");
			
			//findLongestString(nameList);
		}
		
		public static void findLongestString(List<String> list) {
			String longest = "";
			for (String object : list) {
				if(object.length() > longest.length())
					longest = object;
			}
			System.out.println("The string having the maximum length is "+ longest);
		 
		 
	}

}
