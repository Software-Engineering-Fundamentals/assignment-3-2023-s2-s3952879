public class registration {

    private Instructor instructor;
    private course course;

    public registration(Instructor instructor, course course){
      this.instructor =instructor;
      this.course = course;
    }
    
    public double checkFee(Instructor instructor) {
        Fee fee = new Fee(123, 50.00);
        return fee.calculateFee(instructor);
    }

    public boolean checkPaymentStatus(){
      Fee fee = new Fee(123, 50.00);
      return fee.verifyPayment();
    }

    public void completeRegistration() {
        System.out.println("Registration completed successfully.");
    }
    
}
