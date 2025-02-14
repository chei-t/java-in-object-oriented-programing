

//import scanner for user input
import java.util.Scanner;



class StudentRecord {
    // Fields to store student details
            int studentID;
            String name;
            String course;

    // Constructor
    public StudentRecord(int studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

    // Method to print student details
    public void displayInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}


public class StudentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input their student details
        System.out.print("Enter Student ID: ");
        int studentID = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        // Instantiate a StudentRecord object using the user-provided data
        StudentRecord student = new StudentRecord(studentID, name, course);

        // Call the displayInfo method to display the student's details
        student.displayInfo();

        scanner.close();
    }
}
