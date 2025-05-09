package AbstractionEg;

public class AccountClosure {
	public void closeAccount(Account account) {
		System.out.println("closing account with account number"+account.getAccountNumber());
		if(account.getAccountBalance()!=0) {
			account.withdrawal(account.getAccountBalance());
		}
		account.setActive(false);
	}

}
