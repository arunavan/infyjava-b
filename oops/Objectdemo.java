package com.infosys.oops;


//java.lang.Object

// equals(), hashCode(), getClass(), toString(), finalize(), wait(),notify(),notifyAll(), 
// clone()
class Product implements Cloneable {
	Integer id;
	String name;
	Product() {
		id=90;
		name="bag";
	}
	public Object clone() throws  CloneNotSupportedException{
		return super.clone();
		}
	  @Override public String toString()
	  { return "Product [id=" + id + ", name=" +
	  name + "]"; }
	public  void finalize() {
		id=0;
		name=null;
	}
	
}
public class Objectdemo {
	public static void main(String[] args) throws  CloneNotSupportedException{
		String s=new String("infosys");
		System.out.println(s.getClass());
		Product p=new Product();
		System.out.println(p.getClass());
		Product p1=new Product();
		//Product p2=p1;
	//	System.out.println(p1.equals(p2));
	//	System.out.println(p.hashCode()+"  "+p2.hashCode());
		System.out.println(p1+"  "+p1.hashCode());
		Product p2=(Product)p1.clone();
		System.out.println(p1 +"  "+p1.hashCode());
		System.out.println(p2 +"  "+p2.hashCode());
	}
}
