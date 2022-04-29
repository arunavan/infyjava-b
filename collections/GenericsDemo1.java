package com.infosys.collections;
class GenericMethod {
	public static <E> void displayDetails (E x) {
		/*
		 * for (E e : inputArray) { System.out.print(e+" "); }
		 */
		System.out.println(x);
	}
}
public class GenericsDemo1 {

	public static void main(String[] args) {
		GenericMethod.displayDetails(20);
		GenericMethod.displayDetails(20);
	}

}
