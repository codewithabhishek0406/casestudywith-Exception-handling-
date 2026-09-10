import java.util.InputMismatchException;
import java.util.Scanner;

// ---------- Custom Exception Class ----------

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

// ---------- Business Logic Class ----------

class StudentResult {
    private int[] marks;

    public StudentResult(int[] marks) {
        this.marks = marks;
    }

    public double calculateAverage() throws InvalidMarksException, ArithmeticException {

        if (marks.length == 0) {
            throw new ArithmeticException("Division by zero: no subjects entered.");
        }

        int total = 0;
        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new InvalidMarksException("Invalid marks: " + mark + " is outside the range 0-100.");
            }
            total += mark;
        }

        return (double) total / marks.length;
    }
}

// ---------- Main Class ----------

public class StudentExaminationResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of subjects: ");
            int n = sc.nextInt();

            int[] marks = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();
            }

            StudentResult result = new StudentResult(marks);
            double average = result.calculateAverage();

            System.out.println("Average marks: " + average);

        } catch (InvalidMarksException e) {
            System.out.println("Marks Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Calculation Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input: Please enter numeric values only.");
        } finally {
            sc.close();
        }
    }
}
