package assignments;

public class SwitchProblem {
	/*
	 * Pass the compilation issue
	 * the output should be 123
	 */

	public static void main(String[] args) {
		int input = 1;
		switch (input) {
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");		
		default:
			System.out.println("3");
		}
	}
}
