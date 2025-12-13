package prahar.oops.practice;

import java.util.Random;

interface IPayment{
	boolean pay(double amount);

	boolean refund(double amount);
}
abstract class PaymentGateway implements IPayment {
	int transactionId;
	double amount;
	 
	PaymentGateway(double amount){
		this.amount=amount;
	}
	
	
	int generateTxnId(){
		Random rand = new Random();
		return rand.nextInt();
	}
	
	void process(double amount) {
		if(pay(amount)) {
			System.out.println("Payment Successful for" + amount);
		}
		else {
			System.out.println("payment cancelled");
		}
	}
	
}
class UPIPayment extends PaymentGateway{
	
	UPIPayment(double amount){
		super(amount);
		System.out.println("Payment method : UPI");
		System.out.println(generateTxnId());
		process(amount);
	}

	@Override
	public boolean pay(double amount) {
		return true;
	}

	@Override
	public boolean refund(double amount) {
		return true;
	}
	
}
class CardPayment extends PaymentGateway{
	
	CardPayment(double amount){
		super(amount);
		System.out.println("Payment method : Card");
		System.out.println(generateTxnId());
		process(amount);
	}

	@Override
	public boolean pay(double amount) {
		return true;
	}

	@Override
	public boolean refund(double amount) {
		return true;
	}
	
}
class NetBankingPayment extends PaymentGateway{
	
	NetBankingPayment(double amount){
		super(amount);
		System.out.println("Payment method : NETBANKING");
		System.out.println(generateTxnId());
		process(amount);
	}

	@Override
	public boolean pay(double amount) {
		generateTxnId();
		return true;
	}

	@Override
	public boolean refund(double amount) {
		// TODO Auto-generated method stub
		return true;
	}
	
}
class PaymentFactory{
	
	PaymentGateway paymentGateway;
	
	PaymentFactory(PaymentGateway paymentGateway , double amount){
		this.paymentGateway=paymentGateway;
		pay(amount);
	}
	
	boolean pay(double amount) {
		return paymentGateway.pay(amount);
	}
}

public class Q3PymentGateway {
	
	public static void main(String[] args) {
		PaymentFactory p = new PaymentFactory(new UPIPayment(500),500);
		
	}
	

}
