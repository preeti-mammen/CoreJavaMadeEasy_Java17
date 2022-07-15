package moreprograms;

public class WhileLoops {
	public static void main(String[] args) {
		/*
		 * Infinite Loop - Memory Issues will result
		 */
		while(true) {  //Either condition should be false
			System.out.println("Hello");
			break; //or need to put break
		}
	}

}
