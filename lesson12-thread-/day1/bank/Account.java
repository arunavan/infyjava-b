package bank;

public class Account {
	private int balance=11000;
	
	public int getBalance() {
		return balance;
		
	}
	public void withdraw(int amt) {
		balance=balance-amt;
	}

}
