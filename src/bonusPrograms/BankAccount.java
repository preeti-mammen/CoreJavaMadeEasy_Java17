package bonusPrograms;

public class BankAccount {

	/*
	 * static variables stored in method area. Lifetime is Class Level. These are
	 * common for the all objects of that class. Can use access modifiers like
	 * private, public or protected. Need not be initialized as JVM assigns them a
	 * default value
	 */
	static String bankName = "Bank of America";

	/*
	 * Non- Static variables are stored in Heap. Need not be initialised as JVM
	 * assigns default value. Can use access modifiers like private, public or
	 * protected
	 */

	String accountHoldersName;
	String accountNumber;
	float balance;

	public static void main(String[] args) {
		/*
		 * local variables stored in stack area. These have to be initialised before
		 * they can be used. As soon as block or method finish, these variables are
		 * gone. Access modifiers like private, public etc cannot be used here.
		 */
		double loanInterestRate = 7.5;

		System.out.println(BankAccount.bankName);
		BankAccount bankAccount = new BankAccount();
		bankAccount.accountHoldersName = "John";
		bankAccount.accountNumber = "123456778";
		bankAccount.balance = 20000f;

		System.out.println(bankAccount.balance);
	}
}
