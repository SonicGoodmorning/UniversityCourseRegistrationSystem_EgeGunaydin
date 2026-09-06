public class OnlineCourse extends Course{
    double technologyFee;


    public OnlineCourse(String cc,String t, int c, double tpc,double tf){
        super(cc, t, c, tpc);
        this.technologyFee = tf;
    }

    @Override
    public double calculateTuition(){return credits * tuitionPerCredit + technologyFee;}

    @Override
    public void displayInfo(){
        System.out.println(courseCode + " - " + title);
        System.out.println("Type: Online Course");
        System.out.println("Credits: " + credits);
        System.out.println("Technology Fee: " + technologyFee);
        System.out.println("Tuition: " + calculateTuition());
    }

    @Override
    public int getWeeklyHours(){return credits;}

}