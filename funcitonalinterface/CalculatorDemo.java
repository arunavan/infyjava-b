package com.infosys.funcitonalinterface;
@FunctionalInterface
interface Arithmetic1{
	int operation(int a,int b);
}
@FunctionalInterface
interface Gen1<T>{
	T operation(T a,T b,T c);
}
@FunctionalInterface
interface Message{
	void msg(String s);
}
public class CalculatorDemo {
	public static void main(String[] args) {
		Arithmetic1 arith1=(a,b)-> a+b;
		System.out.println(arith1. operation(4,5));
		Arithmetic1 arith2=(a,b)-> a*b;
		System.out.println(arith2. operation(4,5));
		Gen1<Double> g1=(x,y,z)->x*x+y*y+z*z;
		Double r1=g1.operation(4.0, 6.0, 9.0);
		System.out.println(r1);
		Gen1<Integer> g2=(p,q,r)-> p+q-r;
		System.out.println(g2.operation(3, 5, 2));
		Message m=(s)->System.out.println("Welcome to Lamda "+s);
		m.msg("InfosysUser");
	}
}
