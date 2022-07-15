package moreprograms;

public class SwitchCase2 {
	public static void main(String[] args) {
		
		/*
		 * final variables can be used as Case labels since they are constants
		 * Duplicate case labels are not allowed
		 * The case labels should be within the range else only default condition will run
		 */

		int a = 20;
		final int b = 20; 
		switch (a) {
		case 10:
			System.out.println("Case 10");
			break;
		case b:
			System.out.println("Case 20");
			break;
		case 30:
			System.out.println("Case 30");
			break;
		default:
			System.out.println("No matches");
		}
	}

}
