package com.infosys.funcitonalinterface;

public class LoanDemo { // implements Loan {
	//public double getEmi(double amount) {
	//	return amount/12;
	//}
	public static void main(String[] args) {
		Loan l=x->x/12;  //Lamda 
		System.out.println(l.getEmi(50000.00));
		System.out.println(l.getEmi(60000.00));
		Loan.staticshow();
	}

}
