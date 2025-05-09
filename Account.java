package AbstractionEg;

public interface Account {
	int getAccountNumber();
	double getAccountBalance();
	String getCustomerName();
	void setAccountBalance(double amount);
	void setCustomerName(String name);
	boolean isActive();
	void setActive(boolean status);
	
	//business operation methods
	void deposit(double amount);
	void withdrawal(double amount);
	void viewAccountBalance();
	
}
