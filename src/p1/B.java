package p1;

public class B {
	
	public static void main(String[] args) {
		A.a1(); //static members same package from another class
		
		A aObj = new A();
		aObj.a2(); //using obj can call the non static method of the same package class
	}

}
