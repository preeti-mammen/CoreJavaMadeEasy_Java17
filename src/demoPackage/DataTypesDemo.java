package demoPackage;

public class DataTypesDemo {
	public static void main(String[] args) {
		
		byte a = -50;
		short b = 150;
		int c = 10000;
		long d = 1000000;
		char m = 'A';   //character sets are internally integer value
		
		float f = 1.234f;
		
		double g = 13456.778;
		
		byte h = 20;
		
		byte res = (byte) (a+h); //assign always in int value
		
		System.out.println(res);
		
	}
}
