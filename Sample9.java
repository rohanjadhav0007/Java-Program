package com.org;

class BankException extends Exception{
	public BankException(String str) {
		super(str);
	}
}
class Bank{
	int balance;
	Bank(){
		
	}
	Bank(int balance){
		this.balance=balance;
	}
	int with(int amt) throws BankException{
		if(amt>balance)
			throw new BankException("Insufficint balance");
			else
		balance=balance-amt;
		return balance;
	}
	int deposit(int amt) {
		balance=balance+amt;
		return balance;
	}
}
public class Sample9 {

	public static void main(String[] args) {
		Bank bank = new Bank(2000);
		try {
			System.out.println("Amount After Withdrawal := "+bank.with(4000));
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally{
			System.out.println("Balance := "+bank.balance);
		}
	}

}
