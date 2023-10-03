
public class manager{
    
    private String managerID; //unique ID to identify this manager
    private String login; //this manager's username
    private String password; //this manager's password
    private String name;

    // constructor
    public manager(String managerID, String name, String login, String password) {
        this.managerID= managerID;
        this.login = login;
        this.password = password;
        this.name = name;
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
