import java.util.Stack;

/*
 * Case Study 10: ATM Transaction System
 * ---------------------------------------------
 * An ATM maintains recent transactions using a Stack.
 * Initial balance: Rs. 20,000.
 * Withdrawal transactions: 5000, 3000, 8000, 6000.
 * The system should allow withdrawal only when sufficient balance is available.
 * The latest successful transaction should be available using peek().
 */
public class CaseStudy10_ATMStack {

    public static void main(String[] args) {
        double balance = 20000;
        Stack<Integer> transactions = new Stack<>();

        int[] withdrawals = {5000, 3000, 8000, 6000};

        System.out.println("===== ATM Transaction Report =====");
        System.out.println("Initial Balance: Rs. " + balance);

        for (int amount : withdrawals) {
            System.out.println("\nAttempting to withdraw: Rs. " + amount);
            if (amount <= balance) {
                balance -= amount;
                transactions.push(amount);
                System.out.println("Transaction Successful.");
                System.out.println("Remaining Balance: Rs. " + balance);
                System.out.println("Latest Transaction (peek): Rs. " + transactions.peek());
            } else {
                System.out.println("Transaction Failed: Insufficient Balance.");
                System.out.println("Current Balance: Rs. " + balance);
            }
        }

        System.out.println("\n----- Final Summary -----");
        System.out.println("Final Balance: Rs. " + balance);
        System.out.println("All Successful Transactions (top to bottom / most recent first):");
        Stack<Integer> temp = (Stack<Integer>) transactions.clone();
        while (!temp.isEmpty()) {
            System.out.println("Rs. " + temp.pop());
        }
    }
}
