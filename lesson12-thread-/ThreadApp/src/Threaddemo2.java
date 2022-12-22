//type 2
class T1 implements Runnable {
	public void run() {
		try {
			for(int i=0;i<=5;i++) {
				System.out.println("Child:"+i);
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Threaddemo2 {
	public static void main(String[] args) {
		T1 t1=new T1();
		Thread tt1=new Thread(t1);
		tt1.start();
	//	tt1.start();
		try {
			for(int i=0;i<=5;i++) {
				System.out.println("Main:"+i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

}
