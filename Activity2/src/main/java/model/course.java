public class course {
    
    private String courseID;
    private String courseName;
    private String courseCategory;
    private String courseIntro;
    private double coursePrice;
    private String courseDuration;
    private boolean refundAvailable;
    private String instructorID;

    // constructor, refundAvailable true = yes, false = no
    public course(String courseID, String courseName, String courseCategory, String courseIntro,
                    double coursePrice, String courseDuration, boolean refundAvailable) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseCategory = courseCategory;
        this.courseIntro = courseIntro;
        this.coursePrice = coursePrice;
        this.courseDuration = courseDuration;
        this.refundAvailable = refundAvailable;

    }

    // getters 
    public double getCoursePrice() {
        return this.coursePrice;
    }
    public String getCourseID() {
        return this.courseID;
    }
    public String getInstructorID() {
        return this.instructorID;
    }
   
    // getter setter method for instructor ID
    public void setInstructor(String instructorID) {
        this.instructorID = instructorID;
    }



}

