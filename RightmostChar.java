/**
*You are given a string 'S' and a character 't'. Print out the position of the rightmost occurrence of 
*'t'(case matters) in 'S' or -1 if there is none. The position to be printed out is zero based.
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class rightmost {

	public static int pos = -1;

	public static void main(String[] args) {
		 String file = args[0];
		read(file);

	}

	private static void read(String f) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(f));
			String str;

			while ((str = in.readLine()) != null) {
				pos=-1;
				split(str);
				System.out.println(pos);
			}
			in.close();
		} catch (IOException e) {
		}

	}

	private static void split(String str) {
		String s, r;
		String[] temp = str.split(",");
		s = temp[0];
		r = temp[1];
		process(r.charAt(0), s);

	}

	private static void process(char t, String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == t) {
				pos = i;
			}
		}

	}

}