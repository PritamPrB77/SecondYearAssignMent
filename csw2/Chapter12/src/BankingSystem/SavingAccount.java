package BankingSystem;

public class SavingAccount extends Account{

private double intrestrate ;
SavingAccount(int x, double y,double z) {
	super(x, y);
	this.intrestrate=z;
	
}

public double getIntrestrate() {
	return intrestrate;
}

public void setIntrestrate(Double intrestrate) {
	this.intrestrate = intrestrate;
}

public void deposite(double amt) {
	// TODO Auto-generated method stub
	
if(amt>=0) {
	double intrest= ((amt+super.getBalance())*(this.intrestrate/100));
	System.out.println("Intrest is "+intrest);
	super.setBalance(amt+super.getBalance()+intrest);

	System.out.println("deposite amt is"+amt);
	System.out.println("intrest amt is"+intrest);
	System.out.println(" Total Balance Available is"+ super.getBalance());
}
	
}

@Override
public void Withdrawl(double amt) {
	// TODO Auto-generated method stub
	
	if(super.getBalance()-amt >=0) {
		super.setBalance(super.getBalance()-amt);
		System.out.println("Successfully withdrawn amt is "+ amt+"\n"+" account balance is "+ super.getBalance());
	}
	
	else {
		System.out.println(" your balance is not sufficient to withdraw money");
		 System.out.println(" your balsance is low "+this.getBalance());
	}
	
}


}
