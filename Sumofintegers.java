/**
*Write a program to determine the largest sum of contiguous integers in a list
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class largest_sum {

	static private int seqStart = 0;
	static private int seqEnd = -1;

	public static void main(String[] args) {

		read(args[0]);

	}

	public static void read(String f) {
		File file = new File(f);

		try {
			Scanner in = new Scanner(file);
			while (in.hasNextLine()) {
				sum(in.nextLine());

			}

		} catch (FileNotFoundException e) {

		}
	}

	private static void sum(String s) {
		String[] n = s.split(",");
		int[] num = new int[n.length];
		for (int i = 0; i < n.length; i++) {
			Scanner in = new Scanner(n[i]);
			num[i] = in.nextInt();
		}
		maxSum(num);
	}

	private static void maxSum(int[] a) {
		int maxSum = 0;

		for (int i = 0; i < a.length; i++)
			for (int j = i; j < a.length; j++) {
				int thisSum = 0;

				for (int k = i; k <= j; k++) {
					thisSum += a[k];
				}
				if (thisSum > maxSum) {
					maxSum = thisSum;
					seqStart = i;
					seqEnd = j;
				}
			}
		System.out.println(maxSum);

	}
}
