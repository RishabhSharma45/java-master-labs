package prahar.oops.abstraction;

abstract class BankAccount {
	
	private double balance;
	
	
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
	abstract void showBalance();
	
}
class Account extends BankAccount{

	@Override
    void deposit(double amount) {
		
		try {
		if(amount<=0) {
			System.out.println("please enter a valid amount to deposit ");
			return;
		}
		double newBalance = getBalance()+amount;
		setBalance(newBalance);
		System.out.println("successfully deposited");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	@Override
	void withdraw(double amount) {
		
		try {
			if(amount>getBalance()) {
				System.out.println("Insufficient balance");
				return;
			}
			double newBalance = getBalance() - amount;
			setBalance(newBalance);
			System.out.println("withdrwan successfully"+ " available balance " + newBalance );
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	@Override
	void showBalance() {
		double newBalance = getBalance();
		System.out.println("total balance available " + newBalance);
	}
	

	
}
public class SavingAccount{
	public static void main(String[] args) {
		Account a = new Account();
		a.deposit(1000);
		a.showBalance();
		a.deposit(500);
		a.showBalance();
		a.withdraw(2000);
		a.withdraw(1000);
		a.showBalance();
		a.showBalance();
		
	}
}