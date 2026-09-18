import java.util.Stack;

/*
 * Case Study 12: College Scholarship System
 * ---------------------------------------------
 * A college maintains scholarship-eligible students using a Stack.
 * Scholarship based on percentage:
 *   Percentage >= 90 -> Rs. 20,000
 *   Percentage >= 80 -> Rs. 15,000
 *   Percentage >= 70 -> Rs. 10,000
 *   Percentage >= 60 -> Rs. 5,000
 *   Below 60         -> No scholarship
 * Students are processed from the top of the stack (LIFO order).
 */
public class CaseStudy12_ScholarshipStack {

    public static double calculateScholarship(double percentage) {
        if (percentage >= 90) return 20000;
        if (percentage >= 80) return 15000;
        if (percentage >= 70) return 10000;
        if (percentage >= 60) return 5000;
        return 0;
    }

    public static void main(String[] args) {
        Stack<Double> studentPercentages = new Stack<>();

        // Students are pushed onto the stack as they register
        studentPercentages.push(65.0);
        studentPercentages.push(72.5);
        studentPercentages.push(58.0);
        studentPercentages.push(91.0);
        studentPercentages.push(83.5);

        System.out.println("===== Scholarship Processing (LIFO Order) =====");
        int studentNumber = 1;
        double totalScholarshipDisbursed = 0;

        // Process students from the top of the stack
        while (!studentPercentages.isEmpty()) {
            double percentage = studentPercentages.pop();
            double scholarship = calculateScholarship(percentage);
            totalScholarshipDisbursed += scholarship;

            System.out.println("\nStudent processed (from top of stack): #" + studentNumber);
            System.out.println("Percentage: " + percentage + "%");
            if (scholarship > 0) {
                System.out.println("Scholarship Awarded: Rs. " + scholarship);
            } else {
                System.out.println("Not eligible for scholarship.");
            }
            studentNumber++;
        }

        System.out.println("\n----- Summary -----");
        System.out.println("Total Scholarship Disbursed: Rs. " + totalScholarshipDisbursed);
    }
}
