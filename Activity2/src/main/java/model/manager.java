import java.sql.Date;

public class manager extends user{
    
    private String managerID;
    protected String login;
    protected String password;

    public manager(String name, String address, String dob, String email, String contactNumber, String emergencyContact,
                        String managerID, String login, String password) {

        super(name, address, dob, email, contactNumber, emergencyContact);
        this.managerID= managerID;
        this.login = login;
        this.password = password;

    }
    
    public void manageEnquiry(enquiry query) {
        query.setResponse("");
        query.answer();
    }

    public void closeEnquiry(enquiry query) {
        query.close();
    }

}
