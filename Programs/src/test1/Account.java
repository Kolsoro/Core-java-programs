package test1;

public class Account {
	
	int accNo;
	int balance;
	String name;
	
	public void insert(int accNo,int balance,String name) {
		this.accNo=accNo;
		this.balance=balance;
		this.name=name;
		
	}
	public void addAmount(int amt) {
		balance+=amt;
		System.out.println("Total balance now is "+balance);
	}
	
	public void retrive(int amt) {
		if(amt>balance) {
			System.out.println("Insufficient balance");
		}else {
			balance-=amt;
			System.out.println("Total amount remaining"+balance);
		}
		
	}
	public void checkBalance() {
		System.out.println("Your current balance is "+balance);
	}
	public void display() {
		System.out.println("accNo : "+accNo+" Name : "+name+" balance :"+balance);
	}
	

}
