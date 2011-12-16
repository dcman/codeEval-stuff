/**
*Write a program to read a multiple line text file and write the 'N' 
*longest lines to stdout. Where the file to be read is specified on the command line.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class longestlines {
	public static String[] stuff;
	public static int num;
	public static List<String> list = new LinkedList<String>();

	public static void main(String[] args) {

		read(args[0]);

		inAndOut();

	}

	private static void inAndOut() {
		String[] str = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			str[i] = list.get(i);
		}
		String temp = "";
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].length() > str[j].length()) {
					temp = str[j];
					str[j] = str[i];
					str[i] = temp;
				}
			}
		}
		for (int i = str.length - 1; i > str.length - (num + 1); i--) {
			System.out.print(str[i] + "\n");
		}
	}

	public static void read(String f) {
		File file = new File(f);

		try {
			Scanner in = new Scanner(file);
			num = in.nextInt();
			while (in.hasNextLine()) {
				add(in.nextLine());

			}

		} catch (FileNotFoundException e) {

		}
	}

	private static void add(String n) {
		if (n.length() > 0) {
			list.add(n);
		}

	}

}
