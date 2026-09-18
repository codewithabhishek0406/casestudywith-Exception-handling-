import java.util.Vector;

/*
 * Case Study 8: Bus Reservation System
 * ---------------------------------------------
 * A bus reservation system stores passenger ages in a Vector.
 * Ticket fare: Rs. 500 per passenger.
 * Discount conditions:
 *   Age < 5        -> Free
 *   Age 5-12       -> 50% discount
 *   Age 13-59      -> Full fare
 *   Age >= 60      -> 30% discount
 */
public class CaseStudy8_BusReservation {

    private static final double BASE_FARE = 500.0;

    public static double calculateFare(int age) {
        if (age < 5) {
            return 0;
        } else if (age <= 12) {
            return BASE_FARE * 0.50;
        } else if (age <= 59) {
            return BASE_FARE;
        } else {
            return BASE_FARE * 0.70; // 30% discount
        }
    }

    public static void main(String[] args) {
        Vector<Integer> passengerAges = new Vector<>();
        passengerAges.add(3);
        passengerAges.add(8);
        passengerAges.add(25);
        passengerAges.add(45);
        passengerAges.add(65);

        System.out.println("===== Bus Reservation Fare Report =====");
        double totalCollection = 0;

        for (int i = 0; i < passengerAges.size(); i++) {
            int age = passengerAges.get(i);
            double fare = calculateFare(age);
            totalCollection += fare;

            System.out.println("\nPassenger " + (i + 1));
            System.out.println("Age: " + age);
            System.out.printf("Fare Payable: Rs. %.2f%n", fare);
        }

        System.out.printf("%nTotal Fare Collected: Rs. %.2f%n", totalCollection);
    }
}
