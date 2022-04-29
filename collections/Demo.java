package com.infosys.collections;

import com.infosys.Customer1;
//outside of /other packages defaiult is not accessible
//public and protected
public class Demo extends Customer1 {

	public static void main(String[] args) {
		
		Customer1 c=new Customer1();
		Customer1 c1=c; //new Customer1();
		
		System.out.println(c.equals(c1));  //content
		System.out.println(c==c1);  //address
		System.out.println(c+"  "+c1);
		//Demo d=new Demo();
		
		
	}

}
