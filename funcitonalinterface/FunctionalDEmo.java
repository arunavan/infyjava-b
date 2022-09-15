package com.abstraction;
@FunctionalInterface  //custom , userdefined funcitonal interface
interface Arith{ // with 1 abstract method, lambda
	int operation(int a,int b);
	
}
public class FunctionalDEmo {
	public static void main(String[] args) {
		Arith arith=(int a,int b)-> {
			                       return a+b; 
			                          };
		System.out.println("sum:"+arith.operation(20, 30));
		Arith division=(a,b)->a/b;
		System.out.println("quotient:"+division.operation(60, 5));
		Arith difference=(a,b)->a-b;
		System.out.println(difference.operation(40, 20));
		
	}

}

/*/*
 * class SubDemo implements Arith{
 *  public int operation(int a,int b) 
 * { return a+b; 
 * } }
 * 
 */
//   ()->statement


