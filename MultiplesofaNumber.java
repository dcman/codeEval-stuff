/**
*Given numbers x and n, where n is a power of 2,
*print out the smallest multiple of n which is greater than or equal to x. 
Do not use division or modulo operator. 
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class multiples {

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

	private static String process(String str) {
		String s = "";
		String[] st = str.split(",");
		int a = Integer.parseInt(st[0]);
		int b = Integer.parseInt(st[1]);
		doWork(a,b);
		
		return s;
	}

	private static void doWork(int a, int b) {
		if (b < a){
			
			doWork(a,b*2);
		}
		else System.out.print(b);
	}

}