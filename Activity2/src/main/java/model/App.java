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

        // System requests payment information by user

    
        // system is generating a login and password for the instructor
        String login = newInstructor.generateLogin();
        String password = newInstructor.generatePass();

        newInstructor.setLogin(newInstructor.generateLogin());
        System.out.println(newInstructor.getLogin());
        newInstructor.setPass(newInstructor.generatePass());
        System.out.println(newInstructor.getPassword());

        // system is setting the password to the unique instructor object
        newInstructor.setLogin(login);
        newInstructor.setPass(password);
  
        // system prompts for payment
        System.out.println(newInstructor.getInstructorID());
        System.out.println("Work");

        


        // payment successful

        // payment unsuccessful
        



    }
}
