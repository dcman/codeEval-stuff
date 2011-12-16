/**
*Print out the grade school multiplication table upto 12*12. 
*/

public class tables {

	public static void main(String[] args) {
		table(1,12);

	}

	private static void table(int i, int j) {
		
		if(i > j ){
			return;
		}
		else {
			for(int k = 1; k <= j; k++){
				System.out.printf("%4d",k*i);
			}
			System.out.println();
			table(i + 1, j);
		}
	}
}