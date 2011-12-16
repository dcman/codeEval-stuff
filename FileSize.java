/**
*Print the size of a file in bytes. 
*/
import java.io.*;
public class filesize {

	public static void main(String[] args) {
		File file = new File(args[0]);
		long info =  file.length();
		System.out.println(info);
	}
}