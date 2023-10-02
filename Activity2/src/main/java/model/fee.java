import java.sql.Date;

public class fee {
    private String ID;
    private double amount;
    private double commissionFee;
    private Date dob;
    private boolean isStudent; // 1 = student, 0 = instructor


    public fee(String ID) {
        this.ID = ID;
    }   

    // instructor or student test, 1 for instructor, 0 for student
    public boolean instructorOrStudent(user User){ 
        if (User instanceof instructor) {
            return true;
        } else {
            return false;
        }
    }

    // instructor ID will be 10 digits long, and all students will be 6 digits long
    public double calculateFee(boolean test, double coursePrice) {
        if(test = true) {
            return 50;
        } else {
            this.amount = coursePrice;
            return coursePrice;
        }
    }   
    public double calculateComission(double coursePrice) {
        return (0.02*coursePrice);
    }

    public String payFee() {
        String todaysDate = "20/20/2023";
        
        return todaysDate;
    }
}
