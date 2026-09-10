import java.util.InputMismatchException;
import java.util.Scanner;

// ---------- Custom Exception Classes ----------

class InvalidPriceException extends Exception {
    public InvalidPriceException(String message) {
        super(message);
    }
}

class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message) {
        super(message);
    }
}

class InvalidDiscountException extends Exception {
    public InvalidDiscountException(String message) {
        super(message);
    }
}

class InsufficientPaymentException extends Exception {
    public InsufficientPaymentException(String message) {
        super(message);
    }
}

// ---------- Business Logic Class ----------

class ShoppingCart {

    public double calculateFinalAmount(double price, int quantity, double discountPercent)
            throws InvalidPriceException, InvalidQuantityException, InvalidDiscountException {

        if (price <= 0) {
            throw new InvalidPriceException("Invalid product price: price must be greater than 0.");
        }

        if (quantity <= 0) {
            throw new InvalidQuantityException("Invalid quantity: quantity must be greater than 0.");
        }

        if (discountPercent < 0 || discountPercent > 100) {
            throw new InvalidDiscountException("Invalid discount percentage: must be between 0 and 100.");
        }

        double bill = price * quantity;
        double discountAmount = bill * (discountPercent / 100);
        return bill - discountAmount;
    }

    public void processPayment(double billAmount, double paymentAmount) throws InsufficientPaymentException {
        if (paymentAmount < billAmount) {
            throw new InsufficientPaymentException(
                    "Payment amount (" + paymentAmount + ") is less than the bill (" + billAmount + ").");
        }
        System.out.println("Payment successful! Change returned: " + (paymentAmount - billAmount));
    }
}

// ---------- Main Class ----------

public class OnlineShoppingPayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        try {
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Enter discount percentage: ");
            double discount = sc.nextDouble();

            double finalAmount = cart.calculateFinalAmount(price, quantity, discount);
            System.out.println("Final amount to pay: " + finalAmount);

            System.out.print("Enter payment amount: ");
            double payment = sc.nextDouble();

            cart.processPayment(finalAmount, payment);

        } catch (InvalidPriceException | InvalidQuantityException
                | InvalidDiscountException | InsufficientPaymentException e) {
            System.out.println("Transaction Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input: Please enter numeric values only.");
        } finally {
            sc.close();
        }
    }
}
