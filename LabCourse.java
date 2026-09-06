public class LabCourse extends Course{
    double labFee;

    public LabCourse(String cc,String t, int c, double tpc,double lf){
        super(cc, t, c, tpc);
        this.labFee = lf;
    }

    @Override
    public double calculateTuition() {return credits * tuitionPerCredit + labFee;}

    @Override
    public void displayInfo(){
        System.out.println(courseCode + " - " + title);
        System.out.println("Type: Lab Course");
        System.out.println("Credits: " + credits);
        System.out.println("Lab Fee: " + labFee);
        System.out.println("Tuition: " + calculateTuition());
    }

    @Override
    public int getWeeklyHours() {return credits + 2;}
}