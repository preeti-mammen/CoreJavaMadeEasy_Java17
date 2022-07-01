package WrapperClassDemo;

public class PrimitiveObjectDemo {
	public static void main(String[] args) {
		int x = 100;
		Integer y = Integer.valueOf(x); //boxing primitive to Object wrapping
		System.out.println(y);
		
		int z = y.intValue(); //unboxing object to primitive
		System.out.println(z);
	}
}
