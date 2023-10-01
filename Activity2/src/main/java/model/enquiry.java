import java.util.Random;

public class enquiry {
    private String enquiryID;
    private String contents; // question asked by user
    private String response;
    private boolean open;
    private String userID; // linked to x user

    // constructor
    public enquiry(String contents, String userID) {
        this.enquiryID = generateEnquiryID();
        this.contents = contents;
        this.open = true;
        this.userID = userID;
        this.response = "";
    }

    private String generateEnquiryID() {
        Random rng = new Random(3952879);
        String ID = Integer.toString(rng.nextInt(10000));
        return ID;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public void answer(){
        System.out.println("The manager has respoded to your enquiry with the answer: " + response);
    }

    public void close() {
        System.out.println("this enquiry has been closed");
    }
}
