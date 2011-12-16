/**
 * Write a program to determine the sum of the first 1000 prime numbers.
 */

public class sum_prime {
	public static int count = 0;
	public static int total = 0;

	public static void main(String[] args) {
		for (int i = 2; count < 1000; i++) {
			if (isPrime(i)) {
				count++;
				total = total + i;

			}
		}
		System.out.print(total);
	}

	private static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {

			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

}