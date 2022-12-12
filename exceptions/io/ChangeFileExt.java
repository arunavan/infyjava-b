import java.io.*;

public class ChangeFileExt{
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please enter the filename with extension to be changed: ");
		String oldfileExtension = in.readLine();
		File oldfile = new File(oldfileExtension);
		if(!oldfile.exists())
		{
			System.out.println("File does not exist.");
			System.exit(0);
		}
		int dotPos = oldfileExtension.lastIndexOf(".");
		String strExtension = oldfileExtension.substring(dotPos + 1);
		String strFilename = oldfileExtension.substring(0, dotPos);
		System.out.print("Enter file extension to change the file type: ");
		String newfileExtension = in.readLine();
		String strNewFileName = strFilename + "." + newfileExtension;
		File newfile = new File(strNewFileName);
		boolean Rename = oldfile.renameTo(newfile);
		if(!Rename)	{
			System.out.println("FileExtension hasn't been changed successfully.");
		}
		else {
			System.out.println("FileExtension has been changed successfully.");
		}
	}
}