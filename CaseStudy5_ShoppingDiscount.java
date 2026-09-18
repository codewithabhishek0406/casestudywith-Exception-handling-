import java.util.ArrayList;

/*
 * Case Study 5: Shopping Discount
 * ---------------------------------------------
 * An online shopping system stores product prices in an ArrayList.
 * Discount based on total purchase amount:
 *   Total >= 10,000 -> 20% discount
 *   Total >= 5,000  -> 10% discount
 *   Total >= 2,000  -> 5% discount
 *   Otherwise       -> No discount
 * Calculate the discount and final payable amount.
 */
public class CaseStudy5_ShoppingDiscount {

    public static double calculateTotal(ArrayList<Double> prices) {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    public static double calculateDiscountPercentage(double total) {
        if (total >= 10000) return 20;
        if (total >= 5000) return 10;
        if (total >= 2000) return 5;
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(2500.0);
        prices.add(1800.0);
        prices.add(3200.0);
        prices.add(1500.0);

        System.out.println("--- Product Prices ---");
        for (int i = 0; i < prices.size(); i++) {
            System.out.println("Product " + (i + 1) + ": Rs. " + prices.get(i));
        }

        double total = calculateTotal(prices);
        double discountPercent = calculateDiscountPercentage(total);
        double discountAmount = total * (discountPercent / 100);
        double finalAmount = total - discountAmount;

        System.out.println("\nTotal Purchase Amount: Rs. " + total);
        System.out.println("Discount Applicable: " + discountPercent + "%");
        System.out.printf("Discount Amount: Rs. %.2f%n", discountAmount);
        System.out.printf("Final Payable Amount: Rs. %.2f%n", finalAmount);
    }
}
