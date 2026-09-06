public class OnlineCourse extends Course{
    double technologyFee;


    public OnlineCourse(String cc,String t, int c, double tpc,double tf){
        super(cc, t, c, tpc);
        this.technologyFee = tf;
    }

    @Override
    public double calculateTuition(){return credits * tuitionPerCredit + technologyFee;}

    @Override
    public void displayInfo(){System.out.println(courseCode+ 
    "\n" + title + "\n" + credits + "\n" + tuitionPerCredit + technologyFee);}

}