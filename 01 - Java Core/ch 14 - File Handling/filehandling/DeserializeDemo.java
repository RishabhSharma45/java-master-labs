package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class BankAccount implements Serializable{
	int accountNo;
	String name;
	int Balance;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(int accountNo, String name, int balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		Balance = balance;
	}
}

//public class serializableDemo{
//	public static void main(String[] args) {
//		BankAccount b =
//	            new BankAccount(101, "Ram", 5000);
//		
//		try {
//			ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("account.txt"));
//			obj.writeObject(b);
//			obj.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}

public class DeserializeDemo {
    public static void main(String[] args) throws Exception {

        ObjectInputStream ois =
            new ObjectInputStream(
                new FileInputStream("account.txt"));

        BankAccount b =
            (BankAccount) ois.readObject();

        System.out.println(b.accountNo);
        System.out.println(b.name);
        System.out.println(b.Balance);

        ois.close();
    }
}
