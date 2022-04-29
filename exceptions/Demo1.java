package com.infosys.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
class X {
	void show() throws InterruptedException ,FileNotFoundException{
	}
}
public class Demo1 extends X{
      @Override                    //checked exceptions
	 void show() throws InterruptedException   ,FileNotFoundException{
		Thread.sleep(500);
		//FileReader f=new FileReader("e:\\abc.txt");
	}
	public static void main(String[] args)throws InterruptedException ,FileNotFoundException 
	{
		Demo1 d=new Demo1();
		d.show();
       System.out.println(" done...");
	}

}
