public class BankAccount0508{
	private int accNo;
	private double accBal;

	BankAccount0508(int accNo){
		this.accNo = accNo;
		this.accBal=1000;
	}

	public void setBalance(double money){
		this.accBal = money;
	}

	public void printBalance(){
		System.out.println("Updated Account Balance : "+checkBalance());
	}
	public double checkBalance(){
		return this.accBal;
	}
	
	public void withdrawMoney(double money){
		if(money>this.accBal){
			System.out.println("Not enough Money !");
			return;
		}
		this.accBal -= money;
		printBalance();
	}

	public void depositMoney(double money){
		this.accBal += money;
		printBalance();
	}

}