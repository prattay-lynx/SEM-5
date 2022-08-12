/*Question:->
 * To Create a class Account with data member account_no and account_balance and methods to deposit and 
 * withdraw money and display balance. Derive 2 subclass savingaccount and current account 
 * Savings account should have minimum account balance of 1000 and 
 * current account should have overdraft facility.In Addition 
 * to this savings account should have a datamember interest and method to calculate interest and 
 * data to the account balance for current account there should be an overdraft limit. 
 * Use pertinent methods to display all this information.
*/

/*Output:->
 * Enter Account Number : 5500


----- Welcome to STCET BANK -----


1. Savings Account
2. Current Account
3. Exit
Enter Your Choice :
1


1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Enter Your Choice :
2
Enter amount to deposit: 300
Updated Account Balance : 1300.0


1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Enter Your Choice : 
3
Enter amount to withdraw: 200
Updated Account Balance : 1100.0


1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Enter Your Choice :
4
 */

import java.util.Scanner;

public class BankAccount0508Demo{
	public static void displayMenu(){
		System.out.println("\n\n1. Check Balance");
		System.out.println("2. Deposit Money");
		System.out.println("3. Withdraw Money");
		System.out.println("4. Exit");
	}
	public static void displayAccType(){
		System.out.println("\n1. Savings Account");
		System.out.println("2. Current Account");
		System.out.println("3. Exit");
	}

	public static void logic(BankAccount0508 sacc, Scanner in){
		while(true){
			displayMenu();
			System.out.println("Enter Your Choice : ");
			int chh = in.nextInt();
			switch(chh){
				case 1:
					System.out.println("Your Account Balance is : "+sacc.checkBalance());
					break;
				case 2: 
					System.out.print("Enter amount to deposit: ");
					double m = in.nextDouble();
					sacc.depositMoney(m);
					break;
				case 3:
					System.out.print("Enter amount to withdraw: ");
					m = in.nextDouble();
					sacc.withdrawMoney(m);
					break;
				case 4:
					System.exit(0);
					break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Account Number : ");
		int accNo = in.nextInt();
		
		System.out.println("\n\n----- Welcome to STCET BANK -----\n");
		displayAccType();
		System.out.println("Enter Your Choice : ");
		int ch = in.nextInt();
		switch(ch){
			case 1: 
				SavingAccount sacc = new SavingAccount(accNo);
				logic(sacc, in);
				break;
			case 2:
				CurrentAccount obj = new CurrentAccount(accNo);
				logic(obj, in);
				break;
			case 3: 
				System.exit(0);
				break;
		}
		

	}
}