import java.util.Random;

public class enquiry {
    private String enquiryID; // a unique ID to identify this enquiry
    private String contents; // question asked by user
    private String response; // the respose put in place by the manager
    private boolean open;   // represents wether or not this enquiry is still open (true = open, false = closed)
    private String userID; // links enquiry back to the user which created it (currently linked to Email)

    // constructor
    public enquiry(String contents, String userID) {
        this.enquiryID = generateEnquiryID();
        this.contents = contents;
        this.open = true; // by default, an equiry is open
        this.userID = userID;
        this.response = ""; //a response is later added in by the manager

        // output the enquiry's key data so the current ID and content are shown
        System.out.println("enquiry " + enquiryID + " has been created");
        System.out.println("\"" + contents + "\"");
    }

    // create a random EnquiryID
    private String generateEnquiryID() {
        Random rng = new Random(3952879);
        String ID = Integer.toString(rng.nextInt(10000));
        return ID;
    }

    // response setter
    public void setResponse(String response) {
        this.response = response;
    }

    // output the response given by Manager
    public void answer(){
        System.out.println("The manager has respoded to enquiry " + enquiryID + " with the answer: " + response);
    }

    // close this enquiry
    public void close() {
        System.out.println("enquiry " + enquiryID + "has been closed");
    }
}
