
import java.util.concurrent.Executor; 
import java.util.concurrent.Executors; 
 public class Demo {
	 public static void main(String args[]) {
	  Runnable task = new Runnable() {
	  @Override public void run() {
	  System.out.println("Task is executed by : " + Thread.currentThread().getName());
	 }
	  }; 
	 Thread t = new Thread(task, "MY_THREAD");
	 t.start(); 
	 Executor e = Executors.newSingleThreadExecutor(); 
	  e.execute(task);
	  }
	 }

