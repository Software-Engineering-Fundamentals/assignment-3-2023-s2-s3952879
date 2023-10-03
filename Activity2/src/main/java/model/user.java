
import java.util.*;

class User {
    private String name;
    private String address;
    private String email;
    private String contactNumber;
    private String emergencyContact;
    private List<Enquiries> enquiries;

    public User(String name, String address, String email, String contactNumber, String emergencyContact) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.contactNumber = contactNumber;
        this.emergencyContact = emergencyContact;
        this.enquiries = new ArrayList<>();
    }

    // create enquiry method

    public void createEnquiries(Manager manager) {
        Scanner scanner = new Scanner(System.in);
        
        // multiple enquiries can be made until the user types 'exit'
        while (true) {
            System.out.print("Enter your enquiry (or type 'exit' to finish): ");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }
            Enquiries enquiry = new Enquiries(userInput);
            enquiry.setUser(this);
            enquiries.add(enquiry);
        }

        // manager is notified about the enquiry and manages 
        manager.manageEnquiries(enquiries);
    }

    // getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public List<Enquiries> getEnquiries() {
        return enquiries;
    }

    public void setEnquiries(List<Enquiries> enquiries) {
        this.enquiries = enquiries;
    }
}
