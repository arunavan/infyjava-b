package com.abstraction;
//all abstractmethods , public , abstract 
//supports multiple inheritance
interface Loan{
	static final int x=9;
	void getEmi(Double amt);  //abstract method
	void show(String s);
	
}
interface Parking{
	abstract void getParkingSlot(Double amt);  //abstract method
	
}
class HousingLoanImpl implements Loan{

	public void getEmi(Double amt){
		System.out.println(amt/10);
	}
	public void show(String s) {
		System.out.println(s);
	}
}
class PersonalLoanImpl implements Loan{
	public void getEmi(Double amt){
		System.out.println(amt/8);
	}
	public void show(String s) {
		System.out.println(s.toLowerCase());
	}
}
class VehicleLoanImpl implements Loan,Parking{
	public void getEmi(Double amt){
		System.out.println(amt/20);
	}
	public void show(String s) {
		System.out.println(s.length());
	}
	public void getParkingSlot(Double amt) {
		
	}
}


public class InterfaceDemoApp {

	public static void main(String[] args) {
		Loan l;//=new Loan(); object cant created , ref can be created
		
		HousingLoanImpl h =new HousingLoanImpl();
		h.show("abc");
		h.getEmi(8979.89);
		
		VehicleLoanImpl v= new VehicleLoanImpl();
		v.getEmi(6789.78);
		v.show("xyz");
		
		
		l=new HousingLoanImpl();
		l.getEmi(2345.45);
		l.show("gts");
		
		l=new VehicleLoanImpl();
		l.getEmi(22545.45);
		l.show("iuo") ;  //dynamic binding late binding,polymorphsm
		
		
	}
}
