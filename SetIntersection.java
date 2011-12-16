/**
*You are given two sorted list of numbers(ascending order). The lists themselves are comma delimited 
*and the two lists are semicolon delimited. Print out the intersection of these two sets. 
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class intersection {

	public static void main(String[] args) {
		 String file = args[0];
		 read(file);
		
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

	private static String process(String s) {

		String[] stuff = s.split(";");
		String[] firstSet = stuff[0].split(",");
		String[] secondSet = stuff[1].split(",");

		return compair(firstSet, secondSet);
	}

	private static String compair(String[] first, String[] second) {
		int i, j, k = 0;
		String s = "";
		for (i = 0; i < first.length; i++) {
			for (j = 0; j < second.length; j++) {
				if (first[i].equalsIgnoreCase(second[j])) {
					k++;

					if (k >= 2) {
						s += ",";
					}
					s += first[i];
				}

			}
		}
		return s;
	}
}
