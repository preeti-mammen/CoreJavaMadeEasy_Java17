
public class StaticMethodsDemo {
	public static void main(String[] args) {
		System.out.println("Static Methods Demo");
		StaticMethodsDemo.method1();
		StaticMethodsDemo.method2();
	}

	static {
		System.out.println("Inside Static Block");
		StaticMethodsDemo.method1();
		StaticMethodsDemo.method2();
	}

	static void method1() {
		System.out.println("Inside Static Method 1");
	}

	static void method2() {
		System.out.println("Inside Static Method 2");
	}
}
