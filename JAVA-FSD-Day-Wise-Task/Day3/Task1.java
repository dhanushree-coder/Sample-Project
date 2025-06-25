package Day3;

public class Task1 {
	
	
	
	    private String accountHolder;
	    private double balance;

	    // Constructor
	    public Task1(String name, double initialBalance) {
	        accountHolder = name;
	        balance = initialBalance;
	    }

	    // Deposit money
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: ₹" + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    // Withdraw money
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: ₹" + amount);
	        } else {
	            System.out.println("Invalid or insufficient balance.");
	        }
	    }

	    // Show balance
	    public void showBalance() {
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Current Balance: ₹" + balance);
	    }

	    // Main method for testing
	    public static void main(String[] args) {
	        Task1 account = new Task1("Dhanu", 1000.0);

	        account.showBalance();
	        account.deposit(500.0);
	        account.withdraw(200.0);
	        account.withdraw(2000.0); // shows error
	        account.showBalance();
	    }
	}

	
	
	
	
	
	
	
	
	