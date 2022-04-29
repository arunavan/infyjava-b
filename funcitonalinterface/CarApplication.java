package com.infosys.funcitonalinterface;

class CarApplication  implements PublicTransport,Parking,Account {
	public int getBalance(int y) {
		return 7;
	}
	
	
	public 	double calculateFare() {
		return 9.00;
	}
	public	 void bookTransport() {
		 System.out.println(" booking is done");
	 }
	public	 void payBill() {
		 
	 }
	public	 void bookParkingSlot() {
		 System.out.println("nnnn");
	 }
	public static void main(String[] args) {
		CarApplication c=new CarApplication();
		c.bookTransport();
		PublicTransport p=new CarApplication();
		p.bookTransport();
	}
	
}