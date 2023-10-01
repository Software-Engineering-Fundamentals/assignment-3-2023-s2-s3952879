public class enquiry {
    private String enquiryID;
    private String contents; // question asked by user
    private String response;
    private boolean open;
    private String userID; // linked to x user

    // constructor
    public enquiry(String contents, String userID) {
        this.enquiryID = "enquiryID";
        this.contents = contents;
        this.open = true;
        this.userID = userID;
        this.response = "";
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
