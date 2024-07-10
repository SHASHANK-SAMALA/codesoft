package CODESOFT;


   public class BankAccount {
        private double balance;
    
        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }
    
        public double getBalance() {
            return balance;
        }
    
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposit successful! Your new balance is: $" + balance);
            } else {
                System.out.println("!! Deposit amount must be positive. !!");
            }
        }
    
        public boolean withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful! Your new balance is: $" + balance);
                return true;
            } else if (amount > balance) {
                System.out.println("!! Insufficient balance for this withdrawal !!.");
                return false;
            } else {
                System.out.println("!! Withdrawal amount must be positive. !!");
                return false;
            }
        }
    }
    
    

