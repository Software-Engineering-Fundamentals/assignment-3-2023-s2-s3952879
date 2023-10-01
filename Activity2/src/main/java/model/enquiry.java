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

    public void answer(String answer){
        System.out.println("The manager has respoded to your enquiry with the answer: " + answer);
    }

    public void close() {
        System.out.println("this enquiry has been closed");
    }
}
