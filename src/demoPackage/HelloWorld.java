package demoPackage;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
	
	//Static Block - Will Execute before main()
	static {
		System.out.println("Test Static Block 1");
	}
	
	static {
		System.out.println("Test Static Block 2");
	}
}
