public class Course{
    String courseCode;
    String title;
    int credits;
    double tuitionPerCredit;

    public Course(String cc,String t, int c, double tpc){
        this.courseCode = cc;
        this.title = t;
        this.credits = c;
        this.tuitionPerCredit = tpc;
    }

    public String getCourseCode(){return courseCode;}
    public String getTitle(){return title;}
    public int getCredits(){return credits;}
    public double getTuitionPerCredit(){return tuitionPerCredit;}
    public double calculateTuition(){return credits*tuitionPerCredit;}

    public void displayInfo(){System.out.println(courseCode+ 
    "\n" + title + "\n" + credits + "\n" + tuitionPerCredit);}

    public int getWeeklyHours(){
        if (this instanceof OnlineCourse) {
            return credits;
        } else if (this instanceof LabCourse) {
            return credits + 2;
        } else if (this instanceof IndependentStudy) {
            return credits * 2;
        }
        return credits;
    }
}