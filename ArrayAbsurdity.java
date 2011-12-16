/**
*Imagine we have an immutable array of size N which we know to be filled with integers 
*ranging from 0 to N-2, inclusive. Suppose we know that the array contains exactly one 
*duplicated entry and that duplicate appears exactly twice. Find the duplicated entry. 
*(For bonus points, ensure your solution has constant space and time proportional to N) 
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class array_absurdity {
	public static Stack<String> has = new Stack<String>();

	public static void main(String[] args) {

		read(args[0]);

	}

	private static void proc(String s) {
		if (s.length() > 0) {
			String[] first = s.split(";");
			Scanner in = new Scanner(first[1]).useDelimiter(",");
			while (in.hasNext()) {
				String sr = in.next();
				if (has.search(sr) > 0) {
					System.out.println(sr);
				} else
					has.add(sr);
			}
		}
		has.clear();
	}

	public static void read(String f) {
		File file = new File(f);

		try {
			Scanner in = new Scanner(file);
			while (in.hasNextLine()) {
				proc(in.nextLine());

			}

		} catch (FileNotFoundException e) {

		}
	}
}
