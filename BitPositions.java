/**
*Given a number n and two integers p1,p2 determine if the bits in position p1 and p2 
*are the same or not. Positions p1,p2 and 1 based. 
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class position {

	public static void main(String[] args) {
		read(args[0]);

	}

	public static void read(String f) {
		File file = new File(f);

		try { 
			Scanner in = new Scanner(file);

			while (in.hasNextLine()) {
				dec(in.nextLine());
			}

		} catch (FileNotFoundException e) {

		}
	}

	private static void dec(String s) {
		Scanner sc = new Scanner(s);
		sc.useDelimiter(",");
		long a = sc.nextLong();
		int b = sc.nextInt();
		int c = sc.nextInt();
		dec(a, b, c, s);
	}

	private static void dec(long a2, int b2, int c2, String s) {
		String test = Long.toBinaryString(a2);

		if (test.charAt(test.length() - b2) == test.charAt(test.length() - c2)) {
			System.out.println(true);
		}
		else
			System.out.println(false);
	}
}import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class position {

	public static void main(String[] args) {
		read(args[0]);

	}

	public static void read(String f) {
		File file = new File(f);

		try {
			Scanner in = new Scanner(file);

			while (in.hasNextLine()) {
				dec(in.nextLine());
			}

		} catch (FileNotFoundException e) {

		}
	}

	private static void dec(String s) {
		Scanner sc = new Scanner(s);
		sc.useDelimiter(",");
		long a = sc.nextLong();
		int b = sc.nextInt();
		int c = sc.nextInt();
		dec(a, b, c, s);
	}

	private static void dec(long a2, int b2, int c2, String s) {
		String test = Long.toBinaryString(a2);

		if (test.charAt(test.length() - b2) == test.charAt(test.length() - c2)) {
			System.out.println(true);
		}
		else
			System.out.println(false);
	}
}