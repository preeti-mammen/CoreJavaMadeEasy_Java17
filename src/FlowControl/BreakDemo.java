package FlowControl;

public class BreakDemo {
	public static void main(String[] args) {

		for (int i = 1; i <= 20; i++) {
			System.out.println(i);
			if (i == 10) {
				break;
			}
		}
		System.out.println("Outside For Loop");
	}

}
