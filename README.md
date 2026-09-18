# Java Collections Framework — Case Study Assignment

This repository contains 12 Java case studies covering `ArrayList`, `Vector`, and `Stack`
from the Java Collections Framework. Each case study is a single, self-contained
`.java` file with its own `main()` method, so each one can be compiled and run
independently.

## Contents

| # | File | Topic | Collection Used |
|---|------|-------|------------------|
| 1 | `CaseStudy1_StudentAttendance.java` | Student Attendance Management | `ArrayList<String>` |
| 2 | `CaseStudy2_ShoppingCart.java` | Shopping Cart | `ArrayList<String>` |
| 3 | `CaseStudy3_EmployeeSalaryList.java` | Employee Salary List | `ArrayList<Integer>` |
| 4 | `CaseStudy4_StudentGrading.java` | Student Marks & Grading | `ArrayList<Integer>` |
| 5 | `CaseStudy5_ShoppingDiscount.java` | Shopping Discount Calculation | `ArrayList<Double>` |
| 6 | `CaseStudy6_EmployeeBonus.java` | Employee Bonus Calculation | `ArrayList<Double>` |
| 7 | `CaseStudy7_ElectricityBill.java` | Electricity Bill Calculation | `Vector<Integer>` |
| 8 | `CaseStudy8_BusReservation.java` | Bus Reservation Fare Calculation | `Vector<Integer>` |
| 9 | `CaseStudy9_UniversityMarks.java` | University Marks Classification | `Vector<Integer>` |
| 10 | `CaseStudy10_ATMStack.java` | ATM Transaction System | `Stack<Integer>` |
| 11 | `CaseStudy11_ParkingSystem.java` | Parking System | `Stack<String>` |
| 12 | `CaseStudy12_ScholarshipStack.java` | College Scholarship System | `Stack<Double>` |

## How to Compile and Run

Each file is independent. To compile and run any one of them:

```bash
javac CaseStudy1_StudentAttendance.java
java CaseStudy1_StudentAttendance
```

Repeat with the corresponding file/class name for any other case study, e.g.:

```bash
javac CaseStudy10_ATMStack.java
java CaseStudy10_ATMStack
```

To compile everything at once:

```bash
javac *.java
```

Then run any class name you like with `java <ClassName>` (without `.java`).

## Notes

- Sample/hardcoded data is used inside each `main()` method so every program
  runs immediately without requiring user input — this makes it easy to demo
  and grade. You can freely modify the hardcoded values (names, marks, salaries,
  ages, etc.) to test different scenarios.
- Each program is heavily commented, mapping directly back to the problem
  statement's requirements, so it's easy to follow the logic for each
  operation/rule listed in the case study.
- All programs were compiled and test-run successfully on OpenJDK 21.

## Suggested Repository Structure

```
.
├── README.md
├── CaseStudy1_StudentAttendance.java
├── CaseStudy2_ShoppingCart.java
├── CaseStudy3_EmployeeSalaryList.java
├── CaseStudy4_StudentGrading.java
├── CaseStudy5_ShoppingDiscount.java
├── CaseStudy6_EmployeeBonus.java
├── CaseStudy7_ElectricityBill.java
├── CaseStudy8_BusReservation.java
├── CaseStudy9_UniversityMarks.java
├── CaseStudy10_ATMStack.java
├── CaseStudy11_ParkingSystem.java
└── CaseStudy12_ScholarshipStack.java
```

Simply upload all files (including this README) to the root of your GitHub
repository, or place them inside a folder such as `java-collections-assignment/`.
