/**
*Write a program to find the first non repeated character in a string. 
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class nrc {
	
	public static void main(String[] args) {

		read(args[0]);

	}

	public static void read(String f) {
		File file = new File(f);

		try {
			Scanner in = new Scanner(file);

			while (in.hasNext()) {
				String str = in.nextLine();
				System.out.println(repeat(str));
				

			}

		} catch (FileNotFoundException e) {

		}
	}

	private static String repeat(String str) {
		for(int i = 0; i < str.length(); i++){
			if(find(str.charAt(i), str)){
				return Character.toString(str.charAt(i));
			}
		}
		
		return str;
		
	}

	private static boolean find(char c, String s) {
		int num = 0;
		for(int i = 0; i < s.length();i++){
			if(s.charAt(i) == c){
				num++;
			}
			
		}
		if (num == 1)
			return true;
		else return false;
		
	}

}
