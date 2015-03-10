import java.util.Scanner;

public class ATM {
	Scanner input = new Scanner(System.in);
	
	private Account[] accounts;
	private int ID;
		
	public ATM() {
		accounts = makeAccounts();
		//System.out.println(accounts.length);
		enterID();
	}
	
	public Account[] makeAccounts() {
		Account[] newAccounts = new Account[10];
		for (int i = 0; i < 9; i ++) {
			newAccounts[i] = new Account(i, 100, 0);
		}		
		return newAccounts;
	}
	
	public void enterID() {
		System.out.println("Enter an ID");
		ID = input.nextInt();
		if (ID > accounts.length) {
			System.out.println("ID is incorrect.");
			enterID();
		}
		mainMenu();
	}
	
	public void mainMenu() {
		System.out.println("Main Menu: \n"
				+ "1: check balance \n"
				+ "2: withdraw \n"
				+ "3: deposit \n"
				+ "4: exit \n"
				+ "Enter a choice: ");
		int choice = input.nextInt();
		makeChoice(choice);
	}
	
	public void makeChoice(int choice) {
		switch (choice) {
		case 1: System.out.printf("%21s %3.2f\n", "Current ballance is: ", accounts[ID-1].getBalance()); 
			mainMenu();
		case 2: withdraw();
		case 3: deposit();
		case 4: enterID();	
		default: System.out.println("Not a valid choice");
			mainMenu();
		}
	}
	
	public void withdraw() {
		System.out.println("Enter an amount to withdraw: ");
		accounts[ID-1].withdraw(input.nextDouble());
		mainMenu();
	}
	
	public void deposit() {
		System.out.println("Enter an ammount to deposit: ");
		accounts[ID - 1].deposit(input.nextDouble());
		mainMenu();
	}
	
	
	
	
	
	
	
	
	
	
	
 	public static void main(String[] args) {
		
		ATM atm1 = new ATM();
	}
	
}
