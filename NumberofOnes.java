/**
*Write a program to determine the number of 1 bits in the internal representation of a given integer. 
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class num_of_ones {

	public static void main(String[] args) {

		read(args[0]);

	}

	public static void read(String f) {
		File file = new File(f);

		try {
			Scanner in = new Scanner(file);

			while (in.hasNext()) {
				
				bits(in.nextInt());

			}

		} catch (FileNotFoundException e) {

		}
	}

	private static void bits(int a) {
		int i = 0;
		String b = Integer.toBinaryString(a);
		for(int j = 0; j < b.length(); j++){
			if(b.charAt(j) == '1') i++;
		}
		System.out.println(i);
	}

}
