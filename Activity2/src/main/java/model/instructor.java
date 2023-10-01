import java.sql.Date;

public class instructor extends user {
    
    private String instructorID;
    protected String login;
    protected String password;

    public instructor(String name, String address, String dob, String email, String contactNumber, String emergencyContact,
                        String instructorID, String login, String password) {

        super(name, address, dob, email, contactNumber, emergencyContact);
        this.instructorID = instructorID;
        this.login = login;
        this.password = password;

    }
    


    
}
