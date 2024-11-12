package task6;

	public class Account 
	    {
	       private double balance;
	       
	      public Account()
	      {
	        this.balance = 0.0;  
	      }
	    public Account(double initialBalance)
	    {
	        this.balance = initialBalance;
	    }
	    public void deposit(double amount) 
	    {
	        if (amount > 0)
	        {
	            balance += amount;
	            System.out.println("Deposited: $" + amount);
	        } 
	        else
	        {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }
	    public void withdraw(double amount)
	    {
	        if (amount > 0 && amount <= balance)
	        {
	            balance -= amount;
	            System.out.println("Withdrawn: $" + amount);
	        } 
	        else if (amount > balance)
	        {
	            System.out.println("Insufficient balance.");
	        } 
	        else 
	        {
	            System.out.println("Withdraw amount must be positive.");
	        }
	    }
	    public double checkBalance()
	    {
	        return balance;
	    }
	    public static void main(String[] args) 
	    {
	        Account account1 = new Account();
	        account1.deposit(400);
	        account1.withdraw(200);
	        System.out.println("Account 1 Balance: " + account1.checkBalance());

	      
	        Account account2 = new Account(1000);
	        account2.deposit(300);
	        account2.withdraw(1500);  
	        System.out.println("Account 2 Balance: " + account2.checkBalance());
	    }
	}



