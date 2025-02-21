package BankingSystem;

public class BankApp {

	 public static void main(String[] args) { 
	        Account savingAccount = new SavingAccount(123456789, 5.0,5); 
	        Account currentAccount = new CurrentAccount(987654321, 200.0,100); 
	        savingAccount.deposite(1000); 
	        savingAccount.Withdrawl(200); 
	        savingAccount.Withdrawl(900); 
	        System.out.println(); 
	        currentAccount.deposite(500); 
	        currentAccount.Withdrawl(800); 
	        currentAccount.Withdrawl(200); 
	    } 

}
