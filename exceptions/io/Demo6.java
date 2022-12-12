import java.io.*;

public class Demo6
{
	public static void main(String args[])
	{
		File file2 = new File("d:/test/mydir");
		
		file2.mkdir();

		File file3 = new File("d:/test/a/b/c");
	
		file3.mkdirs();

		File file4 = new File("d:/test/mydir/myfile.txt");

		try 
		{
			file4.createNewFile();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}