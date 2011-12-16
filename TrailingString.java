/**
*You are given two strings 'A' and 'B'. Print out a 1 if string 'B' occurs at the end of string 'A'. 
*Else a zero.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class sameend {
	
	public static void main(String[] args) {

		read(args[0]);
		
		
	}

	public static void read(String f) {
		File file = new File(f);

		try {
			Scanner in = new Scanner(file);

			while (in.hasNext()) {
				String str = in.nextLine();
				System.out.println(bInA(str));
				
				
			}

		} catch (FileNotFoundException e) {

		}
	}

	private static String bInA(String str) {
		String[] s = str.split(",");
		if(s[0].length() > s[1].length()){
			return bInA(s[0], s[1]);
		}
		else 
			return "0";
	}

	private static String bInA(String a, String b) {
		int c = a.length() - (b.length());
		if(a.substring(c).equals(b)){
			return "1";
		}
		
		return "0";
	}

}
