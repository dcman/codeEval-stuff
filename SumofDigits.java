/**
*Given a positive integer, find the sum of its constituent digits. 
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class sum_digits {

	public static void main(String[] args) {
		 String file = args[0];
		 read(file);
		
	}

	public static void read(String f) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(f));
			String str;

			while ((str = in.readLine()) != null) {

				System.out.println(process(str));
			}
			in.close();
		} catch (IOException e) {
		}
	}

	private static String process(String str) {
		String s = "";
		int a = 0;

		for (int i = 0; i < str.length(); i++) {
			a += Integer.parseInt(Character.toString(str.charAt(i)));
		}
		s += a;
		return s;

	}

}