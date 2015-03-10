import java.util.Date;


public class Account {
	
	private int id = 0;
	
	private double balance = 0;
	
	private double annualInterestRate = 0;
	
	private java.util.Date date = new java.util.Date();
	
	
	
	//constructors
	public Account() {		
	}
	
	public Account(int newId, double newBalance, 
			double newAnnualInterestRate) {
		id = newId;
		balance = newBalance;
		annualInterestRate = (newAnnualInterestRate / 100);
	}
	
	
	
	//non-trivial
	public void deposit(double ammount) {
		balance += ammount;
	}
	
	public void withdraw(double ammount) {
		balance -= ammount;
	}
	
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 12);
	}
	
	public double getMonthlyInterest() {
		return (balance * (this.getMonthlyInterestRate()));
	}
	
	
	
	
	//getters and setters
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public Date getDateCreated() {
		return date;
	}
	
}
