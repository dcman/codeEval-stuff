/**
*Write a program to reverse the words of an input sentence.
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class reverse_words {

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
		String out = "";
		String[] words = str.split(" ");
		for (int i = words.length - 1; i >= 0; i--) {
			out += words[i] + " ";
		}
		return out;

	}

}