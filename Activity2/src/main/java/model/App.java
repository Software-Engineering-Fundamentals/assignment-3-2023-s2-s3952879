import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // alex github test
        System.out.println("Test");
        // Lodge Enquiry


        // Manager Addresses enquiry







        // ===================================================
        // instructor registered for a course         
        // scanner object for testing
        Scanner scanner = new Scanner(System.in);

        // System prompts the user for Instructor details
        System.out.println("Enter Instructor details:");
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Login: ");
        String login = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        // Creates an Instructor object with all the provided user input
        Instructor instructor = new Instructor(address, email, phoneNumber, login, password);

        // System Prompts the user for Course details
        System.out.println("\nEnter Course details:");
        System.out.print("Course ID: ");
        String courseID = scanner.nextLine();
        System.out.print("Course Name: ");
        String courseName = scanner.nextLine();
        System.out.print("Course Category: ");
        String courseCategory = scanner.nextLine();
        System.out.print("Course Introduction: ");
        String courseIntroduction = scanner.nextLine();
        System.out.print("Course Price: ");
        double coursePrice = scanner.nextDouble();
        System.out.print("Course Duration: ");
        int courseDuration = scanner.nextInt();
        System.out.print("Refund Available (true/false): ");
        boolean refundAvailable = scanner.nextBoolean();

        // Creates a course Course object with all the provided user input
        course course = new course(courseID, courseName, courseCategory, courseIntroduction, coursePrice, courseDuration, refundAvailable);

        // Close the scanner
        scanner.close();


        // Register the course with the instructor
        // method is explained in instructor class
        instructor.registerCourse(course);
        // ===================================================

    }
}
