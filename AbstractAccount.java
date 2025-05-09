package AbstractionEg;

abstract class AbstractAccount {
	private final int AccountNumber;
	private double AccountBalance;
	private String CustomerName;
	private boolean active;
	AbstractAccount(double AccountBalance,String CustomerName){
		 this.AccountNumber=(int)(Math.random()*10000000);
		 this.AccountBalance=AccountBalance;
		 this.CustomerName=CustomerName;
		 this.active=true;
		
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean status) {
		this.active=status;
	}
	public double getAccountBalance() {
		return AccountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		AccountBalance = accountBalance;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public int getAccountNumber() {
		return AccountNumber;
	}
	
	

}
