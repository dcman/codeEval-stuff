/**
*A sequence of n > 0 integers is called a jolly jumper if the absolute values of the 
*differences between successive elements take on all possible values 1 through n - 1. eg. 
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class jolly_jumpers {

	public static void main(String[] args) {
		read(args[0]);

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

	private static void proc(String in) {
		int i = 0;
		int[] num = new int[in.length() - (in.length() / 2)];
		Scanner sc = new Scanner(in);
		while (sc.hasNextInt()) {
			num[i] = sc.nextInt();
			i++;
		}
		System.out.println(isJolly(num));
	}

	private static String isJolly(int[] input) {
		Stack<Integer> seen = new Stack<Integer>();
		for (int i = 0; i < input.length - 1; i++) {
			int r = Math.abs(input[i] - input[i + 1]);
			//System.out.println(input[i] + " " + input[i+1] + " " + r + " " + seen);
			if (r == 0 || r > input.length || seen.search(r) > -1) {
				return "Not jolly";
			}
			seen.add(r);
		}

		return "Jolly";
	}

}