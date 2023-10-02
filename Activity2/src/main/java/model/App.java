import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // alex github test
        System.out.println("Test");
        // Lodge Enquiry


        // Manager Addresses enquiry













        // User selects Registers course 

        // user is prompted to enter their details starting with course details
        course testCourse = new course("SOFT1","Software Fundamentals", "School of Computing", "This is a course about software fundamentals", 500, "3 Months", false);
        // user provides correct details
        // assumes there is error checking for each of the details  

        // user prompted for personal details and instructor ID
        instructor newInstructor = new instructor("AZ33","Alex", "Melbourne", "01/01/2000", "test@gmail.com", "0404 000 000", "0404 000 000");
        String courseID = testCourse.getCourseID();
        newInstructor.addCourse(courseID);

        // create a fee object associtaed with instructor ID
        fee Fee = new fee(newInstructor.getInstructorID());

        // system creates a fee based on whether the user is an instructor or student
        boolean instructorCheck = Fee.instructorOrStudent(newInstructor);
        // returns 1 if instructor, returns 0 if student, provide course price to calculate
        // a student fee if necessary
        double feeAmount = Fee.calculateFee(instructorCheck,testCourse.getCoursePrice());
        
        // System REQUESTS PAYMENT information by user, user provides payment information
        newInstructor.setPayment("Credit Card: 5217 0000 0000 0000");

        // ===========================
        // After a Successful Payment
        // system is generating a login and password for the instructor
        String login = newInstructor.generateLogin();
        String password = newInstructor.generatePass();

        // sets the generated login name and password to the instructor object
        newInstructor.setLogin(login);
        newInstructor.setPass(password);
        
        // testing to see if login and password is generated correctly
        System.out.println("Your instructor details are as follows");
        System.out.println("Your login is: " + newInstructor.getLogin());
        System.out.println("Your password is: " + newInstructor.getPassword());

        // ==============================
        // If the payment is Unsuccessful it will loop back to request payment
        // If user wants to exit or cancel completely, the object will be deleted
        // and stored data removed
        testCourse = null;
        newInstructor = null;
        
        



    }
}
