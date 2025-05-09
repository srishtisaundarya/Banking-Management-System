package AbstractionEg;

public  class SavingAccount extends AbstractAccount implements Account {
	SavingAccount(double AccountBalance,String CustomerName){
		super(AccountBalance,CustomerName);
	}
	public void deposit(double amount) {
		System.out.println(amount+" amount deposited");
		this.setAccountBalance(this.getAccountBalance()+amount);
		
	}
	public void withdrawal(double amount) {
		System.out.println("amount withdrawing");
		if(amount<this.getAccountBalance()) {
		this.setAccountBalance(this.getAccountBalance()-amount);
		System.out.println(amount+" amount withdrawn");
		}
		else {
			System.out.println("amount withdrawn failure");
		}
		
	}
	public void viewAccountBalance() {
		System.out.println("account balance is:"+getAccountBalance());
		
	}
	

	
	
	
}
