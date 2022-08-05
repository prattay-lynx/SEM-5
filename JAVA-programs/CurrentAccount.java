public class CurrentAccount extends BankAccount0508{
	private double overdraftLimit;
	private double totalBal;
	CurrentAccount(int accNo){
		super(accNo);
		overdraftLimit = 1000;
		updateTotalBal();
	}
	private void updateTotalBal(){
		totalBal = checkBalance()+overdraftLimit;
	}

	public void setOverdraftLimit(double limit){
		overdraftLimit = limit;
		updateTotalBal();
	}

	public double getOverdraftLimit(){
		return this.overdraftLimit;
	}

	@Override
	public void printBalance(){
		System.out.println("Updated Account Balance : "+checkBalance()+
			", Overdraft Balance : "+overdraftLimit);
	}

	@Override
	public void withdrawMoney(double money){
		if(money> totalBal){
			System.out.println("Not enough Money !");
			return;
		}
		if(money > checkBalance()){
			double tmp = money - checkBalance();
			this.overdraftLimit-=tmp;
			setBalance(0.00);
		}
		else{
			setBalance(checkBalance()-money);
		}
		printBalance();
		updateTotalBal();
	}

	@Override
	public void depositMoney(double money){
		setBalance(checkBalance()+money);
		printBalance();
		updateTotalBal();
	}
}