import java.io.*;

public class Demo4
{
	public static void main(String args[])
	{
		File fileObj = new File("d:/test/abc.txt");
		
		System.out.println(fileObj.exists());

		//System.out.println(fileObj.canExecute());
		
		System.out.println(fileObj.canRead());
		
		System.out.println(fileObj.canWrite());

		System.out.println(fileObj.getAbsolutePath());
		
		System.out.println(fileObj.length());
	}
}