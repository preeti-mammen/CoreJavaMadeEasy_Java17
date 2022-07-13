package FlowControl;

public class SwitchDemo {
	public static void main(String[] args) {
		SwitchDemo switchDemo = new SwitchDemo();
		switchDemo.switchcase();
		switchDemo.switchcasenobreak();
		switchDemo.switchcasechains();
		switchDemo.switchcasedefault();
	}
	
	public void switchcase() {
		int x = 1;

		switch (x) {
		case 1:
			System.out.println("Case 1");
			break;
		case 2:
			System.out.println("Case 2");
			break;
		default:
			System.out.println("Default");

		}
	}
	
	public void switchcasenobreak() {
		int x = 1;

		switch (x) {
		case 1:
			System.out.println("Case 1");
		case 2:
			System.out.println("Case 2");
			break;
		default:
			System.out.println("Default");

		}
	}
	
	public void switchcasechains() {
		int x = 1;

		switch (x) {
		case 1:
		case 2:
			System.out.println("Common Case");
			break;
		default:
			System.out.println("Default");

		}
	}
	
	public void switchcasedefault() {
		int x = 5;

		switch (x) {
		case 1:
			System.out.println("Case 1");
			break;
		case 2:
			System.out.println("Case 2");
			break;
		default:
			System.out.println("Default");

		}
	}

}
