package moreprograms;

public class DoWhileLoop {
	public static void main(String[] args) {
		/*
		 * Concept of unreachable class - Errors in this code
		 */
		do {
			System.out.println("hello");
		} while (true); // Since always condition is true

		System.out.println("after do while"); // unreachable code
	}

}
