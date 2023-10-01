import java.sql.Date;

public class fee {
    private String ID;
    private double amount;
    private double commissionFee;
    private Date dob;
    private boolean isStudent; // 1 = student, 0 = instructor


    public fee(String ID, double amount, double commissionFee, Date dob) {
        this.ID = ID;
        this.amount = amount;
        this.commissionFee = commissionFee;
        this.dob = dob;
    }   

    public void payFee() {
        
    }   
    
    public void calculateFee() {

    }
}
