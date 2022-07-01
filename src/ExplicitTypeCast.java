
public class ExplicitTypeCast {
	public static void main(String[] args) {
		
		int a = 100;
		byte b = (byte) a;  //explicit type cast
		System.out.println(b);
		
		int x = 97;
		char c= (char) x;   //explicit type cast
		System.out.println(c);
		
		
		//Explicit cast when pushing the limits beyond the range
		int y = 130;
		byte z = (byte) y;
		System.out.println(z);  //value is -126 as its push beyond byte range -128 to 127
		// after 127 it goes to -128, -127 and then -126 clockwise
		
		
		int m  = 612;
		byte d = (byte) m;
		char h = (char) d;
		System.out.println(h);
		
	}

}
