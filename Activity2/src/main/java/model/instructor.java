import java.sql.Date;

public class instructor extends user {
    
    private String instructorID;
    protected String login;
    protected String password;

    public instructor(String ID, String name, String address, String dob, String email, String contactNumber, String emergencyContact) {

        super(name, address, dob, email, contactNumber, emergencyContact);
        this.instructorID = ID;
 
    }

    public String getInstructorID() {
        return this.instructorID;
    }

    // sets login
    public void setLogin(String login) {
        this.login = login;
    }

    // sets password
    public void setPass(String password) {
        this.password = password;
    }

    // generate random ID for instructor
    public String generateLogin() {
        String login = "test";
        
        return login;

    }
    // generate random Password for instructor
    public String generatePass() {
        String password = "test";

        return password;

    }
}

