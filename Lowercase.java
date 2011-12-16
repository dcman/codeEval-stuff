/**
*Given a string write a program to convert it into lowercase. 
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class lowercase {

	public static void main(String[] args) {

		String file = args[0];

		read(file);

	}

	public static void read(String f) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(f));
			String str;

			while ((str = in.readLine()) != null) {

				System.out.println(str.toLowerCase());
			}
			in.close();
		} catch (IOException e) {
		}
	}

}