package bank;

public class AccountHolder implements Runnable{
	
	private Account account;
	
	public AccountHolder(Account account) {
		
		this.account = account;
	}

	public void run() {
		for(int i=1;i<=5;i++) {
			makeWithdrawal(2000);
			if(account.getBalance()<0)
			{
				System.out.println("Account is overdrawn");
			}
		}
	}
	private synchronized  void makeWithdrawal(int withdrawAmt) {
		if(account.getBalance()>withdrawAmt) {
			System.out.println(Thread.currentThread().getName()+ "is going to withdraw  "+withdrawAmt);
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				
			}
			account.withdraw(withdrawAmt);
			System.out.println(Thread.currentThread().getName()+ " complete the withdrawal "+withdrawAmt);
		} else {
			System.out.println("Not enough in account"+Thread.currentThread().getName()+ "  "+account.getBalance());
		}
		
	}

}
