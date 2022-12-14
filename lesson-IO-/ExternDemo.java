package com.exceptions;
import java.io.*;
class Car implements Externalizable {
     int age;
    String name;
    int year;
    public Car()
    {  System.out.println("Default Constructor called");
    }
 
   
     
	public Car(int age, String name, int year) {
		
		this.age = age;
		this.name = name;
		this.year = year;
	}


	@Override
    public void writeExternal(ObjectOutput out)
        throws IOException
    {
        out.writeObject(name.toUpperCase());
        out.writeInt(age+20);
        out.writeInt(year-10);
    }
 
    @Override
    public void readExternal(ObjectInput in)
        throws IOException, ClassNotFoundException
    {
        name = (String)in.readObject();
        age = in.readInt();
        year = in.readInt();
        
    }
   
}
 
public class ExternDemo {
    public static void main(String[] args)
    {
        Car car = new Car(10,"Shubham", 1995);
        Car newcar = null;
        // Serialize the car
        try {
            FileOutputStream fo
                = new FileOutputStream("C:\\Users\\it\\Downloads\\abc.txt");
            ObjectOutputStream so
                = new ObjectOutputStream(fo);
            so.writeObject(car);
            so.flush();
        }
        catch (Exception e) {
            System.out.println(e);
        }
 
        // Deserialization the car
        try {
            FileInputStream fi
                = new FileInputStream("C:\\Users\\it\\Downloads\\abc.txt");
            ObjectInputStream si
                = new ObjectInputStream(fi);
            newcar = (Car)si.readObject();
        }
        catch (Exception e) {
            System.out.println(e);
        }
         System.out.println("The original car is:\n" + car.name+" "+car.age+" "+car.year);
        System.out.println("The new car is:\n" + newcar.name+" "+newcar.age+" "+newcar.year);
    }
}