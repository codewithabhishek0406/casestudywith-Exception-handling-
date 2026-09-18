import java.util.Vector;

/*
 * Case Study 7: Electricity Bill Calculation
 * ---------------------------------------------
 * An electricity board stores electricity consumption of customers in a Vector.
 * Bill calculation:
 *   First 100 units  -> Rs. 2/unit
 *   Next 100 units   -> Rs. 3/unit   (units 101-200)
 *   Above 200 units  -> Rs. 5/unit
 * If total bill > Rs. 1000, add 10% surcharge.
 */
public class CaseStudy7_ElectricityBill {

    public static double calculateBill(int units) {
        double bill = 0;

        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = 100 * 2 + (units - 100) * 3;
        } else {
            bill = 100 * 2 + 100 * 3 + (units - 200) * 5;
        }

        // Apply surcharge if bill exceeds Rs. 1000
        if (bill > 1000) {
            bill += bill * 0.10;
        }

        return bill;
    }

    public static void main(String[] args) {
        Vector<Integer> unitsConsumed = new Vector<>();
        unitsConsumed.add(80);
        unitsConsumed.add(150);
        unitsConsumed.add(250);
        unitsConsumed.add(320);

        System.out.println("===== Electricity Bill Report =====");
        for (int i = 0; i < unitsConsumed.size(); i++) {
            int units = unitsConsumed.get(i);
            double bill = calculateBill(units);

            System.out.println("\nCustomer " + (i + 1));
            System.out.println("Units Consumed: " + units);
            System.out.printf("Total Bill (including surcharge if applicable): Rs. %.2f%n", bill);
        }
    }
}
