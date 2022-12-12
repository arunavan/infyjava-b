class Shared {

int num=0;
boolean value = false;
		
synchronized int get() {
	if (value==false) 
	try {
		wait();
		}
	catch (InterruptedException e) {
	System.out.println("InterruptedException caught");
		}
System.out.println("consume: " + num);
value=false;
notify();
return num;
}

synchronized void put(int num) {
	if (value==true) 
	try {
		wait();
		}
	catch (InterruptedException e) {
	System.out.println("InterruptedException caught");
		}
		this.num=num;
		System.out.println("Produce: " + num);
		value=false;
		notify();
		}
		}

		class Producer extends Thread {
	Shared s;
	
	Producer(Shared s) {
		this.s=s;
		this.start();
	}

	public void run() {
		int i=0;
		
		s.put(++i);
		}
}

class Consumer extends Thread{
	Shared s;
	
	Consumer(Shared s) {
		this.s=s;
		this.start();
	}

	public void run() {
		s.get();
		}
}

public class InterThread{
	public static void main(String[] args) 
	{
		Shared s=new Shared();
		new Producer(s);
		new Consumer(s);
	}
}
