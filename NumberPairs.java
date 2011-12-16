/**
*You are given a sorted array of positive integers and a number 'X'. Print out all 
*pairs of numbers whose sum is equal to X. Print out only unique pairs and the 
*pairs should be in ascending order 
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
