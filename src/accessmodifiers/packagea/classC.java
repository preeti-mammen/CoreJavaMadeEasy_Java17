package accessmodifiers.packagea;

public class classC {
	
	public static void main(String[] args) {
		/*
		 *  a is not visible as its marked private in class A
		 *  b is default package and hence available within classes of same package
		 *  c is protected but has same package access too
		 *  d is public hence available across packages and within same package
		 */
		classA aObj = new classA();
		//System.out.println(aObj.a);  
		System.out.println(aObj.b);
		System.out.println(aObj.c);
		System.out.println(aObj.d);
	}

}
