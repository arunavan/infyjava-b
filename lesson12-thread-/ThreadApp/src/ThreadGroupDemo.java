
class MyRunnable implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

public class ThreadGroupDemo {

	public static void main(String[] args) {
		ThreadGroup tg1 = new ThreadGroup("Group A"); 
		MyRunnable m1=new MyRunnable();
		Thread tt1=new Thread(tg1,m1);
		tt1.start();
		Thread t1 = new Thread(tg1,new MyRunnable(),"one");  
		t1.start();
		//Thread t2 = new Thread(tg1,new MyRunnable(),"two");     
		//Thread t3 = new Thread(tg1,new MyRunnable(),"three");  

	}

}
