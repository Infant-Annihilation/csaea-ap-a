package FRQPracticeAssignment;

public class BankTester {
    public static void main(String[] args) {
        // write code to create two BankAccount objects:
        // one for "Alex" with $100
	    BankAccount Alex = new BankAccount("Alex", 100.0);
        // one for "Jamie" with $250
 	    BankAccount Jamie = new BankAccount("Jamie", 250.0);

        // deposit $50 into Alex’s account
 	    Alex.deposit(50.0);

        // print both accounts’ information
	    Alex.printInfo();
	    Jamie.printInfo();
    }
}

class BankAccount {
    private String owner;
    private double balance;
 
    public BankAccount(String o, double b) {
        owner = o;
        balance = b;
    }
    
    public void deposit(double amount) {
        balance = balance + amount;
   }
 
   public void printInfo() {
        System.out.println(owner + " — Balance: $" + balance);
   }
}
