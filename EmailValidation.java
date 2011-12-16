/**
*You are given several strings that may/may not be valid emails. You should write a 
*regular expression that determines if the email id is a valid email id or not. 
*You may assume all characters are from the english language. 
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class email_regex {

	public static void main(String[] args) {

		read(args[0]);

	}

	public static void read(String f) {
		File file = new File(f);

		try {
			Scanner in = new Scanner(file);

			while (in.hasNextLine()) {
				System.out.println(proc(in.nextLine()));
			}
		} catch (FileNotFoundException e) {

		}

	}

	private static Boolean proc(String email) {
		String expression = "^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
		CharSequence inputStr = email;
		Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(inputStr);
		return matcher.matches();
	}

}
