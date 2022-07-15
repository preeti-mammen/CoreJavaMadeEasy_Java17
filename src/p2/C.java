package p2;

import p1.A;

public class C {
	public static void main(String[] args) {
		/*
		 * we need to import the class of another package or explicitly use the entire package name. 
		 * Import is better than fully qualified name of class like p1.A
		 */
		
		A.a1();  
		
		A aObj = new A();
		aObj.a2();
		
	}

}
