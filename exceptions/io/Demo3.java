import java.io.File;
import java.io.IOException;

/*
 *  File Source:
 *  -------------
 *  java.io.File
 *  -------------
 *  
 *  --> It Will give complete description about any file to java Program.
 * 
 */

public class Demo3 
{
	public static void main(String[] args) 
	{
		File fileObj = new File("d:/data/abc.txt");

		System.out.println(fileObj.exists());
		System.out.println(fileObj.canExecute());
		System.out.println(fileObj.canRead());
		System.out.println(fileObj.canWrite());
		System.out.println(fileObj.getAbsolutePath());
		System.out.println(fileObj.length());

		// -----------------------------------

		File file = new File("d:/data");
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());

		File file2 = new File("d:/mydir");
		file2.mkdir();

		File file3 = new File("d:/a/b/c");
		file3.mkdirs();

		File file4 = new File("d:/mydir/myfile.txt");
		try 
		{
			file4.createNewFile();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		File file5 = new File("d:/mydir/");

		String[] flist = file5.list();
		
		for (String f : flist)
		{
			System.out.println(f);
		}

		File file6 = new File("d:/mydir/b.txt");

		file6.setReadOnly();
		file6.delete();
		file6.deleteOnExit();  
		// file6.renameTo(arg0)
	}
}