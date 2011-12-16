/**
*Given a decimal (base 10) number, print out its binary representation. 
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dec2bin {

	public static void main(String[] args) {
		String a = args[0];
		read(a);
		
   }
	public static void read(String f) {
		File file = new File(f);
		
			try {
				Scanner in = new Scanner(file);
				
				while(in.hasNextInt()){
					int a = in.nextInt();
					dothings(a);
				}
		
			} catch (FileNotFoundException e) {
				
			}
			
	}
	private static void dothings(int a) {
		String by = Integer.toBinaryString(a);
		System.out.println(by);
	
		
	}
}