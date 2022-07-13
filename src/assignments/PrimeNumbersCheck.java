package assignments;

import java.util.Scanner;

public class PrimeNumbersCheck {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number");
		
		int num = sc.nextInt();
		
		boolean primeFlag = true;
		
		for (int i = 2; i <= num-1; i++) {
			if(num % i == 0) {
				primeFlag = false;
			}
		}
		
		if(primeFlag) {
			System.out.println(num + " is Prime Number");
		}else {
			System.out.println(num + " is not a Prime Number");
		}
		
	}
}
