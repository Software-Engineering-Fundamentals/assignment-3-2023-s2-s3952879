import java.util.ArrayList;

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

    // creates registration object
    // checks fee price based on current object (instructor)
    // payment verification in checkpaymentStatus
    // returned boolean is then checked for true or false payment verification
    public void registerCourse(course course) {
        registration registration = new registration(this, course);
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
        login = "TestLogin"; // customizable or randomizable login here
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    // generate password and setter
    public String generatePassword() {
        password = "TestPassword"; // customizable or randomizable login here
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

