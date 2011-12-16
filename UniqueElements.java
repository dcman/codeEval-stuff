/**
*You are given a sorted list of numbers with duplicates. 
*Print out the sorted list with duplicates removed. 
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class dupes {

	public static void main(String[] args) {
		String file = args[0];
		read(file);
		// read("a");
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
		int cur = 0;
		String out = "";
		String[] temp = str.split(",");
		int[] data = new int[temp.length];
		for (int i = 0; i <= temp.length - 1; i++) {
			data[i] = Integer.parseInt(temp[i]);
		}
		cur = data[0];
		out += cur;
		for (int i = 0; i < data.length; i++) {
			if (cur < data[i]) {
				cur = data[i];
				out += "," + cur;
			}
		}

		return out;

	}

}