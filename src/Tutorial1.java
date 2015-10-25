import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Date;
import java.util.Scanner;

public class Tutorial1 {
	
	/*
	 * Tutorial1 will demonstrate how to read a file in as an argument.
	 * This will allow running (passing in) a file as an argument through 
	 * the command prompt.
	 * Tutorial1 will also demonstrate writing to a file. More specifically,
	 * a log file which is provided as an argument.
	 */
	public static void main(String[] args) {
		
		
		try {
			Scanner myScanner = new Scanner(new FileReader(args[0]));
			String line = myScanner.nextLine();
			//Read the first like from the input text file.
			System.out.println(line);
			
			
			Date date = new Date();
			//Now print to a file. Let's print the date to a log file.
			PrintStream out = new PrintStream(new FileOutputStream(args[1],true));
			out.println("****\t<"+date+">\t****");
			out.println("\t"+line+"\n");
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Could not read file.");
			e.printStackTrace();
		}
		
		
		
		System.out.println("Success!");
		
	}
}
