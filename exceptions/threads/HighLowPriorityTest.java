class Counter implements Runnable {
	int count = 0;
	Thread t;
	private volatile boolean running = true;
	public Counter(int p_level){
		t = new Thread(this);
		t.setPriority(p_level);
	}
	public void run(){
		while (running){
			count++;
		}
	}
	public void stop(){
		running = false;
	}
	public void start(){
		t.start();
	}
}

class HighLowPriorityTest {
	public static void main(String args[]){
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Counter high = new Counter(Thread.NORM_PRIORITY+2);
		Counter low = new  Counter(Thread.NORM_PRIORITY-2);
		low.start();
		high.start();
		try {
			Thread.sleep(10000);
		} catch(InterruptedException e) {
			System.out.println("Main Thread  Interrupted");
		}
		low.stop();
		high.stop();
		try {
			low.t.join();
			high.t.join();
		} catch(InterruptedException e) {
			System.out.println("interrupted Exception caught");
		}
		System.out.println("Low Priority Thread’s Iterations: " + low.count);
		System.out.println("High Priority Thread’s Iterations: " + high.count);
	}
}

