import java.io.*;
import java.lang.String;

public class FileExtension{
	 
	public void show(String extension){
		System.out.println("Extension is" + " " + extension);
		}
		public static void main(String args[])throws IOException{
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the file name:");
			String filenameExtension = bf.readLine();
			File filename = new File(filenameExtension);
		    if(!filename.exists())
		    {
			System.out.println("File does not exist.");
			System.exit(0);
		    }
			String extension;
			int dotPos = filenameExtension.lastIndexOf(".");
			extension = filenameExtension.substring(dotPos);
			FileExtension abc = new FileExtension(); 
			abc.show(extension);
			}
} 