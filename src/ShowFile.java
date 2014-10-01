
import java.io.*;

public class ShowFile {
	public static void main(String args[])
	{
		int i;
		FileInputStream fin = null;
		
		if(args.length != 1){
			System.out.println("Usage: ShowFile File");
			return;
		}
		
		try {
			fin = new FileInputStream(args[0]);
			System.out.println("Open file..");
			System.out.println("Reading file...");
			do{
				i = fin.read();
				if(i != -1) System.out.print((char)	i);
			}while( i != -1);		
		}		
		catch(FileNotFoundException exc){
			System.out.println("File not found");
			return;
		}
		catch(IOException exc){
			
		}
		
		try{
			System.out.println("Reading file...");
			do{
				i = fin.read();
				if(i != -1) System.out.print((char)	i);
			}while( i != -1);
		}
		catch (IOException exc){
			System.out.println("Error reading file.");
		}
		
		try {
			System.out.println("Closing file.");
			fin.close();
		}
		catch (IOException exc){
			System.out.println("Error closing file.");
		}		
	}
}
