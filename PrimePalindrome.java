/**
 Write a program to determine the biggest prime palindrome under 1000. 
 */

public class prime_palindrome {

	private static boolean isPal(int i) {
		String s = Integer.toString(i);
		if (s.length() == 1) {
			return true;
		}
		if (s.length() == 2) {
			if (s.charAt(0) == s.charAt(s.length() - 1)) {
				return true;
			}
			return false;
		}
		if (s.charAt(0) == s.charAt(s.length() - 1)) {
			return isPal(s.substring(1, s.length() - 1));
		}
		return false;
	}

	private static boolean isPal(String s) {
		if (s.length() == 1) {
			return true;
		}

		if (s.charAt(0) == s.charAt(s.length() - 1)) {
			return isPal(s.substring(1, s.length() - 1));
		}
		return false;
	}

	private static boolean isPrime(long N) {
		if (N < 2 || N % 2 == 0) {
			return false;
		}
		for (long i = 2; i * i <= N; i++) {

			if (N % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int out = 0;
		for (int i = 0; i < 1000; i++) {
			if (isPrime(i) && isPal(i)) {
				out = i;

			}
		}
		System.out.print(out);
	}
}