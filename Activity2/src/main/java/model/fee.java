import java.util.Date;

class fee {
    private int ID;
    private double amount;

    public fee(int ID, double amount) {
        this.ID = ID;
        this.amount = amount;
    }

    //calculator fee given instructor variable
    public double calculateFee(Instructor instructor) {
        return amount;
    }
    // payment verification, set to true as default which is working
    public boolean verifyPayment() {
        return true;
    }
    // date recorded for payment of fee 
    public Date payFee() {
        return new Date();
    }

    // getter and setter methods
    // ID
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    // amount
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
