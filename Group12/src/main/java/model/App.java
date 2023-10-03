import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        // ===================================================
        // user lodges and enquiry
        // scanner object for testing
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your contact number: ");
        String contactNumber = scanner.nextLine();

        System.out.print("Enter your emergency contact: ");
        String emergencyContact = scanner.nextLine();

        // Create a User object with user input
        User user = new User(name, address, email, contactNumber, emergencyContact);
        Manager manager = new Manager();

        // User creates enquiries
        user.createEnquiries(manager);
        // ===================================================



        
        // ===================================================
        // instructor registers for a course         

        // System prompts for instructor details
        System.out.println("Enter Instructor details:");
        System.out.print("Address: ");
        String address2 = scanner.nextLine();
        System.out.print("Email: ");
        String email2 = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Login: ");
        String login = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();


        // Creates an Instructor object with all the provided user input
        Instructor instructor = new Instructor(address, email, phoneNumber, login, password);

        // System prompts for course details
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
