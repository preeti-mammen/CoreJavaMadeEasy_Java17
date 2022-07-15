package accessmodifiers.packagea;

public class classA {
	private int a = 30;
	int b = 40;
	protected int c = 60;
	public int d = 70;

	public static void main(String[] args) {
		classA aObj = new classA();
		System.out.println(aObj.a);
		System.out.println(aObj.b);
		System.out.println(aObj.c);
		System.out.println(aObj.d);
	}

}
