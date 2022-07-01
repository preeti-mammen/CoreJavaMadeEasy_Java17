package WrapperClassDemo;

public class ObjectStringDemo {
	public static void main(String[] args) {

		long x = 1000;

		Long l = Long.valueOf(x);  //primitive to Object

		String str = l.toString();  //Object to String
		System.out.println(str);
		
		Long y = Long.valueOf(str); //String to Object
		System.out.println(y);
		
		long a = y.longValue(); 
		System.out.println(a);
	}

}
