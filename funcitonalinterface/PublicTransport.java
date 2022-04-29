package com.infosys.funcitonalinterface;


//interface cannot be instantiated
public interface PublicTransport {  //public, abstract   before java8
	//public static final 
	Double PI=3.142;
	 double calculateFare(); //public abstract 
	 void bookTransport();
	 void payBill();
}
 
interface Parking {  //java8
	
	void bookParkingSlot();
	
	default void show() {  //default method , if required overriden
		
	}
	static void staticshow() {  //cannot method cannot be overriden
		System.out.println("static method");
	}
	
}

interface Account{  //java9 
	int getBalance(int y);
	default int getLoanAmount() {return 89;}
   default void show123() {  //default method , if required overriden
	   disp();
		
	}
	static void staticshow() {  //cannot method cannot be overriden
		
		disp();
		System.out.println("static method");
	}
	private static void disp() {
		
	}
	
	
}
