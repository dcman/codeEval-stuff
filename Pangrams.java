/**
*The sentence 'A quick brown fox jumps over the lazy dog' contains every single letter in the 
*alphabet. Such sentences are called pangrams. You are to write a program, which takes a 
*sentence, and returns all the letters it is missing (which prevent it from being a pangram). 
*You should ignore the case of the letters in sentence, and your return should be all lower case 
*letters, in alphabetical order. You should also ignore all non US-ASCII characters.In case 
*the input sentence is already a pangram, print out the string NULL 
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pangrams {
	public static final String abc = "abcdefghijklmnopqrstuvwxyz";

	public static void main(String[] args) {

		read(args[0]);

	}

	public static void read(String f) {
		File file = new File(f);

		try {
			Scanner in = new Scanner(file);

			while (in.hasNextLine()) {
				proc(in.nextLine().toLowerCase());
			}
		} catch (FileNotFoundException e) {

		}

	}

	private static void proc(String pan) {

		String str = "";
		for (int i = 0; i < abc.length(); i++) {
			String ch = "" + abc.charAt(i);
			if (!pan.contains(ch)) {
				str += ch;
			}
		}

		if (str.length() == 0) {
			System.out.println("NULL");
		} else
			System.out.println(str);
	}

}
