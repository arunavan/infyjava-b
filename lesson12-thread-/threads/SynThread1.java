class Share extends Thread{
	static String msg[]={"This", "is", "a", "synchronized", "variable"};
	Share(String threadname){
		super(threadname);
	}
	public void run(){
		display(getName());
	}
	public synchronized void display(String threadN){
		for(int i=0;i<=4;i++)
			System.out.println(threadN+msg[i]);
			try{
			this.sleep(1000);
	}catch(Exception e){}
		}
}
public class SynThread1 {
	public static void main(String[] args) 	{
		Share t1=new Share("Thread One: ");
		t1.start();
		Share t2=new Share("Thread Two: ");
		t2.start();
}
}
