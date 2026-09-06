public class HybridCourse extends Course{
    double technologyFee;
    double campusFee;


    public HybridCourse(String cc,String t, int c, double tpc,double tf, double cf){
        super(cc, t, c, tpc);
        this.technologyFee = tf;
        this.campusFee = cf;
    }

    @Override
    public double calculateTuition(){return credits * tuitionPerCredit + technologyFee + campusFee;}

    @Override
    public void displayInfo(){
        System.out.println(courseCode + " - " + title);
        System.out.println("Type: Hybrid Course");
        System.out.println("Credits: " + credits);
        System.out.println("Technology Fee: " + technologyFee);
        System.out.println("Campus Fee: " + campusFee);
        System.out.println("Tuition: " + calculateTuition());
    }

}