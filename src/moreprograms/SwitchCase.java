package moreprograms;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {

		String choice = "";
		System.out.println("Enter");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextLine();

		switch (choice) {
		case "Check Balance":
			System.out.println("Check Balance");
			break;
		case "Change Pin":
			System.out.println("Change Pin");
			break;
		case "Withdraw Cash":
			System.out.println("Withdraw Cash");
			break;
		case "Deposit Cheque":
			System.out.println("Deposit Cheque");
			break;
		default:
			System.out.println("Timeout");
		}

	}

}
