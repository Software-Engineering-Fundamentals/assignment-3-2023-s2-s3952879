import java.sql.Date;

public class manager extends user{
    
    private String managerID; //unique ID to identify this manager
    protected String login; //this manager's username
    protected String password; //this manager's password

    // constructor
    public manager(String name, String address, String dob, String email, String contactNumber, String emergencyContact,
                        String managerID, String login, String password) {
        // as manager is built on user, also perform the user constructor
        super(name, address, dob, email, contactNumber, emergencyContact);
        this.managerID= managerID;
        this.login = login;
        this.password = password;

    }
    
    // provide response then post the answer
    public void manageEnquiry(enquiry query) {
        query.setResponse("that question was easily answered if you had simply studied the week 107 " +
                "content for the course that test pertains to");
        query.answer();
    }

    // close given enquiry
    public void closeEnquiry(enquiry query) {
        query.close();
    }

}
