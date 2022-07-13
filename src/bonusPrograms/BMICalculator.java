package bonusPrograms;

public class BMICalculator {
	public static void main(String[] args) {

		/*
		 * BMI = Weight in kg/ (Height * height) where height is in meters
		 */

		double weightInKg = 54;
		double heightInMeters = 1.59;

		double bmi = weightInKg / (heightInMeters * heightInMeters);
		System.out.println("BMI Result: " + bmi);

		if (bmi <= 18.5) {
			System.out.println("You are underweight");
		} else if (bmi > 18.5 && bmi <= 24.9) {
			System.out.println("Your weight is Normal");
		} else if (bmi >= 25 && bmi <= 29.9) {
			System.out.println("You are Overweight");
		} else if (bmi > 30) {
			System.out.println("You are Obese");
		}
	}

}
