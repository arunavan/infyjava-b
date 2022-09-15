package com.abstraction;

//not pure abstract , allows concrete( method with body) ,
//no restriction for access spesifiers,
// not allows multiple inheritance
abstract class Loan1{
	int x;
	Loan1(){ //not to create , initialize
		x=10;
	}
	abstract void getEmi(Double amt);  //abstract method
	abstract void show(String s); //force to implement in sub class/impl
	void disp() {
		System.out.println("concrete..."+x);
	}
}
abstract class Parking1{
	abstract void getParkingSlot(Double amt);  //abstract method
	
}
class HousingLoanImpl1 extends  Loan1{

	public void getEmi(Double amt){
		System.out.println(amt/10);
	}
	public void show(String s) {
		System.out.println(s);
	}
	void disp() {
		System.out.println("sub class..");
	}
}
class PersonalLoanImpl1 extends  Loan1{
	public void getEmi(Double amt){
		System.out.println(amt/8);
	}
	public void show(String s) {
		System.out.println(s.toLowerCase());
	}
}
class VehicleLoanImpl1 extends Loan1 {//,Parking1{
	public void getEmi(Double amt){
		System.out.println(amt/20);
	}
	public void show(String s) {
		System.out.println(s.length());
	}
}


public class AbstractDemo {

	public static void main(String[] args) {
		Loan1 l;// =new Loan1(); object cant created , ref can be created
		l=new PersonalLoanImpl1();
		l.disp();
	}
}
