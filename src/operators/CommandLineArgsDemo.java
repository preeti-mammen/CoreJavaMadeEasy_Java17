package operators;

public class CommandLineArgsDemo {
	public static void main(String[] args) {
		int len = args.length;
		if (len == 0) {
			System.out.println("No inputs provided");
		} else {
			System.out.println("List of arguments");
			for (int i = 0; i < len; i++) {
				System.out.println(args[i]);
			}
		}
	}

}
