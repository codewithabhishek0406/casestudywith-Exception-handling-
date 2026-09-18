import java.util.ArrayList;

/*
 * Case Study 1: Student Attendance Management
 * ---------------------------------------------
 * A teacher wants to maintain the names of students present in a class.
 * Operations:
 *   1. Add student names.
 *   2. Display all students.
 *   3. Search for a student.
 *   4. Remove a student.
 *   5. Display the number of students present.
 */
public class CaseStudy1_StudentAttendance {

    private ArrayList<String> students;

    public CaseStudy1_StudentAttendance() {
        students = new ArrayList<>();
    }

    // 1. Add a student's name
    public void addStudent(String name) {
        students.add(name);
        System.out.println(name + " has been added to the attendance list.");
    }

    // 2. Display all students
    public void displayStudents() {
        System.out.println("\n--- Students Present ---");
        if (students.isEmpty()) {
            System.out.println("No students present.");
            return;
        }
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }
    }

    // 3. Search for a student
    public void searchStudent(String name) {
        if (students.contains(name)) {
            System.out.println(name + " is present. (Index: " + students.indexOf(name) + ")");
        } else {
            System.out.println(name + " is not present in the class.");
        }
    }

    // 4. Remove a student
    public void removeStudent(String name) {
        if (students.remove(name)) {
            System.out.println(name + " has been removed from the attendance list.");
        } else {
            System.out.println(name + " was not found, so nothing was removed.");
        }
    }

    // 5. Display the number of students present
    public void countStudents() {
        System.out.println("Total number of students present: " + students.size());
    }

    public static void main(String[] args) {
        CaseStudy1_StudentAttendance attendance = new CaseStudy1_StudentAttendance();

        // 1. Add students
        attendance.addStudent("Aarav");
        attendance.addStudent("Diya");
        attendance.addStudent("Kabir");
        attendance.addStudent("Meera");

        // 2. Display all students
        attendance.displayStudents();

        // 3. Search for a student
        attendance.searchStudent("Diya");
        attendance.searchStudent("Rohan");

        // 4. Remove a student
        attendance.removeStudent("Kabir");
        attendance.displayStudents();

        // 5. Display count
        attendance.countStudents();
    }
}
