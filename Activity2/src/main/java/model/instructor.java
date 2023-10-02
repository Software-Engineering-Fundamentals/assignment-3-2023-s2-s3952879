import java.nio.charset.Charset;
import java.util.Random;
import java.util.ArrayList;
import java.util.Date;

class Instructor {
    private String address;
    private String email;
    private String phoneNumber;
    private ArrayList<String> courses = new ArrayList<>();
    private String login;
    private String password;
    
    public Instructor(String address, String email, String phoneNumber, String login, String password) {
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.login = login;
        this.password = password;
    }

    public void registerCourse(Course course) {
        Registration registration = new Registration(this, course);
        double feeAmount = registration.checkFee(this);
        boolean isPaid = registration.checkPaymentStatus();

        if (isPaid) {
            System.out.println("Fee calculated: $" + feeAmount);
            registration.completeRegistration();
        } else {
            System.out.println("Fee calculation failed.");
        }
    } 

    // getter and setter methods
    // address
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    // email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    //phone number
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // generate login and setter
    public String generateLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    // generate password and setter
    public String generatePassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

