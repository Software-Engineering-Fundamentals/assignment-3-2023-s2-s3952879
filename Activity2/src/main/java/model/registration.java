public class registration {

    private Instructor instructor;
    private course course;

    public registration(Instructor instructor, course course){
      this.instructor =instructor;
      this.course = course;
    }
    
    // method to calcultae fee amount
    public double checkFee(Instructor instructor) {
        fee Fee = new fee(123, 50.00);
        return Fee.calculateFee(instructor);
    }

    // method to verify payment status
    public boolean checkPaymentStatus(){
      fee Fee = new fee(123, 50.00);
      return Fee.verifyPayment();
    }

    public void completeRegistration() {
        System.out.println("Registration completed successfully.");
    }
    public void failRegistration() {
        System.out.println("Registration failed.");
    }
}
