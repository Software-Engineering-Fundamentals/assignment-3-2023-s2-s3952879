public class course {
    
    private String courseID;
    private String courseName;
    private String courseCategory;
    private String courseIntroduction;
    private double coursePrice;
    private int courseDuration;
    private boolean refundAvailable;


    // constructor, refundAvailable true = yes, false = no
    public course(String courseID, String courseName, String courseCategory, String courseIntroduction, double coursePrice, int courseDuration,  boolean refundAvailable) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseCategory = courseCategory;
        this.courseIntroduction = courseIntroduction;
        this.coursePrice = coursePrice;
        this.courseDuration = courseDuration;
        this.refundAvailable = refundAvailable;
    }


    // getters and setter methods
    // course IDs
    public String getCourseID() {
        return courseID;
    }
    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }
    // course name
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    //course category
    public String getCourseCategory() {
        return courseCategory;
    }
    public void setCourseCategory(String courseCategory) {
        this.courseCategory = courseCategory;
    }
    //course intro
    public String getCourseIntroduction() {
        return courseIntroduction;
    }
    public void setCourseIntroduction(String courseIntroduction) {
        this.courseIntroduction = courseIntroduction;
    }
    // course price
    public double getCoursePrice() {
        return coursePrice;
    }
    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }
    //course duration
    public int getCourseDuration() {
        return courseDuration;
    }
    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }
    // refund available
    public boolean isRefundAvailable() {
        return refundAvailable;
    }
    public void setRefundAvailable(boolean refundAvailable) {
        this.refundAvailable = refundAvailable;
    }



}

