# CODALPHA-Task-1
Name:M.Saisree
StudentId:CA/AP1/3057
COMPANY: CODEALPHA
DOMAIN:JAVA PROGRAMMING
DURATION:APRIL TO MAY 2025

OVERVIEW OF THE INTERNSHIP TASK-1
 Student Grade Tracker – Explained
 1. Student Class
This class stores info about a single student.
•	name: The student's name
•	grades: A list (ArrayList) of the student's grades
•	addGrade(int grade): Adds a grade to the list
•	getAverage(): Calculates average of grades
•	getHighest(): Finds the highest grade
•	getLowest(): Finds the lowest grade
________________________________________
 2. Main Class: StudentGradeTracker
 a) Create Scanner and Student List

Scanner scanner = new Scanner(System.in);
ArrayList<Student> students = new ArrayList<>();
•	Scanner is used for input.
•	ArrayList stores all the students.
 b) Ask for Number of Students
System.out.print("Enter number of students: ");
int numStudents = scanner.nextInt();
 c) Loop Through Each Student
for (int i = 0; i < numStudents; i++) {
•	Takes each student’s name and number of grades.
•	Uses a nested loop to take all grades for each student.
 d) Add Grades to Each Student
int grade = scanner.nextInt();
student.addGrade(grade);
•	Collects grades one by one and stores them.
 e) Add Student to the List
students.add(student);
________________________________________
 3. Display the Results
System.out.println("\n--- Student Grades Summary ---");
•	Loops through each student.
•	Prints:
o	Their name
o	Average grade
o	Highest grade
o	Lowest grade
________________________________________
 Sample Interaction
Enter number of students: 2

Enter student name: Alice
Enter number of grades for Alice: 3
Enter grade 1: 80
Enter grade 2: 85
Enter grade 3: 90

Enter student name: Bob
Enter number of grades for Bob: 2
Enter grade 1: 75
Enter grade 2: 70
Output:
Student: Alice
  Average: 85.0
  Highest: 90
  Lowest : 80

Student: Bob
  Average: 72.5
  Highest: 75
  Lowest : 70





