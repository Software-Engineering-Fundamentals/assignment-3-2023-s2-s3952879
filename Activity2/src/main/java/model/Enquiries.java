import java.util.*;

class Enquiries {
    private static int nextEnquiryID = 1;
    private int enquiryID;
    private String contents;
    private boolean status;
    private User user;

    public Enquiries(String contents) {
        this.enquiryID = nextEnquiryID++;
        this.contents = contents;
        this.status = false; // Initially set to open
    }

    public void answer() {
        // Logic to answer the enquiry proactively
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        // Send response to the user
        User user = getUser();
        System.out.println("Response sent to " + user.getName() + ": " + response);
    }

    public void close() {
        // Logic to close the enquiry
        this.status = true; // Set status to closed
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public int getEnquiryID() {
        return enquiryID;
    }

    public String getContents() {
        return contents;
    }
}
