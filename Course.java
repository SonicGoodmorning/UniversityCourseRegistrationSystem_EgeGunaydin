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

    public void displayInfo(){
        System.out.println(courseCode + " - " + title);
        System.out.println("Credits: " + credits);
        System.out.println("Tuition: " + calculateTuition());
    }

    public int getWeeklyHours(){
        return credits;
    }
}