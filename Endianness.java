/**
*Write a program to print out the endianness of the system. 
*/
public class endian {

	public static void main(String[] args) {
		if(System.getProperty("sun.cpu.endian").equals("little")) {
			System.out.println("LittleEndian");
		}
		else 
			System.out.println("BigEndian");
	}

}