class DemoThread1 extends Thread {
	DemoThread1(){
		super("Demo Thread");
		System.out.println("Child Thread:" + this);
		start();
	}
 	public void run(){
		try {
			For(int i=5; i>0; i--){
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child Thread Interrupted");
}
		System.out.println ("Exiting Child Thread");
	}
}

class ThreadImpl1 {
	public static void main(String args[]) {
		new DemoThread();
		try {
			for(int i=5; i>0; i--){
				System.out.println("Child Thread: " + i);
				Thread.sleep(1000);
			}
		}  catch (InterruptedException e)  {
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main Thread Exiting");
	}
}
