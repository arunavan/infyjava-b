package com.infosys.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class Ex5trycatchdemo {

	public static void main(String[] args) {
//java7 try-with resource
//no need of finally{}
	//	FileReader fr=null;
		try(FileReader fr=new FileReader("e:\\demo.java"))   //no need to close, no need of finally {}
		{
			
		}
		catch(IOException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
			//multi catch block
		}
		
		
		// 1 try- catch
		//2 try- multiple catch
		//3 try-catch-finally
		//4 nested try catch
		//5 try with resource and multi catch block

	}

}
