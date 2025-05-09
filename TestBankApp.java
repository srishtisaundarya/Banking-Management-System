package AbstractionEg;

public class TestBankApp {
	public static void main(String[]args) {
		SavingAccount sa=new SavingAccount(100000,"sri");
		LoanAccount la=new LoanAccount(200000,"abc");
		Teller t1=new Teller();
		System.out.println("for savings account");
		t1.viewBalance(sa);	
		t1.depositTxn(sa,2000);
		t1.withdraw(sa,1000);
		t1.viewBalance(sa);
		System.out.println("-------------------------------------");
		System.out.println("for loan account");	
		t1.viewBalance(la);
		t1.depositTxn(la, 2000);
		t1.withdraw(la, 1000);
		t1.viewBalance(la);
		System.out.println("-------------------------------------");
		System.out.println("after transfering fund");
		t1.fundTransfer(sa, la, 10000);
		t1.viewBalance(la);
		t1.viewBalance(sa);
		AccountCreation ac=new AccountCreation();
		AccountClosure acl=new AccountClosure();
		Account a1=ac.createAccount("sri",25000,1);
		System.out.println("account is active?"+a1.isActive());
		acl.closeAccount(a1);
		System.out.println("account is active?"+a1.isActive());
	}

}
 