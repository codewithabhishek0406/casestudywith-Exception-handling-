import java.util.Stack;

/*
 * Case Study 11: Parking System
 * ---------------------------------------------
 * A parking system can accommodate 5 cars, stored in a Stack.
 * Operations:
 *   1. Add cars if space is available.
 *   2. Reject a car if parking is full.
 *   3. Remove the last parked car when it leaves.
 *   4. Display the remaining cars.
 *   5. Calculate parking charges:
 *        First 2 hours     -> Rs. 50
 *        Each additional hour -> Rs. 20
 */
public class CaseStudy11_ParkingSystem {

    private static final int CAPACITY = 5;
    private Stack<String> parkingLot;

    public CaseStudy11_ParkingSystem() {
        parkingLot = new Stack<>();
    }

    // 1 & 2. Add a car if space available, else reject
    public void parkCar(String carNumber) {
        if (parkingLot.size() < CAPACITY) {
            parkingLot.push(carNumber);
            System.out.println(carNumber + " parked successfully.");
        } else {
            System.out.println("Parking Full! " + carNumber + " is rejected.");
        }
    }

    // 3. Remove the last parked car (the one that leaves first, LIFO)
    public void removeCar() {
        if (!parkingLot.isEmpty()) {
            String car = parkingLot.pop();
            System.out.println(car + " has left the parking lot.");
        } else {
            System.out.println("Parking lot is empty. No car to remove.");
        }
    }

    // 4. Display remaining cars
    public void displayCars() {
        System.out.println("\n--- Cars Currently Parked ---");
        if (parkingLot.isEmpty()) {
            System.out.println("No cars parked.");
            return;
        }
        for (int i = parkingLot.size() - 1; i >= 0; i--) {
            System.out.println((parkingLot.size() - i) + ". " + parkingLot.get(i));
        }
        System.out.println("Available Slots: " + (CAPACITY - parkingLot.size()));
    }

    // 5. Calculate parking charges
    public static double calculateCharges(int hours) {
        if (hours <= 2) {
            return 50;
        }
        return 50 + (hours - 2) * 20;
    }

    public static void main(String[] args) {
        CaseStudy11_ParkingSystem parking = new CaseStudy11_ParkingSystem();

        // 1 & 2. Add cars (6th car should be rejected since capacity is 5)
        parking.parkCar("KA-01-1234");
        parking.parkCar("KA-02-5678");
        parking.parkCar("KA-03-9012");
        parking.parkCar("KA-04-3456");
        parking.parkCar("KA-05-7890");
        parking.parkCar("KA-06-1111"); // Should be rejected

        // 4. Display cars
        parking.displayCars();

        // 3. Remove last parked car
        parking.removeCar();
        parking.displayCars();

        // 5. Calculate parking charges for a few sample durations
        System.out.println("\n--- Parking Charges ---");
        int[] hoursParked = {1, 2, 3, 5, 8};
        for (int hours : hoursParked) {
            System.out.println(hours + " hour(s) -> Rs. " + calculateCharges(hours));
        }
    }
}
