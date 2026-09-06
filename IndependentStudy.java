public class IndependentStudy extends Course {
    double supervisionFee;

    public IndependentStudy(String cc,String t, int c, double tpc,double sf){
        super(cc, t, c, tpc);
        this.supervisionFee = sf;
    }
    @Override
    public double calculateTuition() {return credits*tuitionPerCredit+supervisionFee;}
    
    @Override 
    public void displayInfo(){
        System.out.println(courseCode + " - " + title);
        System.out.println("Type: Independent Study");
        System.out.println("Credits: " + credits);
        System.out.println("Supervision Fee: " + supervisionFee);
        System.out.println("Tuition: " + calculateTuition());
    }

    @Override 
    public int getWeeklyHours() {return credits*2;}
}
