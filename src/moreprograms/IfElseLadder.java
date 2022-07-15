package moreprograms;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {

		String choice = "";
		System.out.println("Enter");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextLine();

		if (choice.equals("Check Balance")) {
			System.out.println("Check Balance");
		} else if (choice.equals("Change Pin")) {
			System.out.println("Change Pin");
		} else if (choice.equals("Withdraw Cash")) {
			System.out.println("Withdraw Cash");
		} else if (choice.equals("Deposit Cheque")) {
			System.out.println("Deposit Cheque");
		} else {
			System.out.println("Timeout");
		}
	}

}
