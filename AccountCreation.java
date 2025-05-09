package AbstractionEg;

public class AccountCreation {
	public Account createAccount(String customername,double initialname,int accountType) {
		Account account=null;
		if(accountType==1) {
			System.out.println("creating savings account");
			account=new SavingAccount(initialname, customername);
		}else if(accountType==2) {
			System.out.println("creating loan account");
			account=new SavingAccount(initialname,customername);
		}
		return account;
	}
}
