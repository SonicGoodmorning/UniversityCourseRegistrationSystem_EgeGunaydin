public class Main{
    public static void main(String[] args){
        // same test as from the doc

        Student student = new Student("Alex");

        student.addCourse(
            new OnlineCourse("CSC301", "Computer Security", 3, 500, 75)
        );

        student.addCourse(
            new LabCourse("BIO210", "Biology II", 4, 500, 150)
        );

        student.addCourse(
            new IndependentStudy("CSC400", "Independent Study", 3, 500, 200)
        );

        student.displaySchedule();
    }
}