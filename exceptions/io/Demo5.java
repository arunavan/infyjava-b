import java.io.*;

public class Demo5
{
	public static void main(String args[])throws Exception
	{
		File file = new File("d:/test/data/abc.txt");

		System.out.println(file.exists());
		
		file.createNewFile();
		
		System.out.println(file.exists());
	}
}