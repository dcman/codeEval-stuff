/**
*The first argument will be a text file containing an input string followed by a 
*comma and then the characters that need to be scrubbed. e.g. 
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class remove_chars {
	static String out = "";
	public static void main(String[] args) {

		read(args[0]);
		
	}

	public static void read(String f) {
		File file = new File(f);

		try {
			Scanner in = new Scanner(file);

			while (in.hasNext()) {
				String str = in.nextLine();
				chrRemove(str);
				System.out.println(out);
				
			}

		} catch (FileNotFoundException e) {

		}
	}

	private static void chrRemove(String str) {
		
		String[] st = str.split(",");// st[0]
		String[] st2 = st[1].split(" ");// st2[1]
		out = st[0];
		
		for (int i = 0; i < st2[1].length();i++ ){
			chrRemove(st2[1].charAt(i));
			
		}
	}

	private static void chrRemove(char c) {
		String r = "";
		
		for (int i = 0; i < out.length(); i ++) {
		      if (out.charAt(i) != c) {
		    	  r += out.charAt(i);
		    	  
		      }
		   }
		
		out = r;
	}
}