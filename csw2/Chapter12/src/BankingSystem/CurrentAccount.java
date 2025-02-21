package BankingSystem;

public class CurrentAccount extends Account {
   private double overdraftlimit;
         
   CurrentAccount(int x,double y, double z){
	   super(x,y);
	   this.overdraftlimit=z;
	   
	   
   }
   


	@Override
	public void deposite(double amt) {
	
	
		if(amt>=0) {
			super.setBalance(amt+super.getBalance());
			System.out.println("deposite amt is"+amt);
			System.out.println(" Total Balance Available is"+ super.getBalance());
		}
	}


	@Override
	public void Withdrawl(double amt) {
		// TODO Auto-generated method stub
		if((super.getBalance()+this.overdraftlimit)-amt >=0) {
			super.setBalance(super.getBalance()-amt);
			System.out.println("Successfully withdrawn amt is "+ amt+"\n"+" account balance is "+ super.getBalance());
		}
		
		else {
			System.out.println(" your balance is not sufficient to withdraw money");
			 System.out.println(" your balsance is low "+this.getBalance());
		}
		
		
		
		
	}

}
