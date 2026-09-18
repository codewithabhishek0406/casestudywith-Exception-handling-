import java.util.ArrayList;


public class CaseStudy3_EmployeeSalaryList {

    private ArrayList<Integer> salaries;

    public CaseStudy3_EmployeeSalaryList() {
        salaries = new ArrayList<>();
    }

    // 1. Store a salary
    public void addSalary(int salary) {
        salaries.add(salary);
    }

    // 2. Display all salaries
    public void displaySalaries() {
        System.out.println("\n--- Employee Salaries ---");
        for (int i = 0; i < salaries.size(); i++) {
            System.out.println("Employee " + (i + 1) + ": Rs. " + salaries.get(i));
        }
    }

    // 3. Find the highest salary
    public int findHighestSalary() {
        int max = salaries.get(0);
        for (int s : salaries) {
            if (s > max) {
                max = s;
            }
        }
        return max;
    }

    // 4. Calculate the total salary
    public int calculateTotalSalary() {
        int total = 0;
        for (int s : salaries) {
            total += s;
        }
        return total;
    }

    // 5. Calculate the average salary
    public double calculateAverageSalary() {
        if (salaries.isEmpty()) return 0;
        return (double) calculateTotalSalary() / salaries.size();
    }

    public static void main(String[] args) {
        CaseStudy3_EmployeeSalaryList list = new CaseStudy3_EmployeeSalaryList();

        // 1. Store salaries
        list.addSalary(35000);
        list.addSalary(52000);
        list.addSalary(48000);
        list.addSalary(61000);
        list.addSalary(29000);

        // 2. Display all salaries
        list.displaySalaries();

        // 3. Highest salary
        System.out.println("\nHighest Salary: Rs. " + list.findHighestSalary());

        // 4. Total salary
        System.out.println("Total Salary: Rs. " + list.calculateTotalSalary());

        // 5. Average salary
        System.out.printf("Average Salary: Rs. %.2f%n", list.calculateAverageSalary());
    }
}
