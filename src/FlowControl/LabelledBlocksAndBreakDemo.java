package FlowControl;

public class LabelledBlocksAndBreakDemo {
	public static void main(String[] args) {
		
		
		l1:
		{
			for (int i = 1; i<=5; i++) {
				System.out.println(i);
				if (i==3) {
					break l1;
				}
			}
			System.out.println("Outside For Loop");
		}
		System.out.println("Outside Labelled Block");
	}

}
