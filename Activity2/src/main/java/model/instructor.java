import java.nio.charset.Charset;
import java.util.Random;
import java.util.ArrayList;

public class instructor extends user {
    
    private String instructorID;
    protected String paymentInfo;
    protected String login;
    protected String password;
    private ArrayList<String> course = new ArrayList<String>();

    public instructor(String ID, String name, String address, String dob, String email, String contactNumber, String emergencyContact) {

        super(name, address, dob, email, contactNumber, emergencyContact);
        this.instructorID = ID;
 
    }
    // getter methods for instructorID, login, password
    public String getInstructorID() {
        return this.instructorID;
    }
    public String getLogin() {
        return this.login;
    }
    public String getPassword() {
        return this.password;
    }

    // adds course to instructor
    public void addCourse(String courseID) {
        this.course.add(courseID);
    }

    // sets login
    public void setLogin(String login) {
        this.login = login;
    }

    // sets password
    public void setPass(String password) {
        this.password = password;
    }
        
    public void setPayment(String payment) {
        this.paymentInfo = payment;
    }

    // generate random ID for instructor
    public String generateLogin() {
        // alphanumberic 10 digit string builder  
        char[] array ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        StringBuilder random = new StringBuilder();

        for(int i =0; i < 10; i++) {
            int index = (int) (Math.random()*array.length);
            random.append(array[index]);
        }
        String login = random.toString();

        return login;
    }

    // generate random Password for instructor
    public String generatePass() {
        // alphanumberic 10 digit string builder  
        char[] array ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        StringBuilder random = new StringBuilder();

        for(int i =0; i < 10; i++) {
            int index = (int) (Math.random()*array.length);
            random.append(array[index]);
        }
        String password = random.toString();

        return password;
    }
}

