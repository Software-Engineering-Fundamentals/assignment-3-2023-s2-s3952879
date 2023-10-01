public class enquiry {
    private String enquiryID;
    private String contents; // question asked by user
    private String response;
    private boolean status;
    private String userID; // linked to x user

    // constructor
    public enquiry(String enquiryID, String contents, boolean status, String userID, String response) {
        this.enquiryID = enquiryID;
        this.contents = contents;
        this.status = status;
        this.userID = userID;
        this.response = response;
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
