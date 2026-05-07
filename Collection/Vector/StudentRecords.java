/*
Q21.Design a Java program to manage student records using a Vector collection and a POJO class Student. The program should allow the user to store and manage student details and perform multiple logical operations on the stored data.
Description
Create a POJO class Student with fields:
int id
String name
double marks
String course
Use a Vector<Student> to store student objects.
Operations to Perform (5 operations)
Add Student records
Display all students
Search student by ID
Find student with highest marks
Count students enrolled in a particular course
Input Example
Enter number of students:
3

Enter Student Details:
101 Amit 78 Java
102 Neha 88 Python
103 Rahul 92 Java

Enter ID to search:
102

Enter course name:
Java
Output Example
Student List:
101 Amit 78 Java
102 Neha 88 Python
103 Rahul 92 Java

Search Result:
102 Neha 88 Python

Highest Marks Student:
103 Rahul 92 Java

Total students in Java course: 2
 */

import java.util.*;

// POJO Class
class Student {
    private int id;
    private String name;
    private double marks;
    private String course;

    // Constructor
    public Student(int id, String name, double marks, String course) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.course = course;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getMarks() { return marks; }
    public String getCourse() { return course; }

    // Helper method to print student details
    public void displayStudent() {
        System.out.println(id + " " + name + " " + (int)marks + " " + course);
    }
}

class StudentRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Student> studentVector = new Vector<>();

        // 1. Add Student Records
        System.out.println("Enter number of students:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Student Details (ID Name Marks Course):");
            int id = sc.nextInt();
            String name = sc.next();
            double marks = sc.nextDouble();
            String course = sc.next();
            studentVector.add(new Student(id, name, marks, course));
        }

        // 2. Display all students
        System.out.println("\nStudent List:");
        for (Student s : studentVector) {
            s.displayStudent();
        }

        // 3. Search student by ID
        System.out.println("\nEnter ID to search:");
        int searchId = sc.nextInt();
        System.out.println("Search Result:");
        for (Student s : studentVector) {
            if (s.getId() == searchId) {
                s.displayStudent();
            }
        }

        // 4. Find student with highest marks
        System.out.println("\nHighest Marks Student:");
        Student topper = studentVector.get(0);
        for (Student s : studentVector) {
            if (s.getMarks() > topper.getMarks()) {
                topper = s;
            }
        }
        topper.displayStudent();

        // 5. Count students in a particular course
        System.out.println("\nEnter course name to count:");
        String searchCourse = sc.next();
        int count = 0;
        for (Student s : studentVector) {
            if (s.getCourse().equalsIgnoreCase(searchCourse)) {
                count++;
            }
        }
        System.out.println("Total students in " + searchCourse + " course: " + count);

        sc.close();
    }
}