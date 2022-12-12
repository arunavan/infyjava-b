class DemoThread2 implements Runnable {
	String name;
	Thread t;

	DemoThread2(String threadname) {
		name = threadname;
		t = new Thread(this, name);
		System.out.println("New Thread: " + t);
		t.start();
	}
public void run() {
 try {
	for(int i=5; i>0; i--){
		System.out.println("Child Thread: " + i);
		Thread.sleep(1000); }
	} catch (InterruptedException e) {
		System.out.println(name + "Interrupted");
	}
	System.out.println(name +"Exiting");
	}
}

class MultiThreadImpl {
	public static void main(String args[]) {
		new DemoThread("One");
		new DemoThread("Two");
		new DemoThread("Three");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e){
		System.out.println("Main Thread Interrupted");
	}
	System.out.println("Main Thread Exiting");
} }

