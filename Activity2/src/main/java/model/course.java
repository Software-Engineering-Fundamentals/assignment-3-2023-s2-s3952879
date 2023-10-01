public class course {
    
    private String courseID;
    private String courseName;
    private String courseCategory;
    private String courseIntro;
    private double coursePrice;
    private String courseDuration;
    private boolean refundAvailable;

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

    public course(String courseName, String courseCategory, String courseIntro,
                double coursePrice, String courseDuration, boolean refundAvailable) {
    this.courseName = courseName;
    this.courseCategory = courseCategory;
    this.courseIntro = courseIntro;
    this.coursePrice = coursePrice;
    this.courseDuration = courseDuration;
    this.refundAvailable = refundAvailable;
    
    }

    public double getCoursePrice() {
        return this.coursePrice;
    }
   


}

