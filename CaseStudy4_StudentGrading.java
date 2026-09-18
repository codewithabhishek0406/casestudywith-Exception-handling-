import java.util.ArrayList;

/*
 * Case Study 4: Student Marks Grading
 * ---------------------------------------------
 * A college maintains the marks of students using an ArrayList.
 * For each student (5 subjects, max 100 marks each), calculate:
 *   - Total marks
 *   - Percentage
 *   - Grade:
 *       Percentage >= 90 -> A
 *       Percentage >= 75 -> B
 *       Percentage >= 60 -> C
 *       Percentage >= 50 -> D
 *       Percentage <  50 -> Fail
 */
public class CaseStudy4_StudentGrading {

    private static final int NUM_SUBJECTS = 5;
    private static final int MAX_MARKS_PER_SUBJECT = 100;

    // Holds one student's data: name + marks in 5 subjects
    static class Student {
        String name;
        ArrayList<Integer> marks;

        Student(String name, ArrayList<Integer> marks) {
            this.name = name;
            this.marks = marks;
        }
    }

    public static int calculateTotal(ArrayList<Integer> marks) {
        int total = 0;
        for (int m : marks) {
            total += m;
        }
        return total;
    }

    public static double calculatePercentage(int total) {
        int maxTotal = NUM_SUBJECTS * MAX_MARKS_PER_SUBJECT;
        return (total * 100.0) / maxTotal;
    }

    public static String assignGrade(double percentage) {
        if (percentage >= 90) return "A";
        if (percentage >= 75) return "B";
        if (percentage >= 60) return "C";
        if (percentage >= 50) return "D";
        return "Fail";
    }

    public static void processStudent(Student student) {
        int total = calculateTotal(student.marks);
        double percentage = calculatePercentage(total);
        String grade = assignGrade(percentage);

        System.out.println("\nStudent: " + student.name);
        System.out.println("Marks: " + student.marks);
        System.out.println("Total Marks: " + total + " / " + (NUM_SUBJECTS * MAX_MARKS_PER_SUBJECT));
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Aarav", new ArrayList<>(java.util.Arrays.asList(95, 92, 88, 96, 91))));
        students.add(new Student("Diya", new ArrayList<>(java.util.Arrays.asList(80, 78, 82, 76, 79))));
        students.add(new Student("Kabir", new ArrayList<>(java.util.Arrays.asList(65, 60, 70, 62, 68))));
        students.add(new Student("Meera", new ArrayList<>(java.util.Arrays.asList(55, 50, 52, 58, 54))));
        students.add(new Student("Rohan", new ArrayList<>(java.util.Arrays.asList(40, 45, 38, 42, 35))));

        System.out.println("===== Student Grading Report =====");
        for (Student s : students) {
            processStudent(s);
        }
    }
}
