class DemoThread3 implements Runnable {
	String name;
	Thread t;
	DemoThread3(String threadname){
		name = threadname;
		t = new Thread(this, name);
		System.out.println("New Thread: " + t);
		t.start();
	}

	public void run(){
		try {
			for(int i=5; i>0; i--){
				System.out.println("Child Thread: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(name + "Interrupted");
		}
		System.out.println(name +"Exiting");
	}
}

class MultiThreadImpl1 {
	public static void main(String args[]){
		DemoThread t1 = new DemoThread("One");
		DemoThread t2 = new DemoThread("Two");
		DemoThread t3 = new DemoThread("Three");
		System.out.println("Thread One is alive:"+t1.t.isAlive());
		System.out.println("Thread Two is alive:"+t2.t.isAlive());
		System.out.println("Thread Three is alive:“+t1.t.isAlive());
		try {
			System.out.println("Waiting for child  threads to finish");
			t1.t.join();
			t2.t.join();
			t3.t.join();
		} catch (InterruptedException e){
			System.out.println("Main thread interrupted");
		}
		System.out.println("Thread One is alive:"+  t1.t.isAlive());
		System.out.println("Thread One is alive:”+  t1.t.isAlive());
		System.out.println("Thread One is alive: " +   t1.t.isAlive());
		System.out.println("Main thread exiting");
	}
}
