class DemoThread implements Runnable {
	Thread t;
	DemoThread() {
		t = new Thread(this, "Demo Thread");
		System.out.println("Child Thread: " + t);
		t.start();
	}

	public void run() {
		try {
			for(int i=5; i>0; i--){
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child Thread Interrupted");
		}
		System.out.println("Exiting Child Thread");
	}
}

class ThreadImpl {
	public static void main(String args[]){
		new DemoThread();
		try {
			for(int i=5; i>0; i--){
				System.out.println("Main Thread: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e){
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main Thread Exiting");
	}
}