package bonusPrograms;

public class ProductOfNumbers {
	public static void main(String[] args) {
		//Passing from Command Line Arguments from Run Configurations in eclipse
		int num1 = Integer.parseInt(args[0]);
		int num2 =Integer.parseInt(args[1]);
		
		int mul = num1 * num2;
		System.out.println("Product Result = "+mul);
	}

}
