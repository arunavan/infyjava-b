package com.infosys.collections;

public class GenericsExample<T1,T2> {
//	public class ArraysLengthTester { //T1,T2 are two data types
		    //method takes two array type parameters of type T1,T2
	    public String lengthTester(T1[] arr1,T2[] arr2) {
			return (arr1.length==arr2.length?"Equal":"Not Equal");
		}
		public static void main(String[] args) {
			String[] sarr = {"A","B","C"};
			Integer[] numarr1 = {1,2,3,4};
			Integer[] numarr2 = {4,5,6};
			
			GenericsExample<String,Integer> tester1 = new
					GenericsExample<String,Integer>();
			System.out.println(tester1.lengthTester(sarr, numarr2));
			
			GenericsExample<Integer,Integer> tester2 = new
					GenericsExample<Integer,Integer>();
			System.out.println(tester2.lengthTester(numarr1, numarr2));
			
		}
	}