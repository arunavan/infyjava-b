package com.infosys.exceptions;

import java.io.FileReader;

public class Demo {
	static void show() {
		
			int x=10/0;
		
		
	}

	public static void main(String[] args) {
		Thread.sleep(5000);
		try {
			show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//String s=null;
		
		//System.out.println(s.length());  //raising exception null pointer
		//FileReader f=new FileReader("e:\\abc.txt");
				//Thread.sleep(100); //checked , compiletime 
				
		
		// exception handling using try-catch
		/*
		 * try { try { //db Connection //file int y=10/2;
		 * System.out.println("REsult:"+y); }
		 * 
		 * catch (ArithmeticException e) { System.out.println(e.getMessage());
		 * //System.out.println(e); //e.printStackTrace(); }
		 * 
		 * int x[]= {3,4,5}; System.out.println(x[2]);
		 * 
		 * } catch(ArrayIndexOutOfBoundsException e) { try {
		 * 
		 * } catch(Exception e1) {
		 * 
		 * } System.out.println(e); } finally{//optional block, excetion is raised or
		 * not raised // db.close(); // f.close(); try {
		 * 
		 * } catch(Exception e1) {
		 * 
		 * } }
		 */
		System.out.println("Thank you");
	}

}
