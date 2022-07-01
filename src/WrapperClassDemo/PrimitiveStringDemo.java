package WrapperClassDemo;

public class PrimitiveStringDemo {
	public static void main(String[] args) {

		byte x = 100;
		
		String str1 = Byte.toString(x); //primitive to String
		System.out.println(str1);
		
		byte z = Byte.parseByte(str1); //String to primitive
		System.out.println(z);
		
	}
}
