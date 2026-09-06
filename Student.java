public class Student {
    String name;
    Course[] courses;
    int courseCount;

    public Student(String n){
        this.name = n;
        courses = new Course[5];
        courseCount = 0;
    }

    

    public void addCourse(Course c){
        if(courseCount >= courses.length){System.out.println("Can't have more than 5 Courses");}
        else{
            courses[courseCount] = c;
            courseCount++;
        }
    }

    public double calculateTotalTuition(){
        double t = 0;
        for(int i = 0; i < courseCount; i++){
            t += courses[i].calculateTuition();
        }
        return t;
    }

    public int calculateWeeklyWorkload(){
        int hours = 0;
        for(int i = 0; i<courseCount; i++){
            hours += courses[i].getWeeklyHours();
        }
        return hours;
    }

    public void displaySchedule(){
        System.out.print("Student: " + this.name);
        int c = 0;
        for(int i = 0; i < courseCount; i++){
            courses[i].displayInfo();
            System.out.println();
            c += courses[i].getCredits();
        }
        System.out.println("Total Credits: " + c);
        System.out.println("Total Tuition: " + calculateTotalTuition());

        System.out.println("Total Weekly Workload: " + calculateWeeklyWorkload() + " hours");
    }
}
