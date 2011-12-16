/**
*Write a program to determine the Mth to last element of a list.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class m2last {
	public static Stack<Character> seen = new Stack<Character>();

	public static void main(String[] args) {
		
		read(args[0]);
	}

	public static void read(String f) {
		File file = new File(f);

		try {
			Scanner in = new Scanner(file);

			while (in.hasNext()) {
				String str = in.nextLine();
				System.out.println(nChar(str));
				
			}

		} catch (FileNotFoundException e) {

		}
	}

	private static char nChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				seen.push(str.charAt(i));
			}
		}
		int n = Character.getNumericValue(seen.pop());
		
		for(int j = 0; j <  n - 1 ; j++){
			seen.pop();
		}
		return seen.pop();
	}
}
