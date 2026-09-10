import java.util.InputMismatchException;
import java.util.Scanner;



class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidWithdrawalAmountException extends Exception {
    public InvalidWithdrawalAmountException(String message) {
        super(message);
    }
}



class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount)
            throws InsufficientBalanceException, InvalidWithdrawalAmountException {

        if (amount <= 0) {
            throw new InvalidWithdrawalAmountException("Invalid withdrawal amount: amount must be greater than 0.");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance: available balance is " + balance + ", requested " + amount + ".");
        }

        balance -= amount;
        System.out.println("Withdrawal successful! Amount withdrawn: " + amount);
        System.out.println("Remaining balance: " + balance);
    }
}


public class BankAccountWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(5000.0); 

        try {
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);

        } catch (InsufficientBalanceException | InvalidWithdrawalAmountException e) {
            System.out.println("Transaction Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input: Please enter a numeric value only.");
        } finally {
            sc.close();
        }
    }
}
