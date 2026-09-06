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

    public void calculateTuition(){
        for(int i = 0; i < courseCount; i++){
            System.out.println("Course: " + courses[i].getCourseCode() + " Tuition: " + courses[i].calculateTuition());
        }
    }

    public void displaySchedule(){
        System.out.print(this.name);
        int c = 0;
        for(int i = 0; i < courseCount; i++){
            c += courses[i].getCredits();
        }
        System.out.println("Credits: " + c);
        System.out.println("Tuition: ");
        calculateTuition();
    }


}
