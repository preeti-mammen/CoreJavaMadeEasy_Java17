package FlowControl;

public class ForDemo {
	public static void main(String[] args) {

		ForDemo demo = new ForDemo();
		demo.ForIncrement();
		System.out.println("############");
		demo.ForDecrement();

	}

	public void ForIncrement() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(i);
		}

	}

	public void ForDecrement() {
		for (int i = 20; i >= 1; i--) {
			System.out.println(i);
		}

	}

}
