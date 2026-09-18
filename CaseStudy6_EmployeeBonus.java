import java.util.ArrayList;

/*
 * Case Study 6: Employee Bonus Calculation
 * ---------------------------------------------
 * A company stores employee salaries in an ArrayList.
 * Bonus based on salary:
 *   Salary >= 80,000 -> 15% bonus
 *   Salary >= 50,000 -> 10% bonus
 *   Salary >= 30,000 -> 5% bonus
 *   Salary <  30,000 -> No bonus
 * Calculate the bonus and revised salary for every employee.
 */
public class CaseStudy6_EmployeeBonus {

    public static double calculateBonusPercentage(double salary) {
        if (salary >= 80000) return 15;
        if (salary >= 50000) return 10;
        if (salary >= 30000) return 5;
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Double> salaries = new ArrayList<>();
        salaries.add(95000.0);
        salaries.add(62000.0);
        salaries.add(35000.0);
        salaries.add(25000.0);
        salaries.add(50000.0);

        System.out.println("===== Employee Bonus Report =====");
        for (int i = 0; i < salaries.size(); i++) {
            double salary = salaries.get(i);
            double bonusPercent = calculateBonusPercentage(salary);
            double bonusAmount = salary * (bonusPercent / 100);
            double revisedSalary = salary + bonusAmount;

            System.out.println("\nEmployee " + (i + 1));
            System.out.println("Original Salary: Rs. " + salary);
            System.out.println("Bonus Percentage: " + bonusPercent + "%");
            System.out.printf("Bonus Amount: Rs. %.2f%n", bonusAmount);
            System.out.printf("Revised Salary: Rs. %.2f%n", revisedSalary);
        }
    }
}
