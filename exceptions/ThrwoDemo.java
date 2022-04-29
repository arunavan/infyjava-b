package com.infosys.exceptions;
//custom exception or userdefined exception
class StockNotAvailableException extends Exception{
	
	StockNotAvailableException(String msg){
		//System.out.println(msg);
		super(msg);
		
	}
	
}
class MinimumDepositException1 extends Exception {
	MinimumDepositException1(String msg)
	{
		//super(msg);
	}
}
public class ThrwoDemo {
	public static void main(String[] args) throws StockNotAvailableException,MinimumDepositException1{
		int stock=10;
		if(stock<50)
				throw new StockNotAvailableException("Minimum stock is 50 , currently stock is not available ");
			else
				System.out.println("avaiable");
		int amt=1999;
		if(amt<1000)
			throw new MinimumDepositException1("Deposit only 1000 and above");
		else
			System.out.println("Thanks for using services");
			
	}

}
