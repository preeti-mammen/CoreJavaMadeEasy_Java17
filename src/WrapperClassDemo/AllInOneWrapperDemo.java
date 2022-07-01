package WrapperClassDemo;

public class AllInOneWrapperDemo {
	public static void main(String[] args) {

		int x = 200;

		String str1 = Integer.toString(x);  //primitive to String via Wrapper
		System.out.println("String = " + str1);

		int y = Integer.parseInt(str1); //String to primitive via Wrapper
		System.out.println("Int back  = " + y);
	}

}
