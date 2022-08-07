/*Question:-> 
create the following data members:-
account holder name, type of account(current or savings),account number,balance,overdraft
create the following functions
withdraw(),deposit(),checkBalance()
Some Constraints:-
--Savings account should have minimum 1000 rupees
--Suppose you have 400 rupees in current account and you withdraw 500 there will be an overdraft of 100 and balance will be -100
--one account number will be have unique account holder and either current or savings account
--same account number cannot have both savings and current account
*/
/*Ouput:->
 * C:\Users\tapas\Music\Semester-5\SEM-5\JAVA-programs\Day-02>javac BankAccount.java BankAccountTest.java

C:\Users\tapas\Music\Semester-5\SEM-5\JAVA-programs\Day-02>java BankAccountTest 22413 Prattay S        


 - - - - - WELCOME Prattay TO STCET BANK - - - - -

1. Balance Check
2. Cash Deposit
3. Cash Withdrawal
4. Exit
Enter Your Choice : 1
Account Balance : 1000.0


 - - - - - WELCOME Prattay TO STCET BANK - - - - -

1. Balance Check
2. Cash Deposit
3. Cash Withdrawal
4. Exit
Enter Your Choice : 2
Enter amount to deposit: 100
Updated Account Balance : 1100.0


 - - - - - WELCOME Prattay TO STCET BANK - - - - -

1. Balance Check
2. Cash Deposit
3. Cash Withdrawal
4. Exit
Enter Your Choice : 3
Enter amount to withdraw: 2000
Not Enough Money!
Updated Account Balance : 1100.0


 - - - - - WELCOME Prattay TO STCET BANK - - - - -

1. Balance Check
2. Cash Deposit
3. Cash Withdrawal
4. Exit
Enter Your Choice : 4
 */

import java.util.Scanner;

public class BankAccountTest{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.print("Enter Account No : ");
		// int accNo = in.nextInt();
		
		// System.out.print("Enter Account Holder Name : ");
		// String name = in.nextLine();
		
		// System.out.print("Enter Account Type ( C:current, S:savings) : ");
		// String type = in.next();
		int accNo = Integer.parseInt(args[0]);
		String name = args[1];
		String type = args[2];


		BankAccount acc1 = new BankAccount(name, accNo, type);
		while(true){
			System.out.println("\n\n - - - - - WELCOME "+ name+" TO STCET BANK - - - - -\n");
			System.out.println("1. Balance Check");
			System.out.println("2. Cash Deposit");
			System.out.println("3. Cash Withdrawal");
			System.out.println("4. Exit");
			System.out.print("Enter Your Choice : ");
			int ch = in.nextInt();
			switch(ch){
				case 1: 
						System.out.println("Account Balance : "+acc1.checkBalance());
						break;
				case 2: 
					System.out.print("Enter amount to deposit: ");
					double m = in.nextDouble();
					acc1.deposit(m);
					break;
				case 3:
					System.out.print("Enter amount to withdraw: ");
					m = in.nextDouble();
					acc1.withdraw(m);
					break;
				case 4:
					System.exit(0);
			}	
		}
	}
}