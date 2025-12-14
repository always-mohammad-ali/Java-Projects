
package finallabpractices;

import java.util.Scanner;

public class BankAccount {
    private double balance;
    
    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
        
    }
   
    
    
    
    public void withdraw(double amount) throws InsufficientFundsException {
        validateAmount(amount);
        
        if (amount > balance) {
            throw new InsufficientFundsException(amount - balance);
        }
        
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: $" + balance);
    }
    
    private void validateAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (amount > 10000) {
            throw new IllegalArgumentException("Cannot withdraw more than $10,000 at once");
        }
    }
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();
            
            account.withdraw(amount);
            
        } catch (InsufficientFundsException e) {
            System.err.println("Transaction failed: " + e.getMessage());
            System.err.println("You need $" + e.getAmount() + " more");
            
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid input: " + e.getMessage());
            
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getClass().getName());
            e.printStackTrace();
            
        } finally {
            scanner.close();
            System.out.println("Thank you for banking with us!");
        }
    }
}

class InsufficientFundsException extends Exception {
    private double deficit;
    
    public InsufficientFundsException(double deficit) {
        super("Insufficient funds for transaction");
        this.deficit = deficit;
    }
    
    public double getDeficit() {
        return deficit;
    }
}
