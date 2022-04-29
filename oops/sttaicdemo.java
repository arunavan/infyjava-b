package com.infosys.oops;
class CarStore {
    public void searchCar(String manufacturer) {
         // finds cars from the desired manufacturer 
    }    
    public void searchCar(float topSpeed) { 
        // finds cars having the desired top speed  
    }
    public void searchCar(float topSpeed, String color) {
        // finds cars having the desired top speed and color   
    }
}
public class sttaicdemo {
	static double balance=99999.99;
	int mobile;
	static{ //once 
		System.out.println("static ");
	}
	{  // number of objects created 
		System.out.println("instance ");
	}
	sttaicdemo() {
		System.out.println("in constructor");
	}
	void show() {
		System.out.println("show..." +balance);
	}
	static void disp() {
		sttaicdemo s=new sttaicdemo();
		System.out.println(s.mobile);
	}
	
	static void sum(String name,int...a) {
		int s=0;
		for(int i=0;i<a.length;i++) 
			s+=a[i];
		System.out.println("sum="+s);
	}
	public static void main(String[] args) {
		
		sum("java",2,3,4);
		sum("abc",2,1);
		sum("xyz",4,5,6,7,8,9);
		
		disp();
		//show();
		System.out.println(balance);
		System.out.println("main");
		sttaicdemo s1=new sttaicdemo();
		sttaicdemo s2=new sttaicdemo();
	}
}
