package BankingSystem;

public  abstract class Account {
	private long AccountNumber;
	private  double balance;
	Account(int x,double y){
		this.AccountNumber=x;this.balance=y;
	}
	

	public long getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		AccountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public  abstract void deposite( double amt);
	public  abstract void Withdrawl( double amt);

}
