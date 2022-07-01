package UnaryOperation;

public class UnaryOperationDemo {
	public static void main(String[] args) {

		int x = 10;

		int y = ++x;

		System.out.println("\nValue of x = " + x);
		System.out.println("Value of y = " + y);

		int z = --x;
		
		System.out.println("\nValue of x = " + x);
		System.out.println("Value of z = " + z);

		int a = x++;
		
		System.out.println("\nValue of x = " + x);
		System.out.println("Value of a = " + a);

		int b = x--;
		
		System.out.println("\nValue of x = " + x);
		System.out.println("Value of b = " + b);

	}

}
