class CourseBase {
    String courseName;
    int duration; // in days

    CourseBase(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayCourse() {
        System.out.println("Course Name: " + courseName + ", Duration: " + duration + " days");
    }
}

class OnlineCourseInfo extends CourseBase {
    String platform;
    boolean isRecorded;

    OnlineCourseInfo(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayCourse() {
        super.displayCourse();
        System.out.println("Platform: " + platform + ", Recorded: " + isRecorded);
    }
}

class PaidOnlineCourseInfo extends OnlineCourseInfo {
    double fee;
    double discount; // percentage

    PaidOnlineCourseInfo(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void displayCourse() {
        super.displayCourse();
        double finalFee = fee - (fee * discount / 100);
        System.out.println("Fee: INR " + fee + ", Discount: " + discount + "%, Final Fee: INR " + finalFee);
    }
}

public class CourseHierarchyDemo {
    public static void main(String[] args) {
        PaidOnlineCourseInfo paidCourse = new PaidOnlineCourseInfo("Java Full Stack", 30, "Udemy", true, 15000, 10);
        paidCourse.displayCourse();
    }
}
