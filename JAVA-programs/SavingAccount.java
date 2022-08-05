public class SavingAccount extends BankAccount0508{
	private double interest;
	// private double interest
	SavingAccount(int accNo){
		super(accNo);
		interest=4.00;
	}

	public double calculateInterest(int time){
		double currBal = checkBalance();
		return ((currBal*time*interest)/100) ;
	}

	public void getBalanceWithInterest(int time){
		depositMoney(calculateInterest(time));
	}
	
}