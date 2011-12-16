/**
*The Fibonacci series is defined as: F(0) = 0; F(1) = 1; F(n) = F(n-1) + F(n-2) when n>1;. 
*Given a positive integer 'n', print out the F(n). 
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fibonacci {

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
		int f = fib(Integer.parseInt(str));

		s += f;
		return s;
	}

	private static int fib(int f) {
		if (f <= 2) {
			return 1;
		} else
			return fib(f - 1) + fib(f - 2);
	}

}