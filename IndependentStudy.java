public class IndependentStudy extends Course {
    double supervisionFee;

    public IndependentStudy(String cc,String t, int c, double tpc,double sf){
        super(cc, t, c, tpc);
        this.supervisionFee = sf;
    }
    @Override
    public double calculateTuition() {return credits*tuitionPerCredit+supervisionFee;}
    
    public void displayInfo(){System.out.println(courseCode+ 
    "\n" + title + "\n" + credits + "\n" + tuitionPerCredit + "\n" + supervisionFee);}
}
