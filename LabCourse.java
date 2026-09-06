public class LabCourse extends Course{
    double labFee;

    public LabCourse(String cc,String t, int c, double tpc,double lf){
        super(cc, t, c, tpc);
        this.labFee = lf;
    }

    @Override
    public double calculateTuition() {return credits * tuitionPerCredit + labFee;}

    public void displayInfo(){System.out.println(courseCode+ 
    "\n" + title + "\n" + credits + "\n" + tuitionPerCredit + "\n" + labFee);}

    @Override
    public int getWeeklyHours() {return credits + 2;}
}