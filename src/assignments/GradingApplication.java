package assignments;

public class GradingApplication {
	
	
	public static void main(String[] args) {
		int mathsMarks = 80;
		int physicsMarks = 78;
		int chemistryMarks = 8;
		
		double averageMarks = 0.0;
		
		if(mathsMarks < 35 || physicsMarks < 35 || chemistryMarks < 35) {
			System.out.println("Student has Failed !!");
		} else {
			averageMarks = (mathsMarks + physicsMarks + chemistryMarks)/3;
			if(averageMarks <= 59) {
				System.out.println("Student's Grade is C");
			} else if (averageMarks > 59 && averageMarks <= 69) {
				System.out.println("Student's Grade is B");
			} else {
				System.out.println("Student's Grade is A");
			}
		}
	}
}
