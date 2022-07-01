
public class NonStaticMembersDemo {

	// Non static variable
	int num;

	// There is a Default Constructor Here

	// Non Static Block - Every time an object is created it is run
	{
		System.out.println("Inside the Non-Static Block");
	}

	static {
		System.out.println("Inside Static Block");
	}

	public static void main(String[] args) {
		System.out.println("Inside the main method");
		NonStaticMembersDemo obj =  new NonStaticMembersDemo();
		obj.doSomething();
	}

	void doSomething() {
		System.out.println("Inside doSomething");
	}
}
