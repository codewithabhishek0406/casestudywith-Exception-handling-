import java.util.Vector;

/*
 * Case Study 9: University Marks Classification
 * ---------------------------------------------
 * A university stores student marks in a Vector.
 * Classification:
 *   Marks >= 90 -> Outstanding
 *   Marks >= 75 -> Distinction
 *   Marks >= 60 -> First Division
 *   Marks >= 50 -> Second Division
 *   Marks <  50 -> Fail
 * Also calculates: total students, passed students, failed students, class average.
 */
public class CaseStudy9_UniversityMarks {

    public static String classify(int marks) {
        if (marks >= 90) return "Outstanding";
        if (marks >= 75) return "Distinction";
        if (marks >= 60) return "First Division";
        if (marks >= 50) return "Second Division";
        return "Fail";
    }

    public static void main(String[] args) {
        Vector<Integer> marksList = new Vector<>();
        marksList.add(95);
        marksList.add(82);
        marksList.add(67);
        marksList.add(55);
        marksList.add(40);
        marksList.add(72);

        int totalStudents = marksList.size();
        int passedCount = 0;
        int failedCount = 0;
        int sumMarks = 0;

        System.out.println("===== University Marks Report =====");
        for (int i = 0; i < marksList.size(); i++) {
            int marks = marksList.get(i);
            String result = classify(marks);
            sumMarks += marks;

            if (result.equals("Fail")) {
                failedCount++;
            } else {
                passedCount++;
            }

            System.out.println("\nStudent " + (i + 1));
            System.out.println("Marks: " + marks);
            System.out.println("Result: " + result);
        }

        double classAverage = (double) sumMarks / totalStudents;

        System.out.println("\n----- Summary -----");
        System.out.println("Total Students: " + totalStudents);
        System.out.println("Passed Students: " + passedCount);
        System.out.println("Failed Students: " + failedCount);
        System.out.printf("Class Average: %.2f%n", classAverage);
    }
}
