/**
*A double-square number is an integer X which can be expressed as the sum of two perfect squares. 
*For example, 10 is a double-square because 10 = 3^2 + 1^2. Your task in this problem is, given X, 
*determine the number of ways in which it can be written as the sum of two squares. For example, 
*10 can only be written as 3^2 + 1^2 (we don't count 1^2 + 3^2 as being different). On the other 
*hand, 25 can be written as 5^2 + 0^2 or as 4^2 + 3^2.
*NOTE: Do NOT attempt a brute force approach. It will not work. The following constraints hold:
*0 <= X <= 2147483647
*1 <= N <= 100 
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class double_squares {

	public static void main(String[] args) {
		String f = args[0];
		read(f);
		
   }
	public static void read(String f) {
		File file = new File(f);
		
			try {
				Scanner in = new Scanner(file);
				int size = in.nextInt();
				while(in.hasNextInt()){
					int a = in.nextInt();
					dothings(a);
				}
		
			} catch (FileNotFoundException e) {
				
			}
			
	}
	private static void dothings(int a) {
		int x = a;
		int n = 0;
		for (int i = 0; i <= Math.sqrt(x/2); i++) {
		  double j = Math.sqrt(x - i*i);
		  if (Math.floor(j) == j) n++;
		}
		System.out.println(n);
		
	}
}
