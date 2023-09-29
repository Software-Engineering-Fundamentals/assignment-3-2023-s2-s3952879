public class course {
    
    private String courseID;
    private String courseName;
    private String courseCategory;
    private String courseIntro;
    private String coursePrice;
    private String courseDuration;
    private boolean refundAvailable;

    public course(String courseID, String courseName, String courseCategory, String courseIntro,
                    String coursePrice, String courseDuration, boolean refundAvailable) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseCategory = courseCategory;
        this.courseIntro = courseIntro;
        this.coursePrice = coursePrice;
        this.courseDuration = courseDuration;
        this.refundAvailable = refundAvailable;
        
    }

}

