package AbstractionEg;

public class LoanAccount extends AbstractAccount implements Account {
	LoanAccount(double AccountBalance,String CustomerName){
		super(AccountBalance, CustomerName);
	}
	public void deposit(double amount) {
		System.out.println("amount depositing "+amount);
		if(amount<this.getAccountBalance()) {
			this.setAccountBalance(getAccountBalance()-amount);
			System.out.println("amount deposited");
		}else {
			System.out.println("not acceptable");
		}
	}
	public void withdrawal(double amount) {
		System.out.println("amount withdrawn");
		this.setAccountBalance(getAccountBalance()+amount);
		
	}
	public void viewAccountBalance() {
		System.out.println("account balance is:"+getAccountBalance());
		
	}
	
	

}
