class Callme1 {
	synchronized void call( String msg){…….. } }

	class Callme1 {
		void call( String msg) {
			System.out.print( “[“ + msg )
			try {
		              	Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println( “Interrupted”);  }
				System.out.println( “]” )
			}
 }

class Caller implements Runnable {
	String msg;
	Callme1 target;
	Thread t;

public Caller (Callme1 targ, String s) {
	target = targ;
	msg = s;
	t = new Thread( this);
	t.start( );
}

public void run( ) {
	synchronized(target) {
		//synchronized block
		target.call( msg);
	}
}

class SynchroDemo { public static void main (String args[ ] ) {
	Callme1 target = new Callme1( );
	Caller obj1 = new Caller( target, “Hello”);
	Caller obj2 = new Caller( target, “Synchronized”);
	Caller obj1 = new Caller( target, “World”);
	 try {
		ob1.t.join( );
		ob2.t.join( );
		ob3.t.join( );
	} catch (InterruptedException e) {
		System.out.println( “Interrupted”);
	}
}
}