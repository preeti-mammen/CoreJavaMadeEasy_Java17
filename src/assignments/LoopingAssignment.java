package assignments;

import java.util.Scanner;

public class LoopingAssignment {
	public static void main(String[] args) {

		LoopingAssignment loop = new LoopingAssignment();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");

		int num = sc.nextInt();

		loop.printNosUsingFor(num);
		loop.printNosUsingWhile(num);
		loop.printNosUsingDoWhile(num);
	}

	public void printNosUsingFor(int num) {
		// For Loop
		System.out.println("\n\n INSIDE FOR LOOP");
		for (int i = 1; i <= num; i++) {

			if (i % 10 == 0) {
				continue;
			}

			if (i > 100) {
				break;
			}
			System.out.println(i);
		}

	}

	public void printNosUsingWhile(int num) {
		int i = 1;

		// While Loop
		System.out.println("\n\n INSIDE WHILE LOOP");
		while (i <=num) {
			if (i % 10 == 0) {
				i++;
				continue;
			}

			if (i > 100) {
				break;
			}
			
			System.out.println(i++);
			
		}

	}

	public void printNosUsingDoWhile(int num) {
		int i = 1;

		// While Loop
		System.out.println("\n\n INSIDE DO-WHILE LOOP");
		do {
			if (i % 10 == 0) {
				i++;
				continue;
			}

			if (i > 100) {
				break;
			}
			System.out.println(i++);
		} while (i <= num);
	}

}
