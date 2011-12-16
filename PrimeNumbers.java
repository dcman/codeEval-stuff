/**
*Print prime numbers less that N
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class prime_less {

	public static void main(String[] args) {
		read(args[0]);

	}

	public static void read(String f) {
		File file = new File(f);

		try {
			Scanner in = new Scanner(file);

			while (in.hasNextInt()) {
				proc(in.nextInt());
			}

		} catch (FileNotFoundException e) {

		}
	}

	private static void proc(int in) {
		String out = "";
		for(long i = 2; i < in; i++){
			if(isPrime(i)){
				out += i + ",";
			}
		}
		System.out.println(out.subSequence(0, out.length() - 1));
	}
	private static boolean isPrime(long N) {
		for (long i = 2; i * i <= N; i++) {

			if (N % i == 0) {
				return false;
			}
		}
		return true;
	}
}