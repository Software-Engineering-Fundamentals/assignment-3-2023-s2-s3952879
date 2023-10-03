import java.sql.Date;

public class user {
    private String name;
    private String address;
    private String dob;
    private String email;
    private String contactNumber;
    private String emergencyContact;

    public user(String name, String address, String dob, String email, String contactNumber, String emergencyContact) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.email = email;
        this.contactNumber = contactNumber;
        this.emergencyContact = emergencyContact;


    }

    public enquiry createEnquiry(){
        enquiry query = new enquiry("How were we supposed to find the answer to q95 is test #28?", email);
        return query;
    }


}
