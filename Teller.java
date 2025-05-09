package AbstractionEg;
//to perform transaction on any account
public class Teller {
	public void viewBalance(Account account) {
		account.viewAccountBalance();
	}
	public void depositTxn(Account account,double amount) {
		account.deposit(amount);
	}
	public void withdraw(Account account,double amount) {
		account.withdrawal(amount);
		
	}
	public void fundTransfer(Account fromAccount,Account toAccount,double amount) {
		if(fromAccount.getAccountBalance()>amount) {
			fromAccount.withdrawal(amount);
			toAccount.deposit(amount);
		}
		else {
			System.out.println("insufficient balance in"+fromAccount.getAccountBalance());
		}
	}

}
