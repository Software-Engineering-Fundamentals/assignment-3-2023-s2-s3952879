import java.util.*;

class Manager {
  
    // manager manage enquiry method
    public void manageEnquiries(List<Enquiries> enquiries) {
        Scanner scanner = new Scanner(System.in);


        for (Enquiries enquiry : enquiries) {
            // Logic to manage the enquiry by the Manager
            System.out.println("Enquiry received from " + enquiry.getUser().getName() + ": " + enquiry.getContents());
            System.out.print("Do you want to respond to this enquiry now? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();
            if (response.equals("yes")) {
                // Manager reviews the enquiry contents and decides to answer       
                System.out.print("Please give your response: ");  
                enquiry.answer();
            } else {
               System.out.println("Enquiry ID " + enquiry.getEnquiryID() + " will be resolved later.");
            }
            closeEnquiry(enquiry);
        }
    }

    // enquiry is closed after a reponse has been submitted
    public void closeEnquiry(Enquiries enquiry) {
        // Logic to close the enquiry by the Manager
        enquiry.close();
        System.out.println("Enquiry ID " + enquiry.getEnquiryID() + " has been closed.");
    }
}
