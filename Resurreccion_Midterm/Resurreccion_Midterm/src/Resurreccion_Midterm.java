// Base class representing a person
class Person {
    // Fields for the Person class
    private String name; // Name of the person
    private int age;     // Age of the person

    // Constructor for Person
    public Person(String name, int age) {
        this.name = name; // Initialize name
        this.age = age;   // Initialize age
    }

    // Method to display person's information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass representing a student
class Student extends Person {
    // Fields for the Student class
    private String studentID; // Student ID
    private String course;     // Course the student is enrolled in
    private int units;         // Number of units the student is taking
    private final int feePerUnit = 1000; // Constant fee per unit

    // Constructor for Student
    public Student(String name, int age, String studentID, String course, int units) {
        super(name, age); // Call to the superclass constructor to initialize name and age
        this.studentID = studentID; // Initialize student ID
        this.course = course;         // Initialize course
        this.units = units;           // Initialize units
    }

    // Method to calculate total fees
    public double calculateFees() {
        return units * feePerUnit; // Calculate total fee based on units
    }

    // Overriding displayInfo to include student details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call to the superclass displayInfo method
        System.out.println("Student ID: " + studentID + 
                           ", Course: " + course + 
                           ", Units: " + units + 
                           ", Total Fee: " + calculateFees()); // Display additional student info
    }
}

// Subclass representing an instructor
class Instructor extends Person {
    // Fields for the Instructor class
    private String employeeID; // Employee ID
    private String department;  // Department the instructor belongs to
    private double salary;      // Salary of the instructor

    // Constructor for Instructor
    public Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age); // Call to the superclass constructor to initialize name and age
        this.employeeID = employeeID; // Initialize employee ID
        this.department = department;   // Initialize department
        this.salary = salary;           // Initialize salary
    }

    // Overriding displayInfo to include instructor details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call to the superclass displayInfo method
        System.out.println("Employee ID: " + employeeID + 
                           ", Department: " + department + 
                           ", Salary: " + salary); // Display additional instructor info
    }
}

// Main class to test the enrollment system
public class Resurreccion_Midterm {
    // Method to demonstrate polymorphism
    public static void printDetails(Person person) {
        person.displayInfo(); // Calls the appropriate displayInfo method based on object type
    }

    public static void main(String[] args) {
        // Creating Student objects
        Student student1 = new Student("Trisha Gail", 19, "231001728", "Computer Enginnering ", 15);
        Student student2 = new Student("Makoy Lagdaan", 20, "231005120", "Computer Engineering", 15);

        // Creating Instructor objects
        Instructor instructor1 = new Instructor("Engr. Tanya", 26, "1111", "College of Engineering", 20000);
        Instructor instructor2 = new Instructor("Engr. Gela", 23, "2222", "College of Engineering", 20000);

        // Printing details for each person using the polymorphic method
        System.out.println("Student Details:");
        printDetails(student1); // Print details of student 1
        printDetails(student2); // Print details of student 2

        System.out.println("\nInstructor Details:");
        printDetails(instructor1); // Print details of instructor 1
        printDetails(instructor2); // Print details of instructor 2
    }
}
