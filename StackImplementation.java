/**
*Write a program implementing a stack inteface for integers.The interface should have 'push' and 
*'pop' functions. You will be asked to 'push' a series of integers and then 'pop' and print out 
*every alternate integer.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class stack {
	static Stack<Integer> s = new Stack<Integer>();
	static int size;

	public static void main(String[] args) {
		String ar = args[0];
		read(ar);

	}

	public static void read(String f) {
		File file = new File(f);

		try {
			Scanner in = new Scanner(file);

			while (in.hasNextLine()) {
				String s = in.nextLine();
				pop(s);
			}

		} catch (FileNotFoundException e) {

		}

	}

	private static void pop(String r) {
		Scanner sc = new Scanner(r);
		while (sc.hasNext()) {
			s.push(sc.nextInt());
		}
		size = s.size();
		push();

	}

	private static void push() {
		String st = "";
		for (int i = 0; i < size; i++) {
			if (i % 2 == 0) {
				st += s.pop() + " ";
			} else {
				s.pop();
			}
		}
		System.out.println(st);

	}

}
