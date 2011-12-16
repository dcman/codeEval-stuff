/**
*A happy number is defined by the following process. Starting with any positive integer, 
*replace the number by the sum of the squares of its digits, and repeat the process until 
*the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. 
*Those numbers for which this process ends in 1 are happy numbers, while those that do not end 
*in 1 are unhappy numbers. 
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;


public class happy_numbers {
	public static Stack<Integer> seen = new Stack<Integer>();

	public static void main(String[] args) {
		read(args[0]);
		
		
	}

	public static void read(String f) {
		File file = new File(f);

		try {
			Scanner in = new Scanner(file);

			while (in.hasNextInt()) {
				System.out.println(isHappy(in.nextInt()));
				seen.clear();
			}

		} catch (FileNotFoundException e) {

		}
	}

	private static int isHappy(int n) {
		
		int sum = 0;
		if (n == 1) {
			return 1;
		}
		else 
		if (n == 0 || seen(n)){
			return 0;
		}
		seen.push(n);
		String dig ="" + n;
		for(int i = 0; i < dig.length();i++){
			int temp = Character.getNumericValue(dig.charAt(i));
			sum += temp * temp;
		}
		return isHappy(sum);
		
	}

	private static boolean seen(int n) {
		if(seen.search(n) >= 0){
			return true;
		}
		return false;
	}
}