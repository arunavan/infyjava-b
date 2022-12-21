package bank;

public class Main {
	public static void main(String[] args) {
		Account account =new Account();
		AccountHolder accountHolder =new AccountHolder(account);
		Thread t1=new Thread(accountHolder);
		Thread t2=new Thread(accountHolder);
		t1.setName("John");
		t2.setName("Smith");
		t1.start();
		t2.start();
	}

}
