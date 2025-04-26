import java.util.ArrayList;
import java.util.Scanner;

// Student class to represent each student's data
class Student {
    String name;
    double marks;
    String grade;

    // Constructor
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
        this.grade = GradeUtils.convertMarksToGrade(marks);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Marks: " + String.format("%.2f", marks) + ", Grade: " + grade;
    }
}

// Utility class to handle grade conversion
class GradeUtils {
    public static String convertMarksToGrade(double marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else if (marks >= 50) {
            return "E";
        } else {
            return "F";
        }
    }
}

public class StudentGradeTracker {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean keepRunning = true;

        System.out.println("Student Grade Tracker Program");

        while (keepRunning) {
            ArrayList<Student> students = collectStudentData();

            if (!students.isEmpty()) {
                showStudentReport(students);
            } else {
                System.out.println("No students to display.");
            }

            keepRunning = askToContinue();
        }

        System.out.println("Thank you for using the Student Grade Tracker. Goodbye!");
        scanner.close();
    }

    // Method to collect student data
    private static ArrayList<Student> collectStudentData() {
        ArrayList<Student> students = new ArrayList<>();

        int numberOfStudents = getPositiveIntegerInput("Enter the number of students: ");

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            double marks = getValidMarksInput("Enter marks for " + name + " (0 to 100): ");
            students.add(new Student(name, marks));
        }
        return students;
    }

    // Method to display student report
    private static void showStudentReport(ArrayList<Student> students) {
        double totalMarks = 0;
        double highestMarks = students.get(0).marks;
        double lowestMarks = students.get(0).marks;

        System.out.println("\nStudent Details:");
        for (Student student : students) {
            System.out.println(student);
            totalMarks += student.marks;

            if (student.marks > highestMarks) {
                highestMarks = student.marks;
            }
            if (student.marks < lowestMarks) {
                lowestMarks = student.marks;
            }
        }

        double averageMarks = totalMarks / students.size();

        System.out.println("\nSummary:");
        System.out.println("Average Marks: " + String.format("%.2f", averageMarks)
                + ", Grade: " + GradeUtils.convertMarksToGrade(averageMarks));
        System.out.println("Highest Marks: " + String.format("%.2f", highestMarks)
                + ", Grade: " + GradeUtils.convertMarksToGrade(highestMarks));
        System.out.println("Lowest Marks: " + String.format("%.2f", lowestMarks)
                + ", Grade: " + GradeUtils.convertMarksToGrade(lowestMarks));
    }

    // Utility method to get valid marks input
    private static double getValidMarksInput(String prompt) {
        double marks = -1;
        while (marks < 0 || marks > 100) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                marks = scanner.nextDouble();
                scanner.nextLine(); // Clear buffer
                if (marks < 0 || marks > 100) {
                    System.out.println("Marks must be between 0 and 100.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.nextLine(); // Clear invalid input
            }
        }
        return marks;
    }

    // Utility method to get positive integer input
    private static int getPositiveIntegerInput(String prompt) {
        int number = -1;
        while (number <= 0) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                scanner.nextLine(); // Clear buffer
                if (number <= 0) {
                    System.out.println("Please enter a number greater than zero.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer value.");
                scanner.nextLine(); // Clear invalid input
            }
        }
        return number;
    }

    // Ask user if they want to continue
    private static boolean askToContinue() {
        System.out.print("\nDo you want to enter another set of students? (yes/no): ");
        String choice = scanner.nextLine().trim().toLowerCase();
        return choice.equals("yes") || choice.equals("y");
    }
}