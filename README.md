
# CODEALPHA-Task-1

Name:M.Saisree

StudentId:CA/AP1/3057

COMPANY: CODEALPHA

DOMAIN:JAVA PROGRAMMING

DURATION:APRIL TO MAY 2025


OVERVIEW OF THE PROJECT :
This Java project helps track multiple students' grades, calculate average, highest, and lowest grades for each student, and display a summary.

Structure
Class: Student

Fields:

name — Student's name (String).

grades — List of grades (ArrayList of Integers).

Methods:
Student(String name) — Constructor to set the student's name and initialize an empty grade list.

void addGrade(int grade) — Adds a new grade to the student's list.

double getAverage() — Calculates and returns the average of the student's grades.

int getHighest() — Returns the highest grade the student received.

int getLowest() — Returns the lowest grade the student received.

Main Class: StudentGradeTracker

Uses a Scanner to take user input.

Steps:

Ask for the number of students.

For each student:

Read the student's name.

Ask for the number of grades.

Read each grade and store it.

After collecting all data:

Display a summary showing each student's average, highest, and lowest grades.

 Key Concepts Used
Classes and Objects (OOP - Object-Oriented Programming)

ArrayLists for flexible storage of grades.

Loops (for loops) to collect multiple grades.

User Input handling using Scanner.

Basic Calculations (sum, max, min).

 Strengths
Well-organized and modular (Student class cleanly separates logic).

Easy to extend (you could later add more features, like sorting or GPA calculation).

Good use of dynamic lists (ArrayList) instead of fixed-size arrays.

 Possible Improvements (Optional)
Format average to 2 decimal places (for cleaner output).

Handle cases where students have no grades (avoid weird min/max values).

Add input validation (make sure users don't enter negative grades, etc.).
![Screenshot 2025-04-27 235505](https://github.com/user-attachments/assets/a6dae818-8882-429c-9ae2-df6145419d89)



